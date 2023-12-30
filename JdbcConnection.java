package _01JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowit";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection established");
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from emp where deptno=10");
		while(res.next()) {
			 System.out.print(res.getInt(1)+"    ");
			 System.out.print(res.getString(2)+"    ");
			 System.out.print(res.getString(3)+"    ");
			 System.out.print(res.getInt(4)+"    ");
			 System.out.print(res.getDate(5)+"    ");
			 System.out.print(res.getFloat(6)+"    ");
			 System.out.print(res.getFloat(7)+"    ");
			 System.out.print(res.getInt(8)+"    ");
			 System.out.println();
		}
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found");
		}
		catch(SQLException e) {
			System.out.println("SQL not exception");
		}
	}

}
