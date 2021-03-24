package com.cg.ama.service;

import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;

public interface IAdminService {
	UserModel getById(Long id) throws UserNotFoundException;
}
