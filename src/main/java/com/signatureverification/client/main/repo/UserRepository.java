package com.signatureverification.client.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signatureverification.client.main.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
