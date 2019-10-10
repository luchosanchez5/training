package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	
	List<Zone> findAllByStatus(String stat);

}
