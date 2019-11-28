package com.tyss.phonesimulatorapplicationdevelopment.util;

import com.tyss.phonesimulatorapplicationdevelopment.dao.MobileDAO;
import com.tyss.phonesimulatorapplicationdevelopment.dao.MobileDAOImpl;

public class MobileManager {
	public static MobileDAOImpl getContactFileImpl() {
		return new MobileDAOImpl();
	}
}

	
	