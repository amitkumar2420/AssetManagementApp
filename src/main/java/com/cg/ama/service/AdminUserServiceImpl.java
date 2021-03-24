package com.cg.ama.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ama.exception.DuplicateEntryException;
import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;
import com.cg.ama.repo.UserRepo;

@Service
public class AdminUserServiceImpl implements IAdminUserService {

	@Autowired
	private EMParser parser;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserModel getUserById(Long id) throws UserNotFoundException {
		if (!userRepo.existsById(id)) {
			throw new UserNotFoundException("No user present with the given ID");
		}
		return parser.parse((userRepo.findById(id).orElse(null)));
	}
	
	@Transactional
	@Override
	public UserModel addUser(UserModel userModel) throws DuplicateEntryException {
		
		if(userModel != null) {
			if (userRepo.existsById(userModel.getUserId())) {
				throw new DuplicateEntryException("User already present in DB.");
			}
			userModel = parser.parse((userRepo.save(parser.parse(userModel))));
		}
		return userModel;
	}

	@Override
	public List<UserModel> getUsers() throws UserNotFoundException {
		if (userRepo.count() == 0) {
			throw new UserNotFoundException("No user present with the given ID");
		}
		return userRepo.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}

	@Override
	public String deleteUserById(Long id) throws UserNotFoundException {
		if (!userRepo.existsById(id)) {
			throw new UserNotFoundException("No user present with the given ID");
		}
		userRepo.deleteById(id);
		return "User Deleted";
	}

}
