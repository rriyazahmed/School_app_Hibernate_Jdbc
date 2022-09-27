package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDao;
import com.ty.school.dto.User;

public class UserController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option to perform CRUD operation");
		System.out.println("1.Save User\n2.Find User\n3.Delete User\n4.Update User");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
			User u = new User();
			UserDao ud = new UserDao();
			User user = ud.saveUser(u);
			System.out.println(user);
		}
			break;
		case 2: {
			User u = new User();
			UserDao ud = new UserDao();
			User user = ud.findUser(1);
			System.out.println(user);
		} break;
		case 3: {
			User u = new User();
			UserDao ud = new UserDao();
			System.err.println("enter the id to delete user");
			int id=sc.nextInt();
			boolean result=ud.deleteUser(id);
			System.out.println(result);

		}break;
		case 4:
		{
			User u = new User();
			UserDao ud = new UserDao();
			User user = ud.updateUser(2);
			System.out.println(user);
		}

		}
	}
}
