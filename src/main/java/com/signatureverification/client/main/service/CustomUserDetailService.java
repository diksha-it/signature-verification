package com.signatureverification.client.main.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.signatureverification.client.main.entity.SignatureVerificationUser;
import com.signatureverification.client.main.model.UserDetailsModel;
import com.signatureverification.client.main.repo.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository customerRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final SignatureVerificationUser customer = customerRepository.findByUserName(username);
		if (customer == null) {
			throw new UsernameNotFoundException(username);
		}
		UserDetails user = User.withUsername(customer.getUserName()).password(customer.getUserPwd()).authorities("USER")
				.build();
		return user;
	}
	
	
	public UserDetailsModel saveUser(UserDetailsModel user) {
		String passwd = user.getUserPwd();
		String encodedPasswod = passwordEncoder.encode(passwd);
		user.setUserPwd(encodedPasswod);
		SignatureVerificationUser entity = modelMapper.map(user, SignatureVerificationUser.class);
		entity = customerRepository.save(entity);
		return user;
	}
}
