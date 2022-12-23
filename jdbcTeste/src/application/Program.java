package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		//brincando
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		conn = DB.getConnection();
		
		st = conn.createStatement();
		 
		st = conn.createStatement();
		
		st.executeUpdate("UPDATE seller "
				+ "SET Name = 'Joao', BaseSalary = 4500.0 "
				+ "WHERE "
				+ "DepartmentId = 1");
		
		
		st.executeUpdate("UPDATE seller SET Name = 'Joao', BaseSalary = 4500.0 WHERE Id = 15");*/
		
		st.executeUpdate("INSERT INTO department (Name) VALUES ('teste')");
		
		/*ps = conn.prepareStatement(
				"INSERT INTO seller "
				+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
				+ "VALUES "
				+ "(?, ?, ?, ?, ?) ");
				
		ps.setString(1, "Cleber");
		ps.setString(2, "cleber@gmail.com");
		ps.setDate(3, new java.sql.Date(sdf.parse("22/09/1985").getTime()));
		ps.setDouble(4, 4000.0);
		ps.setInt(5, 3);
		
		ps.executeUpdate();
		
		/*rs = st.executeQuery("SELECT * FROM seller");
		
		
		
		while (rs.next()) {
			System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
		}
		
		st.executeUpdate("DELETE FROM seller WHERE Name = 'Greg' ");*/
		
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeConnection();
			DB.closeStatement(st);
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
			
		}
	}
}