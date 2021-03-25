package com.cg.ama.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserModel {
	
	private long userId;
	
	@NotNull(message="user name cannot be null")	
	@NotBlank(message="user name cannot be blank")
	private String userName;
	
	@NotNull(message="user password cannot be null")	
	@NotBlank(message="user password cannot be blank")
	private String userPassword;
	
	@NotNull(message="user type cannot be null")	
	@NotBlank(message="user type cannot be blank")
	private String userType;

	public UserModel() {
		super();
	}
	
	
	public UserModel(long userId, String userName, String userPassword, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}


	public UserModel( String userName, String userPassword, String userType) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
//	@JsonIgnore
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public long getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "UserModel []";
	}
	
}
