package com.ust.samplejdbc.app;

import com.ust.samplejdbc.connection.DBConnection;

public class App {
	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		db.getDetail("SELECT * FROM login");
		db.closeCon();
	}
}
