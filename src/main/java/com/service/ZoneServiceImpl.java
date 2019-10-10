package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Zone;
import com.repository.ZoneRepository;

@Service("zoneService")
public class ZoneServiceImpl implements ZoneService {

	
	@Autowired
	private ZoneRepository zoneRep;
	
	@Override
	public List<Zone> findAllActives() {
		// TODO Auto-generated method stub
		List<Zone> lis = zoneRep.findAllByStatus("0");
		return lis;
	}

}
