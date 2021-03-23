package com.cg.ama.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Warehouse {
	
	@Id
	@Column(name="wh_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long whId;
	
	@Column(name="mgr_id")
	private long mgrId;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy="warehouse")
	private List<Asset> assets; 
}
