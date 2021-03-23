package com.cg.ama.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AddressModel {
	
	@NotEmpty(message="Location cannot be empty")
    @NotNull(message="Location  cannot be omitted")
	private String location;
	
	@NotEmpty(message="subLocation cannot be empty")
    @NotNull(message="subLocation  cannot be omitted")
	private String subLocation;
	
	@NotEmpty(message="State cannot be empty")
    @NotNull(message="State cannot be omitted")
	private String state;
	
	@NotEmpty(message="Country cannot be empty")
    @NotNull(message="Country cannot be omitted")
	private String country;	
	
	public AddressModel() {
		super();
	}

	public AddressModel(
			@NotEmpty(message = "Location cannot be empty") @NotNull(message = "Location  cannot be omitted") String location,
			@NotEmpty(message = "subLocation cannot be empty") @NotNull(message = "subLocation  cannot be omitted") String subLocation,
			@NotEmpty(message = "State cannot be empty") @NotNull(message = "State cannot be omitted") String state,
			@NotEmpty(message = "Country cannot be empty") @NotNull(message = "Country cannot be omitted") String country) {
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
