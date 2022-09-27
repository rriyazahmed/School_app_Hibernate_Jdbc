package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class UserDao {
	public User saveUser(User u) {
		u = new User();
		u.setId(1);
		u.setEmail("user1@gmail.com");
		u.setPhone(9855556);
		u.setGender("feMale");
		u.setPassword("user586552320");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(u);
		et.commit();
		return u;
	}

	public User findUser(int id) {

		User u = new User();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, 2);
		if (user != null) {
			System.out.println(user.getId());
			System.out.println(user.getEmail());
			System.out.println(user.getGender());
			System.out.println(user.getPhone());
			System.out.println(user.getPassword());
		} else {
			System.out.println("User details are not present");
		}

		return u;
	}

	public Boolean deleteUser(int id) {

		User u = new User();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		u=em.find(User.class, id);
		if (u != null)
		{
			et.begin();
		em.remove(u);
		et.commit();
		return true;
		}
		return false;
	}

	public User updateUser(int id) {

		User u = new User();
		u.setId(3);
		u.setEmail("bye@gmail.com");
		u.setPhone(87555);
		u.setGender("female");
		u.setPassword("user58288770");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		User user = em.merge(u);
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(u);
		et.commit();

		return u;
	}
}
