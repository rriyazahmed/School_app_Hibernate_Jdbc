package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.ReferenceBookDao;
import com.ty.dao.ReferenceBookDao;
import com.ty.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;
import com.ty.school.dto.ReferenceBook;
import com.ty.school.dto.ReferenceBook;

public class ReferenceBookController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option to perform CRUD operation");
		System.out.println("1.Save ReferenceBook\n2.Find ReferenceBook\n3.Delete ReferenceBook\n4.Update ReferenceBook");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
			ReferenceBook r = new ReferenceBook();
			ReferenceBookDao ud = new ReferenceBookDao();
			ReferenceBook referenceBook = ud.saveReferenceBook(r);
			System.out.println(referenceBook);
		}

			break;
		case 2: {
			ReferenceBook rb = new ReferenceBook();
			ReferenceBookDao rbd = new ReferenceBookDao();
			ReferenceBook ReferenceBook = rbd.findReferenceBook(1);
			System.out.println(ReferenceBook);
		}
		break;
		case 3: {
			ReferenceBook rb = new ReferenceBook();
			ReferenceBookDao rbd = new ReferenceBookDao();
			System.err.println("enter the id to delete Reference Book");
			int id=sc.nextInt();
			boolean result=rbd.deleteReferenceBook(id);
			System.out.println(result);
		}
		break;
		case 4: {
			ReferenceBook rb = new ReferenceBook();
			ReferenceBookDao rbd = new ReferenceBookDao();
			ReferenceBook ReferenceBook = rbd.updateReferenceBook(2);
			System.out.println(ReferenceBook);
		}

		}
		}

	}