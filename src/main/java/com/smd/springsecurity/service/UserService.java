package com.smd.springsecurity.service;

import com.smd.springsecurity.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}