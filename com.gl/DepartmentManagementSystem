package com.gl;

import com.gl.service.SuperDepartment;
import com.gl.serviceimpl.AdminDepartment;
import com.gl.serviceimpl.HumanResourceDepartment;
import com.gl.serviceimpl.TechnicalDepartment;

public class DepartmentManagementSystem {

	public static void main(String[] args) {

		SuperDepartment adminDepartment = new AdminDepartment();
		System.out.println("Welcome to " + adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());

		HumanResourceDepartment hrDepartment = new HumanResourceDepartment();
		System.out.println("\nWelcome to " + hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println(hrDepartment.getWorkDeadline());

		TechnicalDepartment techDepartment = new TechnicalDepartment();
		System.out.println("\nWelcome to " + techDepartment.getDepartmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println(techDepartment.getTechStackInformation());
	}

}
