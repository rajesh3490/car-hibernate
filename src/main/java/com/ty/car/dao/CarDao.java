package com.ty.car.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ty.car.dto.Car;
import com.ty.car.helper.EntityManagerObject;

public class CarDao {

	public void saveCar(Car car) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();

	}

	public Car getCarById(int id) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		Car car = entityManager.find(Car.class, id);
		return car;
	}

	public boolean deleteCarById(int id) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		Car car = entityManager.find(Car.class, id);
		if (car != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(car);
			entityTransaction.commit();
			return true;
		}
		return false;

	}

	public void updateCar(Car car) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
	}
	
	public List<Car> getAllCars()
	{
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		String jpql="select c from Car c";
		Query query=entityManager.createQuery(jpql);
		List<Car> carList=query.getResultList();
		return carList;
	}
	
	public List<Car> getAllCarsByBrand(String brand)
	{
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		String jpql="select c from Car c where c.brand=?1";
		Query query=entityManager.createQuery(jpql);
		query.setParameter(1, brand);
		List<Car> carList=query.getResultList();
		return carList;
	}
	
	public List<Car> getAllCarsByRange(double start,double end)
	{
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		String jpql="select c from Car c where c.cost>=?1 and c.cost<=?2";
		Query query=entityManager.createQuery(jpql);
		query.setParameter(1, start);
		query.setParameter(2, end);
		List<Car> carList=query.getResultList();
		return carList;
	}
}
