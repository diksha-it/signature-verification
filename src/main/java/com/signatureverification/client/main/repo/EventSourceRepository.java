package com.signatureverification.client.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signatureverification.client.main.entity.EventSource;

public interface EventSourceRepository extends JpaRepository<EventSource, String> {
	
	List<EventSource> findByStatus(String status);
}
