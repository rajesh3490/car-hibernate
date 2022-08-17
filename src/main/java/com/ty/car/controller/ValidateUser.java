package com.ty.car.controller;
import com.ty.car.dao.UserDao;
import com.ty.car.dto.User;

public class ValidateUser {

	public static void main(String[] args) {

		UserDao userDao=new UserDao();
		User user=userDao.validateUser("rajesh@gmail.com", "rajesh");
		
		System.out.println("user id is "+user.getId());
		System.out.println("user name is "+user.getName());
		System.out.println("user email is "+user.getEmail());
		System.out.println("user password is "+user.getPassword());
		System.out.println("----------------------------------");
	}

}
