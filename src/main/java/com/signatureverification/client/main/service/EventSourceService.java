package com.signatureverification.client.main.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signatureverification.client.main.controller.EventSourceController;
import com.signatureverification.client.main.entity.EventSource;
import com.signatureverification.client.main.model.EventSourceModel;
import com.signatureverification.client.main.model.VerificatioCountModel;
import com.signatureverification.client.main.repo.EventSourceRepository;

@Service
public class EventSourceService {
	protected Logger logger = Logger.getLogger(EventSourceService.class.getName());
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private EventSourceRepository eventSourceRepository;

	public List<EventSource> getEventSourceDetails(String status) {

		return eventSourceRepository.findByStatus(status);

	}
	
	public EventSource saveEventSourceDetails(EventSourceModel eventSourceModel) {
		EventSource eventSource = modelMapper.map(eventSourceModel, EventSource.class);
		return eventSourceRepository.save(eventSource);

	}
	
	public List<VerificatioCountModel> getAllVerifiedDataCount() {
		List<EventSource> listData= eventSourceRepository.findAll();
		
		long signatureOk=Optional.ofNullable(listData).
				orElse(Collections.emptyList()).stream().filter(d->("Yes").equals(d.getVerfied())).count();
		VerificatioCountModel signatureData=new VerificatioCountModel("Signature OK",signatureOk);
		long signatureNotOk=Optional.ofNullable(listData).
				orElse(Collections.emptyList()).stream().filter(d->("No").equals(d.getVerfied())).count();
		VerificatioCountModel signatureNotData=new VerificatioCountModel("Signature Not OK",signatureNotOk);
		long notYetVerified=Optional.ofNullable(listData).
				orElse(Collections.emptyList()).stream().filter(d->d.getVerfied()== null).count();
		VerificatioCountModel notYetVerifiedData=new VerificatioCountModel("Not yet verified",notYetVerified);
		List<VerificatioCountModel> countModelList=new ArrayList<>();
		countModelList.add(notYetVerifiedData);
		countModelList.add(signatureData);
		countModelList.add(signatureNotData);
		return countModelList;
		

	}
}
