package com.tyss.didemo.dao.impl.util;

import com.tyss.didemo.dao.I;
import com.tyss.didemo.dao.impl.A;

public class Manager {
	public I getI() {
		return new A();
	}
}
