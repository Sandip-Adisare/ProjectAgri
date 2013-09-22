package com.vn.core;

public enum UserType {

	Administartor("Administartor"),
	NormalUser("NormalUser");
		
	private String userType;

    private UserType(String _userType) {
            this.userType = _userType;
    }
}
