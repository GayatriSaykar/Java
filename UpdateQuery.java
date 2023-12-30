package _01JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl="jdbc:mysql://localhost:3306/knowit";
			Connection con=DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
			int n=stmt.executeUpdate("update emp set sal=20000 where empno=2222");
			System.out.println(n+" "+"Records updated successfully!!!");
			}
			catch(ClassNotFoundException e) {
				System.out.println("Class not found");
			}
			catch(SQLException e) {
				System.out.println("SQL not exception");
			}

	}

}
