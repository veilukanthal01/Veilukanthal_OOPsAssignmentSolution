package com.gl.serviceimpl;

import com.gl.service.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public String getDepartmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
