package com.mah.samstrack.dao.user;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.mah.samstrack.model.Branch;
import com.mah.samstrack.model.User;

public interface User_Dao {
	public  Serializable addUser(User user);
	public List<User> getAllUser();
	public List<User> getBranchUser(HttpSession httpSession);
	public User getUser(int id);
	public void updateUser(User user);
	public void deleteUser(int user_id);
}
