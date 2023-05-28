package com.signatureverification.client.main.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.signatureverification.client.main.entity.EventSource;
import com.signatureverification.client.main.model.EventSourceModel;
import com.signatureverification.client.main.model.VerificatioCountModel;
import com.signatureverification.client.main.service.EventSourceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EventSourceController {

	protected Logger logger = Logger.getLogger(EventSourceController.class.getName());

	@Autowired
	private EventSourceService eventSourceService;

	@RequestMapping(value = "/fetch-event", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<EventSource>> getEventSourcData(@RequestParam String status) {
		return new ResponseEntity<>(eventSourceService.getEventSourceDetails(status), HttpStatus.OK);
	}

	@RequestMapping(value = "/event-save", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<EventSource> verifyUserDetails(@RequestBody EventSourceModel eventSourceModel) {
		return new ResponseEntity<>(eventSourceService.saveEventSourceDetails(eventSourceModel), HttpStatus.OK);
	}

	@RequestMapping(value = "/event-status-change", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<EventSource>> verifyUserDetails(@RequestBody List<EventSourceModel> list,
			@RequestParam String status) {
		return new ResponseEntity<List<EventSource>>(eventSourceService.changeStatus(list, status), HttpStatus.OK);
	}

	@RequestMapping(value = "/verify-count", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<VerificatioCountModel>> getAllVerifiedDataCount() {
		return new ResponseEntity<>(eventSourceService.getAllVerifiedDataCount(), HttpStatus.OK);
	}
}
