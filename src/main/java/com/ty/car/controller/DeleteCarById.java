package com.ty.car.controller;

import com.ty.car.dao.CarDao;

public class DeleteCarById {

	public static void main(String[] args) {

		CarDao carDao = new CarDao();
		System.out.println(carDao.deleteCarById(1));
	}

}
