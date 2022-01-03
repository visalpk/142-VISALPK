package com.marticus.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.auth.entity.User;
import com.marticus.auth.repository.Userepo;

@Service
public class Userservice {
	@Autowired
	Userepo userepo;

	public Boolean authenticate(String username, String password) {
		System.out.println("UserName="+username);
		System.out.println("password="+password);
		List<User> listUser= userepo.findByUsernameAndPassword(username,password);
		System.out.println("size="+listUser.size());
		if((null!=listUser)&(listUser.size()>0))
		{
			return true;
		}
		
		return false;
	}

}
