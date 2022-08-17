package com.ty.car.controller;

import com.ty.car.dao.UserDao;
import com.ty.car.dto.User;

public class SaveUser {

	public static void main(String[] args) {

		UserDao userDao=new UserDao();
		User user=new User();
		user.setName("rajesh");
		user.setEmail("rajesh@gmail.com");
		user.setPassword("rajesh");
		
		userDao.saveUser(user);
	}

}
