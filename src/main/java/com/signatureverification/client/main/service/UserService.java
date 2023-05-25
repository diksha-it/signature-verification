package com.signatureverification.client.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signatureverification.client.main.entity.UserDetails;
import com.signatureverification.client.main.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserDetails> getUserDetails() {

		return userRepository.findAll();

	}
}
