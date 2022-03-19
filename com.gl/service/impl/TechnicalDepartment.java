package com.gl.serviceimpl;

import com.gl.service.SuperDepartment;

public class TechnicalDepartment extends SuperDepartment {

	public String getDepartmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}
