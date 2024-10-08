package com.thekiranacademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thekiranacademy.dao.LoginDAO;
import com.thekiranacademy.entity.User;

@Service
public class LoginService 
{
	@Autowired
	public LoginDAO dao;
	
	public boolean validate(User userFromBrowser)
	{
		String dbpassword=dao.getPasswordFromDabase(userFromBrowser.getUsername());
		
		if(dbpassword.equals(userFromBrowser.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
