package com.gl.serviceimpl;

import com.gl.service.SuperDepartment;

public class HumanResourceDepartment extends SuperDepartment {
	
	public String getDepartmentName() {
		return "Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today�s worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
