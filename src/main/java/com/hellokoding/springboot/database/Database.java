package com.hellokoding.springboot.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://104.198.219.27/dtdm?userSSL=false";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "1900561558aA@";
	public Connection connect() {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			return conn;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
