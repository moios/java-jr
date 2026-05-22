package dia9_conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	String driver = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "12345678";
	String bd = "JAVA_DB_MOISES";
	String url = "jdbc:mysql://localhost:3306/" + bd;
	Connection conexion;
	
	public Conexion() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conexion = DriverManager.getConnection(url,user, pass);
	}
}
