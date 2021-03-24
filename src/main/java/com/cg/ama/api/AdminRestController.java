package com.cg.ama.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ama.exception.DuplicateEntryException;
import com.cg.ama.exception.InvalidUserDetailsException;
import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;
import com.cg.ama.service.IAdminUserService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	private IAdminUserService adminService;
	
	@GetMapping("/users/get/{userId}")
	public ResponseEntity<UserModel> getUsersByCode(@PathVariable("userId") Long userId) throws UserNotFoundException{
		return ResponseEntity.ok(adminService.getUserById((userId)));
	}
	
	@GetMapping("/users/get/all")
	public ResponseEntity<List<UserModel>> getAllUsers() throws UserNotFoundException{
		return ResponseEntity.ok(adminService.getUsers());
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserModel> createUser(@RequestBody @Valid UserModel userModel, BindingResult result) throws InvalidUserDetailsException, DuplicateEntryException {
		
		if (result.hasErrors()) {
			throw new InvalidUserDetailsException("Not Created");
		}
		
		return ResponseEntity.ok(adminService.addUser(userModel));
	}
	
	@DeleteMapping("/users/delete/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("userId") Long userId) throws UserNotFoundException {
		return ResponseEntity.ok(adminService.deleteUserById(userId));
	}
	
}
