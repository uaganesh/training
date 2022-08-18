package com.service;

import com.bean.Login;

public class LoginService {

	public String checkLoginDetails(Login l1)
	{
		if(l1.getEmail().equals("admin@gmail.com") && l1.getPassword().equals("1234"))
				{
			         return "success";
			         
				}
		else
		{
			return "Incorrect Credentials";
		}
	}
}
