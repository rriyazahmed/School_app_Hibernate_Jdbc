package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.StudentDao;
import com.ty.dao.StudentDao;
import com.ty.dao.StudentDao;
import com.ty.school.dto.Student;
import com.ty.school.dto.Student;
import com.ty.school.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option to perform CRUD operation");
		System.out.println("1.Save Student\n2.Find Student\n3.Delete Student\n4.Update Student");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
			Student s = new Student();
			StudentDao ud = new StudentDao();
			Student student = ud.saveStudent(s);
			System.out.println(student);
		}
			break;
		case 2: {
			Student s = new Student();
			StudentDao sd = new StudentDao();
			Student Student = sd.findStudent(1);
			System.out.println(Student);
		}
		break;
		case 3: {
			Student s = new Student();
			StudentDao sd = new StudentDao();
			System.err.println("enter the id to delete student");
			int roll=sc.nextInt();
			boolean result=sd.deleteStudent(roll);
			System.out.println(result);


		}
		break;
		case 4: {
			Student s = new Student();
			StudentDao sd = new StudentDao();
			Student student = sd.updateStudent(2);
			System.out.println(student);
		}

		}

	}
}
