package com.ty.car.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ty.car.dto.User;
import com.ty.car.helper.EntityManagerObject;

public class UserDao {

	public void saveUser(User user) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

	}

	public User validateUser(String email, String password) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();

		String jpql = "select u from User u where u.email=?1 and u.password=?2";

		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> ls = query.getResultList();
		if (ls != null) {
			return ls.get(0);
		}

		return null;
	}

	public boolean deleteUser(int id) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		return false;

	}

	public User getUserByEmail(String email) {
		EntityManager entityManager = EntityManagerObject.getEntityManager();
		String jpql = "select u from User u where u.email=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, email);
		List<User> ls = query.getResultList();
		if (ls != null) {
			return ls.get(0);
		}

		return null;
	}
}
