package com.signatureverification.client.main.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.signatureverification.client.main.entity.EventSource;

public interface EventSourceRepository extends JpaRepository<EventSource, String> {

	List<EventSource> findByStatus(String status);

	@Transactional
	@Modifying
	@Query(value = "UPDATE event_source u set status =:status ,updated_by=:updated_by,updated_on=:updated_on where u.business_key = :business_key", nativeQuery = true)
	void updateEventStatus(@Param("status") String status, @Param("business_key") String business_key,
			@Param("updated_by") String updated_by,@Param("updated_on") Date date);
}
