package com.signatureverification.client.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signatureverification.client.main.entity.EventSource;
import com.signatureverification.client.main.repo.EventSourceRepository;

@Service
public class EventSourceService {

	@Autowired
	private EventSourceRepository eventSourceRepository;

	public List<EventSource> getEventSourceDetails() {

		return eventSourceRepository.findAll();

	}
}
