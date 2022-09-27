package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;
import com.ty.school.dto.Student;
import com.ty.school.dto.ReferenceBook;
import com.ty.school.dto.ReferenceBook;

public class ReferenceBookDao {
	public ReferenceBook saveReferenceBook(ReferenceBook r)
	{
		r=new ReferenceBook();
		r.setId(3);
		r.setName("arrays");
		r.setSubject("cs");
		r.setAuthor("ananymous");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(r);
		et.commit();
		return r;
	}	
	public ReferenceBook findReferenceBook(int roll)
	{
		
		ReferenceBook rb=new ReferenceBook();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		ReferenceBook ReferenceBook=em.find(ReferenceBook.class, 2);
		if(ReferenceBook!=null)
		{
			System.out.println(ReferenceBook.getId());
			System.out.println(ReferenceBook.getName());
			System.out.println(ReferenceBook.getSubject());
			System.out.println(ReferenceBook.getAuthor());
			
		}
		else
		{
			System.out.println("ReferenceBook details are not present");
		}
		//u.setId(2);
		return rb;
	}
	public Boolean deleteReferenceBook(int roll) {

		ReferenceBook rb = new ReferenceBook();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

	
		EntityTransaction et = em.getTransaction();

		rb=em.find(ReferenceBook.class, roll);
		if (rb != null)
		{
			et.begin();
		em.remove(rb);
		et.commit();
		return true;
		}
		return false;
	}

	public ReferenceBook updateReferenceBook(int id)
	{
		
		
		ReferenceBook rb=new ReferenceBook();
		rb.setId(3);
		rb.setName("Ops");
		rb.setAuthor("unknown");
		rb.setSubject("Social");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		ReferenceBook referenceBook=em.merge(rb);
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(rb);
		et.commit();
		
		return rb;

	
	}

}
