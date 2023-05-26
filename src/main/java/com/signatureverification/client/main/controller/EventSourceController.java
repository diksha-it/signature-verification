package com.signatureverification.client.main.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.signatureverification.client.main.entity.EventSource;
import com.signatureverification.client.main.model.EventSourceModel;
import com.signatureverification.client.main.service.EventSourceService;

@RestController
public class EventSourceController {

	protected Logger logger = Logger.getLogger(EventSourceController.class.getName());

	@Autowired
	private EventSourceService eventSourceService;

	@RequestMapping(value = "/fetch-event", method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<EventSource>> getEventSourcData() {
		return new ResponseEntity<>(eventSourceService.getEventSourceDetails(), HttpStatus.OK);
	}

	@RequestMapping(value = "/event-save", method = RequestMethod.POST,produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<EventSource> verifyUserDetails(@RequestBody EventSourceModel eventSourceModel) {
		return eventSourceService.getEventSourceDetails();
	}
}
