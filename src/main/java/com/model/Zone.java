package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Zone {

	@Id
    @SequenceGenerator(name = "ZON_SEQ", sequenceName = "ZON_SEQ", initialValue = 1, allocationSize=100)
    @GeneratedValue(strategy = SEQUENCE, generator = "ZON_SEQ")
	private int id;
	private String descZone;
	private String status;
	@ManyToOne
	@JoinColumn(name="id_location",referencedColumnName = "id")
	private Location location;
	
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescZone() {
		return descZone;
	}
	
	public void setDescZone(String descZone) {
		this.descZone = descZone;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
