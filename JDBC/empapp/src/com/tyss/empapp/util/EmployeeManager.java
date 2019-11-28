package com.tyss.empapp.util;

import com.tyss.empapp.dao.EmployeeDAO;
import com.tyss.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
	
}
