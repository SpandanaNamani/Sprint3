package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.LoginRepo;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceimpl implements LoginService{
    
	@Autowired
	LoginRepo loginrepo;
	@Override
	public Login login(String email, String password) {
		// TODO Auto-generated method stub
		Login s = loginrepo.findByEmail(email);

		if (s != null) {
			if (s.getPassword().equals(password)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}
	}

}
