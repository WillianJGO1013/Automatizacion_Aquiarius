package DataBase;

import java.sql.*;

public class JavaPostgreSQLBasic {
	
	Connection connection = null;
	
	public Connection connectDatabase() {
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error al registrar el driver de PostgreSQL: " + ex);				
			}
			connection = DriverManager.getConnection("jdbc:postgresql://172.27.244.22:5432/operacion_aquarius_test","userpruebas","GrupoASD2020*");
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);			
		}
		return connection;		
	}
	
}
