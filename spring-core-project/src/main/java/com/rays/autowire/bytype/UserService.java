package com.rays.autowire.bytype;

public class UserService {
	
	private UserDAOInt userdaoInt;
	
	
	public void setUserdaoInt(UserDAOInt userdaoInt) {
		this.userdaoInt = userdaoInt;
	}
	
	public void testAdd() {
		userdaoInt.add();
	}
	
}