package com.signatureverification.client.main.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.signatureverification.client.main.entity.UserDetails;
import com.signatureverification.client.main.model.UserDetailsModel;
import com.signatureverification.client.main.service.UserService;

@RestController
public class UserController {

	protected Logger logger = Logger.getLogger(UserController.class.getName());

	@Autowired
	private UserService userService;

	@RequestMapping(value="/fetch-user", method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<UserDetails>> getUserDetails() {
		return new ResponseEntity<>(userService.getUserDetails(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/save-user", method = RequestMethod.POST,produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<UserDetails> verifyUserDetails(@RequestBody UserDetailsModel userDetails) {
		return userService.getUserDetails();
	}
}
