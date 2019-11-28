package com.tyss.empwebapps.util;

import com.tyss.empwebapps.dao.EmployeeDAO;
import com.tyss.empwebapps.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
