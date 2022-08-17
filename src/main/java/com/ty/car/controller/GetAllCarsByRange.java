package com.ty.car.controller;

import java.util.List;

import com.ty.car.dao.CarDao;
import com.ty.car.dto.Car;

public class GetAllCarsByRange {

	public static void main(String[] args) {

		CarDao carDao = new CarDao();
		List<Car> carList = carDao.getAllCarsByRange(10000, 40000000);
		for (Car car : carList) {
			System.out.println("car id is " + car.getId());
			System.out.println("car name is " + car.getName());
			System.out.println("car brand is " + car.getBrand());
			System.out.println("car cost is " + car.getCost());
			System.out.println("-------------------------------");
		}
	}

}
