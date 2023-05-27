package com.signatureverification.client.main.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.signatureverification.client.main.model.UserDetailsModel;
import com.signatureverification.client.main.service.CustomUserDetailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {

	protected Logger logger = Logger.getLogger(UserController.class.getName());

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@RequestMapping(value = "/user-save", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserDetailsModel> verifyUserDetails(@RequestBody UserDetailsModel userDetailsModel) {
		return new ResponseEntity<>(customUserDetailService.saveUser(userDetailsModel), HttpStatus.OK);
	}
}
