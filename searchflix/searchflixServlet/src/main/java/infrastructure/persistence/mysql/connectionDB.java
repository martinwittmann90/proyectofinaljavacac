package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {

    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "iC00uo5oWitty79";
    private static final String DB_NAME = "peliculasdb";

    public static Connection getConnection() throws SQLException {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
        Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

        if (connection != null) {
            System.out.println("CONEXION ESTABLECIDA ...");
            return connection;
        } else {
            throw new SQLException("Error al establecer la conexión a la base de datos.");
        }
    }
}
