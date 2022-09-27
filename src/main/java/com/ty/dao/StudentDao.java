package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;
import com.ty.school.dto.User;
import com.ty.school.dto.Student;
import com.ty.school.dto.Student;

public class StudentDao {
	public Student saveStudent(Student s)
	{
		s=new Student();
		s.setRoll(3);
		s.setName("Anand");
		s.setPercentage(72);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(s);
		et.commit();
		return s;
	}	
	public Student findStudent(int roll)
	{
		
		Student s=new Student();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Student Student=em.find(Student.class, 2);
		if(Student!=null)
		{
			System.out.println(Student.getRoll());
			System.out.println(Student.getName());
			System.out.println(Student.getPercentage());
			
		}
		else
		{
			System.out.println("Student details are not present");
		}
		//u.setId(2);
		return s;
	}
	public boolean deleteStudent(int roll) {

		Student s = new Student();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

	
		EntityTransaction et = em.getTransaction();

		s=em.find(Student.class, roll);
		if (s != null)
		{
			et.begin();
		em.remove(s);
		et.commit();
		return true;
		}
		return false;
	}

	public Student updateStudent(int id)
	{
		
		
		Student s=new Student();
		s.setRoll(2);
		s.setName("hari");
		s.setPercentage(72);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Student student=em.merge(s);
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(s);
		et.commit();
		
		return s;

	
	}
}
