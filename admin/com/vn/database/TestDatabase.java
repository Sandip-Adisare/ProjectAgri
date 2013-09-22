package com.vn.database;

public class TestDatabase {
	public static void main(String[] args) {
		DatabaseConnection access= DatabaseConnection.getInstance();
		DatabaseConnection.getInstance();
		DatabaseConnection.getInstance();
		try {
			access.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
