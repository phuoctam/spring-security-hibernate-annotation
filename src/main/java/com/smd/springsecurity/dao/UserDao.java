package com.smd.springsecurity.dao;

import com.smd.springsecurity.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

