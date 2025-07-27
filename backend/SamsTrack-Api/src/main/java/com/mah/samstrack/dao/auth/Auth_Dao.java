package com.mah.samstrack.dao.auth;

import javax.servlet.http.HttpSession;

import com.mah.samstrack.model.User;

public interface Auth_Dao {
	public User login(User user);
	public void logout(HttpSession session);
	
	public int forgot_Password(User user);
	
}
