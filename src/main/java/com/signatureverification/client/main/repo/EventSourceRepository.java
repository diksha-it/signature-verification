package com.signatureverification.client.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signatureverification.client.main.entity.EventSource;

public interface EventSourceRepository extends JpaRepository<EventSource, String> {
}
