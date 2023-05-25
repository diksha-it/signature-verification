package com.signatureverification.client.main.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signatureverification.client.main.entity.UserDetails;
import com.signatureverification.client.main.service.UserService;

@RestController("/userDetails")
public class SignatureVerificationController {

	protected Logger logger = Logger.getLogger(SignatureVerificationController.class.getName());

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserDetails> getUserDetails() {
		return userService.getUserDetails();
	}
}
