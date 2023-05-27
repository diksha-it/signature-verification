package com.signatureverification.client.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signatureverification.client.main.entity.SignatureVerificationUser;

public interface UserRepository extends JpaRepository<SignatureVerificationUser, Long> {

	SignatureVerificationUser findByUserName(String userName);
}
