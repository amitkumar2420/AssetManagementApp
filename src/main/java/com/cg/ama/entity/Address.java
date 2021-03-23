package com.cg.ama.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Address {
	
	@NotNull
	@Size(max=50)
	private String location;
	
	@Size(max=50)
	private String subLocation;
	
	@NotNull
	@Size(max=50)
	private String state;
	
	@NotNull
	@Size(max=50)
	private String country;
}
