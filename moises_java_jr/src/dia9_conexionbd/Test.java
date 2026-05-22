package dia9_conexionbd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		
		if(c.conexion != null) {
			System.out.println("Conexion establecida");
		}else {
			System.out.println("Error de conexion");
		}
		String consulta = "select codigo, nombre, precio from productos";
		PreparedStatement ps = c.conexion.prepareStatement(consulta);
		ResultSet rs = ps.executeQuery(); // set de resultados
		
		while(rs.next()) {
			System.out.println(rs.getString("nombre") + " " + rs.getString("precio"));
		}
		
		
	}
}
