package com.vn.core;

/**
 * @author viraj patil
 *
 */
public class User {
	private String username;
	private String password;
	private String emailId;
	private String phoneNo;
	private String userType;
	private String gender;


	public User(String _username, String _password, String _emailId,
			String _phoneNo, String _userType, String _gender) {
		super();
		this.username = _username;
		this.password = _password;
		this.emailId = _emailId;
		this.phoneNo = _phoneNo;
		this.userType = _userType;
		this.gender = _gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		UserList list=new UserList();
	}

}
