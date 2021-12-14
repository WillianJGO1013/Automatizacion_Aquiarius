package DataBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class QueryUsuLogin {
	
	Properties loadProperty = new Properties();
	JavaPostgreSQLBasic conexionClase = new JavaPostgreSQLBasic();
	Connection conexionBD = conexionClase.connectDatabase();
	Statement stmt = null;
	
	String usuarioLogin;
	
	public String IdClienteUsuLogin() throws SQLException, FileNotFoundException, IOException {
		loadProperty.load(new FileReader("./params.properties"));
		String CredencialesCorreo = loadProperty.getProperty("CredencialesCorreo");
		stmt = conexionBD.createStatement();
		String sql = "select u.usuario_id from usuario u \r\n"
				+ "where u.correo = '"+CredencialesCorreo+"'";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		usuarioLogin = executeQuery.getString("usuario_id");
		//System.out.println(usuarioLogin);
		}
		return usuarioLogin;
	}
	
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		JavaPostgreSQLBasic conexionBD = new JavaPostgreSQLBasic();
		conexionBD.connectDatabase();
		QueryUsuLogin conexionQueryUsuLogin = new QueryUsuLogin();
		conexionQueryUsuLogin.IdClienteUsuLogin();
    }

}
