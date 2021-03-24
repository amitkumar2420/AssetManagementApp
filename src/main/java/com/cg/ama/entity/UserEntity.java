package com.cg.ama.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_type")
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(long userId, String userName, String userPassword, UserType userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}


	public UserEntity(String userName, String userPassword, UserType userType) {
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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public long getUserId() {
		return userId;
	}
	
	
}
