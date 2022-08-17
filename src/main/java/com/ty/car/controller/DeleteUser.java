package com.ty.car.controller;

import com.ty.car.dao.UserDao;

public class DeleteUser {

	public static void main(String[] args) {

		UserDao userDao=new UserDao();
		System.out.println(userDao.deleteUser(1));
	}

}
