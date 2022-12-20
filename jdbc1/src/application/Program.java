package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//COMO FAZER A CONEXACAO
		
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}
