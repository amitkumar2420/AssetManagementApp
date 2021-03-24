package com.cg.ama.service;

import org.springframework.stereotype.Service;
import com.cg.ama.entity.UserEntity;
import com.cg.ama.entity.UserType;
import com.cg.ama.model.UserModel;


@Service
public class EMParser {
	
//	@Autowired
//	private UserRepo userRepo;
	
	public UserEntity parse(UserModel source) {
		return source==null?null:
			new UserEntity(source.getUserName(), source.getUserPassword(), UserType.valueOf(source.getUserType()));
	}
	
	public UserModel parse(UserEntity source) {
		return source==null?null:
			new UserModel(source.getUserName(), source.getUserPassword(), String.valueOf(source.getUserType()));
	}
	
	
}
