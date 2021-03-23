package com.cg.ama.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
@Table(name="addresses")
public class AddressEntity {
	
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

	public AddressEntity() {
		super();
	}

	public AddressEntity(@NotNull @Size(max = 50) String location, @Size(max = 50) String subLocation,
			@NotNull @Size(max = 50) String state, @NotNull @Size(max = 50) String country) {
		super();
		this.location = location;
		this.subLocation = subLocation;
		this.state = state;
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSubLocation() {
		return subLocation;
	}

	public void setSubLocation(String subLocation) {
		this.subLocation = subLocation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
