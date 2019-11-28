package com.tyss.phonesimulatorapplicationdevelopment.dao;

import java.util.List;

import com.tyss.phonesimulatorapplicationdevelopment.dto.MobileBean;

public interface MobileDAO {
	List<String> selectAllContact();

	MobileBean searchContact(String name);

	int addContact(MobileBean bean);

	int deleteContact(String name);

	int updateContact(MobileBean bean);
}
