package com.cg.ama.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ama.exception.UserNotFoundException;
import com.cg.ama.model.UserModel;
import com.cg.ama.service.IAdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminRestController {
	
	@Autowired
	private IAdminService adminService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserModel> getByCode(@PathVariable("userId") Long userId) throws UserNotFoundException{
		return ResponseEntity.ok(adminService.getById((userId)));
	}
}
