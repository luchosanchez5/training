package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
    @SequenceGenerator(name = "LOC_SEQ", sequenceName = "LOC_SEQ", initialValue = 1, allocationSize=100)
    @GeneratedValue(strategy = SEQUENCE, generator = "LOC_SEQ")
	private int id;
	private String descLocation;
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescLocation() {
		return descLocation;
	}
	
	public void setDescLocation(String descLocation) {
		this.descLocation = descLocation;
	}
	
	

}
