package infraestracture.persistance.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {
	
	public static Connection  getConnection() {
		
	
	String host = "localhost";
	String port = "3306";
	String username = "root";
	String password = "iC00uo5oWitty79";
	String nombredb = "peliculasdb";
	String driverClassName = "com.mysql.cj.jdbc.Driver";
	
	Connection connection = null;
	
	try {
		Class.forName(driverClassName);
		String url = "jdbc:mysql://"+ host + ":" + port +  "/" + nombredb;
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Conexion establecida");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
	}
}
