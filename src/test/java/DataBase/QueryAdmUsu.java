package DataBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueryAdmUsu {
	
	String nombreUsu;
	String correoUsu;
	String apellidoUsu;
	String idUsuario;
	String Cliente;
	String Sucursal;
	String Grupo;
	String Area;
	String Series;
	
	JavaPostgreSQLBasic conexionClase = new JavaPostgreSQLBasic();
	QueryUsuLogin conexionQueryUsuLogin = new QueryUsuLogin();
	Connection conexionBD = conexionClase.connectDatabase();
	Statement stmt = null;
	
	public String AdmUsuBuscarCorreo() throws SQLException {
		stmt = conexionBD.createStatement();
		String sql = "select correo\r\n"
				+ "from usuario u\r\n"
				+ "where sucursal_id is not null \r\n"
				+ "order by 1\r\n"
				+ "fetch first 1 rows only";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		correoUsu = executeQuery.getString("correo");
		//System.out.println(correoUsu);
		}
		return correoUsu;
	}
	
	public String AdmUsuBuscarNombre() throws SQLException {
		stmt = conexionBD.createStatement();
		String sql = "select nombre\r\n"
				+ "from usuario u\r\n"
				+ "where sucursal_id is not null \r\n"
				+ "order by nombre\r\n"
				+ "fetch first 1 rows only";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		nombreUsu = executeQuery.getString("nombre");
		//System.out.println(nombreUsu);
		}
		return nombreUsu;
	}
	
	public String AdmUsuBuscarApellido() throws SQLException {
		stmt = conexionBD.createStatement();
		String sql = "select apellido\r\n"
				+ "from usuario u\r\n"
				+ "where sucursal_id is not null and apellido <> ' '\r\n"
				+ "order by 1\r\n"
				+ "fetch first 1 rows only";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		apellidoUsu = executeQuery.getString("apellido");
		//System.out.println(nombreUsu);
		}
		return apellidoUsu;
	}
	
	public String AdmUsuCorreoCrearUsuario() throws SQLException {
		stmt = conexionBD.createStatement();
		String sql = "select max(correo) correo\r\n"
				+ "from usuario u\r\n"
				+ "where correo like '%automatedtestmail%'";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		correoUsu = executeQuery.getString("correo");
		//System.out.println(correoUsu);
		}
		return correoUsu;
	}
	
	public void AdmUsuEliminarUsuarios() throws SQLException {
		stmt = conexionBD.createStatement();
		String sql = "delete from log_radicacion where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from log_transaccional where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from radicacion_tmp where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from rol_x_usuario where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from cliente where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from reporte where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from log_parametros where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from login_x_usuario where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from observacion where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from radicacion where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from transaccion where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from usuario_x_serie where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from proceso_descarga where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from proceso_envio_clientes where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "delete from usuario where usuario_id in (select u.usuario_id from usuario u where correo like '%automatedtestmail@pruebas.com');\r\n"
				+ "";
		stmt.execute(sql);
	}
	
	public String AdmUsuClienteCrearUsuario() throws SQLException, FileNotFoundException, IOException {
		idUsuario = conexionQueryUsuLogin.IdClienteUsuLogin();
		stmt = conexionBD.createStatement();
		String sql = "select nombre from cliente c\r\n"
				+ "where usuario_id = '"+idUsuario+"'"
				+ "and cliente_id in (select s.cliente_id from sucursal s\r\n"
				+ "inner join cliente c2 on s.cliente_id = c2.cliente_id)\r\n"
				+ "order by nombre desc\r\n"
				+ "fetch first 1 rows only";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Cliente = executeQuery.getString("nombre");
		//System.out.println(Cliente);
		}
		return Cliente;
	}
	
	public String AdmUsuSucursalCrearUsuario() throws SQLException, FileNotFoundException, IOException {
		idUsuario = conexionQueryUsuLogin.IdClienteUsuLogin();
		stmt = conexionBD.createStatement();
		String sql = "select nombre from sucursal s \r\n"
				+ "where cliente_id in (select c.cliente_id from cliente c\r\n"
				+ "where usuario_id = '"+idUsuario+"'"
				+ "and cliente_id in (select s.cliente_id from sucursal s\r\n"
				+ "inner join cliente c2 on s.cliente_id = c2.cliente_id)\r\n"
				+ "order by nombre desc\r\n"
				+ "fetch first 1 rows only)\r\n"
				+ "order by nombre desc\r\n"
				+ "fetch first 1 rows only";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Sucursal = executeQuery.getString("nombre");
		//System.out.println(Sucursal);
		}
		return Sucursal;
	}
	
	public List<String> AdmUsuAsignarGrupo() throws SQLException {
		List<String> listaGrupo = new ArrayList<>();
		correoUsu = AdmUsuBuscarCorreo();
		stmt = conexionBD.createStatement();
		String sql = "select rxc.nombre from usuario u \r\n"
				+ "inner join sucursal s on u.sucursal_id = s.sucursal_id \r\n"
				+ "inner join rol_x_cliente rxc on s.cliente_id = rxc.cliente_id \r\n"
				+ "where u.correo = '"+correoUsu+"'"
				+ "order by 1";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Grupo = executeQuery.getString("nombre");
		listaGrupo.add(Grupo);
		}
		//System.out.println(listaGrupo);
		return listaGrupo;
	}
	
	public String AdmUsuClienteAsignarSerie() throws SQLException, FileNotFoundException, IOException {
		idUsuario = conexionQueryUsuLogin.IdClienteUsuLogin();
		stmt = conexionBD.createStatement();
		String sql = "select nombre from (select c.nombre, count(c.nombre) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "inner join usuario u on u.usuario_id = c.usuario_id \r\n"
				+ "where u.usuario_id = '"+idUsuario+"'\r\n"
				+ "group by c.nombre\r\n"
				+ "having count(c.nombre)>=2\r\n"
				+ "fetch first 1 rows only)c1";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Cliente = executeQuery.getString("nombre");
		//System.out.println(Cliente);
		}
		return Cliente;
	}
	
	public String AdmUsuAreaAsignarSerie() throws SQLException, FileNotFoundException, IOException {
		idUsuario = conexionQueryUsuLogin.IdClienteUsuLogin();
		stmt = conexionBD.createStatement();
		String sql = "select distinct(a.nombre) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "where a.cliente_id = (select cliente_id from (select c.cliente_id , count(c.nombre) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "inner join usuario u on u.usuario_id = c.usuario_id \r\n"
				+ "where u.usuario_id = '"+idUsuario+"'\r\n"
				+ "group by c.cliente_id\r\n"
				+ "having count(c.nombre)>=2\r\n"
				+ "order  by c.nombre\r\n"
				+ "fetch first 1 rows only)c1)\r\n"
				+ "order by a.nombre";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Area = executeQuery.getString("nombre");
		//System.out.println(Area);
		}
		return Area;
	}
	
	public List<String> AdmUsuSeriesAsignarSerie() throws SQLException, FileNotFoundException, IOException {
		idUsuario = conexionQueryUsuLogin.IdClienteUsuLogin();
		List<String> listaSeries = new ArrayList<>();
		correoUsu = AdmUsuBuscarCorreo();
		stmt = conexionBD.createStatement();
		String sql = "select s.nombre from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "inner join usuario u on u.usuario_id = c.usuario_id \r\n"
				+ "where \r\n"
				+ "c.cliente_id = \r\n"
				+ "(select cliente_id from (select c.cliente_id, count(c.nombre) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "inner join usuario u on u.usuario_id = c.usuario_id \r\n"
				+ "where u.usuario_id = '"+idUsuario+"'\r\n"
				+ "group by c.cliente_id\r\n"
				+ "having count(c.cliente_id)>=2\r\n"
				+ "order  by c.nombre\r\n"
				+ "fetch first 1 rows only)c1)\r\n"
				+ "and a.area_id = \r\n"
				+ "(select distinct(a.area_id) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "where a.cliente_id = (select cliente_id from (select c.cliente_id , count(c.nombre) from serie s\r\n"
				+ "inner join area a on a.area_id = s.area_id \r\n"
				+ "inner join cliente c on c.cliente_id = a.cliente_id\r\n"
				+ "inner join usuario u on u.usuario_id = c.usuario_id \r\n"
				+ "where u.usuario_id = '"+idUsuario+"'\r\n"
				+ "group by c.cliente_id\r\n"
				+ "having count(c.nombre)>=2\r\n"
				+ "order  by c.nombre\r\n"
				+ "fetch first 1 rows only)c1)\r\n"
				+ "order by a.area_id)\r\n"
				+ "and s.serie_id not in\r\n"
				+ "(select s.serie_id from serie s \r\n"
				+ "inner join usuario_x_serie uxs on uxs.serie_id = s.serie_id \r\n"
				+ "inner join usuario u on u.usuario_id = uxs.usuario_id \r\n"
				+ "where u.correo = '"+correoUsu+"')\r\n"
				+ "order by s.nombre";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Series = executeQuery.getString("nombre");
		listaSeries.add(Series);
		}
		System.out.println(listaSeries);
		return listaSeries;
	}
	
	public List<String> AdmUsuSeriesConsultarSerie() throws SQLException {
		List<String> listaSeries = new ArrayList<>();
		correoUsu = AdmUsuBuscarCorreo();
		stmt = conexionBD.createStatement();
		String sql = "select s.nombre from serie s \r\n"
				+ "inner join usuario_x_serie uxs on uxs.serie_id = s.serie_id \r\n"
				+ "inner join usuario u on u.usuario_id = uxs.usuario_id \r\n"
				+ "where u.correo = '"+correoUsu+"'";
		ResultSet executeQuery = stmt.executeQuery(sql);
		while (executeQuery.next()) {
		Series = executeQuery.getString("nombre");
		listaSeries.add(Series);
		}
		//System.out.println(listaSeries);
		return listaSeries;
	}
	
	
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        QueryAdmUsu conexionQueryAdmUsu = new QueryAdmUsu();
        conexionQueryAdmUsu.AdmUsuSeriesAsignarSerie();
    }

}
