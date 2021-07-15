package com.ust.samplejdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	Connection con=null;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentapp?user=root&password=test");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	
	public void getDetail(String sql) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("UserName :"+rs.getString("emailid")+"  Password :"+rs.getString("password"));
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void closeCon() {
		try {
			con.close();
		} catch (Exception e) {
			
		}
	}
}
