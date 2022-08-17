package com.ty.car.controller;

import com.ty.car.dao.CarDao;
import com.ty.car.dto.Car;

public class GetCarById {

	public static void main(String[] args) {

		CarDao carDao=new CarDao();
		Car car=carDao.getCarById(1);
		System.out.println("car id is "+car.getId());
		System.out.println("car name is "+car.getName());
		System.out.println("car cost is "+car.getCost());
		System.out.println("car brand is "+car.getBrand());
	}

}
