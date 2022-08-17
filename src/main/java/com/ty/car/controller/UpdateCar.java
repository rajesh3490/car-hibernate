package com.ty.car.controller;

import com.ty.car.dao.CarDao;
import com.ty.car.dto.Car;

public class UpdateCar {

	public static void main(String[] args) {

		Car car=new Car();
		car.setId(1);
		car.setName("Volkswangen groups");
		car.setCost(2000000);
		car.setBrand("BMW");
		
		CarDao carDao=new CarDao();
		carDao.updateCar(car);
	}

}
