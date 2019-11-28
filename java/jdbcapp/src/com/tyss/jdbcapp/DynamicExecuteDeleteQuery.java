package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicExecuteDeleteQuery {
	public static void main(String[] args) {
		
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
	
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	
		
	String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	conn = DriverManager.getConnection(url);
	
	String sql = " delete from employee_info where id=? ";
	pstmt = conn.prepareStatement(sql);
	
	//String empid = args[0];
	//int id = Integer.parseInt(args[0]);
	
	pstmt.setInt(1, Integer.parseInt(args[0]));
	
	int count = pstmt.executeUpdate();
	
	System.out.println(count + "Employee table updated ");
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	}
	
}
