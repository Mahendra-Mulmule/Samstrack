package com.mah.samstrack.service.auth;

import javax.servlet.http.HttpSession;

import com.mah.samstrack.model.User;

public interface Auth_Service {

	public User login(User user);
	public void logout(HttpSession session);
	
	public int forgot_Password(User user);

}
