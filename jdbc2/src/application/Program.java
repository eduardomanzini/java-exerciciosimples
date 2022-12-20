
package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//RECUPERAR DADOS DO BANCO
		
		Connection conn = null;
		Statement st = null; // consulta
		ResultSet rs = null; //guarda
		
		try {
			conn = DB.getConnection();
			
			
			st = conn.createStatement();
			
			rs = st.executeQuery("SELECT * FROM department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
