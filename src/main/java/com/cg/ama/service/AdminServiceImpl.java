package com.cg.ama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;
import com.cg.ama.repo.UserRepo;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private EMParser parser;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserModel getById(Long id) throws UserNotFoundException {
		return parser.parse((userRepo.findById(id).orElse(null)));
	}
	 
}
