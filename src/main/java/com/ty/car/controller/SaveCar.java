package com.ty.car.controller;

import com.ty.car.dao.CarDao;
import com.ty.car.dto.Car;

public class SaveCar {

	public static void main(String[] args) {

		Car car=new Car();
		car.setId(1);
		car.setName("Volkswangen groups");
		car.setCost(2000000);
		car.setBrand("Audi");
		
		CarDao carDao=new CarDao();
		carDao.saveCar(car);
	}

}
