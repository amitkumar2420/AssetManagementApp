package com.cg.ama.service;

import java.util.List;

import com.cg.ama.exception.DuplicateEntryException;
import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;

public interface IAdminUserService {
	UserModel getUserById(Long id) throws UserNotFoundException;
	UserModel addUser(UserModel user) throws DuplicateEntryException;
	List<UserModel> getUsers() throws UserNotFoundException;
	String deleteUserById(Long id) throws UserNotFoundException;
}
