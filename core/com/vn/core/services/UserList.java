package com.vn.core.services;

import java.util.HashMap;

import com.vn.core.AppUtil;
import com.vn.core.User;

/**
 * @author viraj patil
 *
 */
public class UserList {
	private HashMap<String, User> userList;
//	private UserList object = new UserList();
	
	public UserList() {
	   this.userList = new HashMap();
	}
	
	public static UserList getInstance(){
	UserList object = null;
		if(object == null) {
			object = new UserList();
		}
		return object;
	}

	public HashMap<String, User> getUserList() {
		return userList;
	}
	
	public boolean addUser(User user) {
		if (user == null || userList.containsKey(user.getEmailId())) {
			return false;
		}
		userList.put(user.getEmailId(), user);
		return true;
	}
	
	public User getUserByEmailId(String emailId) {
		User user = null;
	   if(!AppUtil.isEmpty(emailId) && userList.containsKey(emailId)) {
		   user = userList.get(emailId);
		   return user;
	   }
	   return user;
	}
	
	public boolean deleteUser(String emailId) {
		if (!AppUtil.isEmpty(emailId) || userList.containsKey(emailId)) {
			userList.remove(emailId);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		UserList list=new UserList();
	}
}
