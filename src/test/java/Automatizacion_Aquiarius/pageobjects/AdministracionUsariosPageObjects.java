package Automatizacion_Aquiarius.pageobjects;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automatizacion_Aquiarius.elements.AquariusElements;
import DataBase.QueryAdmUsu;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class AdministracionUsariosPageObjects extends PageObject{
	
	Properties loadProperty = new Properties();
	QueryAdmUsu conexionQueryAdmUsu = new QueryAdmUsu();
	
	//HOME
	static By AdmUsuBoton = AquariusElements.btnAdministracionUsuarios.getValor_campo();
	
	//ADMINISTRACIÓN USUARIOS
	static By AdmUsuTitulo = AquariusElements.ttlAdmUsu.getValor_campo();
	
	//BUSCAR ADMINISTRACIÓN USUARIOS
	static By AdmUsutextBuscar = AquariusElements.txtBuscar.getValor_campo();
	static By AdmUsubotonBuscar = AquariusElements.btnBuscar.getValor_campo();
	
	//CREAR ADMINISTRACIÓN USUARIOS
	static By botonAgregar = AquariusElements.btnAgregarAdmUsu.getValor_campo();
	static By ventanaCrearUsuario = AquariusElements.vtnCrearUsuarioAdmUsu.getValor_campo();
	static By textcorreoadmusu = AquariusElements.txtCorreoAdmUsu.getValor_campo();
	static By textnombresadmusu = AquariusElements.txtNombresAdmUsu.getValor_campo();
	static By textapellidosadmusu = AquariusElements.txtApellidosAdmUsu.getValor_campo();
	static By listaclienteadmusu = AquariusElements.lstClienteAdmUsu.getValor_campo();
	static By listasucursaladmusu = AquariusElements.lstSucursalAdmUsu.getValor_campo();
	static By botonGuardarAdmUsu = AquariusElements.btnGuardarAdmUsu.getValor_campo();
	static By botonCancelarAdmUsu = AquariusElements.btnCancelar.getValor_campo();
	static By botonAceptarCrearAdmUSu = AquariusElements.btnAceptarCrearAdmUSu.getValor_campo();
	static By ventanaUsuarioCreadoAdmUsu = AquariusElements.vtnUsuarioCreadoAdmUsu.getValor_campo();
	
	//TÍTULOS GRILLA ADMINISTRACIÓN USUARIOS
	static By AdmUsugrilla = AquariusElements.grllaAdmUsu.getValor_campo();
	static By AdmUsugrillaCorreo = AquariusElements.grllCorreoAdmUsu.getValor_campo();
	static By AdmUsugrillaNombres = AquariusElements.grllNombresAdmUsu.getValor_campo();	
	static By AdmUsugrillaApellidos = AquariusElements.grllApellidosAdmUsu.getValor_campo();
	static By AdmUsutituloGrillaCorreo = AquariusElements.ttlgriCorreo.getValor_campo();
	static By AdmUsutituloGrillaNombre = AquariusElements.ttlgriNombre.getValor_campo();
	static By AdmUsutituloGrillaApellido = AquariusElements.ttlgriApellido.getValor_campo();
	static By AdmUsutituloGrillaGrupos = AquariusElements.ttlgriGrupos.getValor_campo();
	static By AdmUsutituloGrillaSeries = AquariusElements.ttlgriSeries.getValor_campo();
	static By AdmUsutituloGrillaActivo = AquariusElements.ttlgriActivo.getValor_campo();
	static By AdmUsutituloGrillaAccion = AquariusElements.ttlgriAccion.getValor_campo();
	
	//GRUPOS GRILLA ADMINISTRACIÓN USUARIOS
	static By AdmUsubotonAdministrarGrupo = AquariusElements.btnAdministrarGrupo.getValor_campo();
	static By AdmUsubotonVerGrupo = AquariusElements.btnVerGrupo.getValor_campo();
	static By AdmUsubotonGuardarAsigGrupUsu = AquariusElements.btnGuardarAsigGrupUsu.getValor_campo();
	static By AdmUsutituloAsignarGruposUsuario = AquariusElements.ttlAsignarGruposUsuario.getValor_campo();
	static By AdmUsutituloTransaccionAsignarGrupo = AquariusElements.ttlTransaccionAsignarGrupo.getValor_campo();
	static By AdmUsubotonAceptarTranExitAsignarGrupo = AquariusElements.btnAceptarTranExitAsignarGrupo.getValor_campo();
	static By AdmUsuventanaTranExitAsignarGrupo = AquariusElements.vtnTranExitAsignarGrupo.getValor_campo();
	static By AdmUsubotonCancelarTranExitAsignarGrupo = AquariusElements.btnCancelarTranExitAsignarGrupo.getValor_campo();
	static By AdmUsulistaAsignarGrupoUSuario = AquariusElements.lstAsignarGrupoUSuario.getValor_campo();
	static By AdmUsuventanaGruposUsuario = AquariusElements.vtnGruposUsuario.getValor_campo();
	static By AdmUsutituloGruposUsuario = AquariusElements.ttlGruposUsuario.getValor_campo();
	static By AdmUsubotonAceptarGU = AquariusElements.btnAceptarGU.getValor_campo();
	static By AdmUsulistaGrupoUSuario = AquariusElements.lstGrupoUSuario.getValor_campo();
	
	//SERIES GRILLA ADMINISTRACIÓN USUARIOS
	static By AdmUsubotonAdministrarSeries = AquariusElements.btnAdministrarSeries.getValor_campo();
	static By AdmUsubotonVerSeries = AquariusElements.btnVerSeries.getValor_campo();
	static By AdmUsutituloAsignarSeriesUsuario = AquariusElements.ttlAsignarSeriesUsuario.getValor_campo();
	static By AdmUsugrillaAsignarSerieUsuario = AquariusElements.grllAsignarSerieUsuario.getValor_campo();
	static By AdmUsulistaClienteAsignarSeriesUsuario = AquariusElements.lstClienteAsignarSeriesUsuario.getValor_campo();
	static By AdmUsulistaAreaAsignarSeriesUsuario = AquariusElements.lstAreaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsulistaSeriesAsignarSeriesUSuario = AquariusElements.lstSeriesAsignarSeriesUSuario.getValor_campo();
	static By AdmUsubotonAsignarSerie = AquariusElements.btnAsignarSerie.getValor_campo();
	static By AdmUsutituloSerieInsertadaAsignarSeriesUsuario = AquariusElements.ttlSerieInsertadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonCerrarSerieInsertadaAsignarSeriesUsuario = AquariusElements.btnCerrarSerieInsertadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonMasivoAsignarSeriesUsuario = AquariusElements.btnMasivoAsignarSeriesUsuario.getValor_campo();
	static By AdmUsutituloSerieActualizadaAsignarSeriesUsuario = AquariusElements.ttlSerieActualizadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonCerrarSerieActualizadaAsignarSeriesUsuario = AquariusElements.btnCerrarSerieActualizadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonEliminarAsignarSeriesUsuario = AquariusElements.btnEliminarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsutituloDeseaEliminarAsignarSeriesUsuario = AquariusElements.ttlDeseaEliminarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonCancelarDeseEliminarAsignarSeriesUsuario = AquariusElements.btnCancelarDeseEliminarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonAceptarDeseEliminarAsignarSeriesUsuario = AquariusElements.btnAceptarDeseEliminarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsutituloSerieEliminadaAsignarSeriesUsuario = AquariusElements.ttlSerieEliminadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonCerrarSerieEliminadaAsignarSeriesUsuario = AquariusElements.btnCerrarSerieEliminadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsubotonCerrarAsignarSeriesUsuario = AquariusElements.btnCerrarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsuventanaAsignarSeriesUsuario = AquariusElements.vtnAsignarSeriesUsuario.getValor_campo();
	static By AdmUsuventanaDeseaEliminarAsignarSeriesUsuario = AquariusElements.vtnDeseaEliminarAsignarSeriesUsuario.getValor_campo();
	static By AdmUsuventanaSerieActualizadaAsignarSeriesUsuario = AquariusElements.vtnSerieActualizadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsuventanaSerieInsertadaAsignarSeriesUsuario = AquariusElements.vtnSerieInsertadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsuventanaSerieEliminadaAsignarSeriesUsuario = AquariusElements.vtnSerieEliminadaAsignarSeriesUsuario.getValor_campo();
	static By AdmUsulistaSeriesUSuario = AquariusElements.lstSeriesUSuario.getValor_campo();
	static By AdmUsubotonCerrarSeriesUSuario = AquariusElements.btnCerrarSeriesUSuario.getValor_campo();
	static By AdmUsuventanaSeriesUsuario = AquariusElements.vtnSeriesUsuario.getValor_campo();
	static By AdmUsutituloVentanaSeriesUsuario = AquariusElements.ttlVentanaSeriesUsuario.getValor_campo();
	
	//ACCIÓN GRILLA ADMINISTRACIÓN USUARIOS
	static By AdmUsubotonAccion = AquariusElements.btnAccion.getValor_campo();
	static By AdmUsubotonEditarUsuario = AquariusElements.btnEditarUsuario.getValor_campo();	
	static By AdmUsutextNombresEditarUsuario = AquariusElements.txtNombresEditarUsuario.getValor_campo();
	static By AdmUsutextApellidosEditarUsuario = AquariusElements.txtApellidosEditarUsuario.getValor_campo();
	static By AdmUsulistaClienteEditarUsuario = AquariusElements.lstClienteEditarUsuario.getValor_campo();
	static By AdmUsulistaSucursalEditarUsuario = AquariusElements.lstSucursalEditarUsuario.getValor_campo();
	static By AdmUsulistaEstadoEditarUsuario = AquariusElements.lstEstadoEditarUsuario.getValor_campo();
	static By AdmUsubotonCancelarEditarUsuario = AquariusElements.btnCancelarEditarUsuario.getValor_campo();
	static By AdmUsubotonGuadarEditarUsuario = AquariusElements.btnGuadarEditarUsuario.getValor_campo();
	static By AdmUsutituloEditarUsuario = AquariusElements.ttlEditarUsuario.getValor_campo();
	static By AdmUsuventanaEditarUsuario = AquariusElements.vtnEditarUsuario.getValor_campo();
	static By AdmUsutituloVentanaTransaccionEditarUsuario = AquariusElements.ttlVentanaTransaccionEditarUsuario.getValor_campo();
	static By AdmUsubotonAceptarTransaccionEditarUsuario = AquariusElements.btnAceptarTransaccionEditarUsuario.getValor_campo();	
	static By AdmUsuventanaTransaccionEditarUsuario = AquariusElements.vtnTransaccionEditarUsuario.getValor_campo();
	static By AdmUsubotonSubirFirma = AquariusElements.btnSubirFirma.getValor_campo();
	static By AdmUsutituloAgregarFirma = AquariusElements.ttlAgregarFirma.getValor_campo();
	static By AdmUsubotonnBuscarFirma = AquariusElements.btnBuscarFirma.getValor_campo();
	static By AdmUsubotonGuardarSubirFirma = AquariusElements.btnGuardarSubirFirma.getValor_campo();
	static By AdmUsubotonCancelarSubirFirma = AquariusElements.btnCancelarSubirFirma.getValor_campo();
	static By AdmUsutituloVtnOperacionExitosa = AquariusElements.ttlVtnOperacionExitosa.getValor_campo();
	static By AdmUsubotonAceptarOperacionExitosaSubirFirma = AquariusElements.btnAceptarOperacionExitosaSubirFirma.getValor_campo();
	static By AdmUsuventanaOperacionExitosaSubirFirma = AquariusElements.vtnOperacionExitosaSubirFirma.getValor_campo();
	static By AdmUsuimagenSubirFirma = AquariusElements.imgSubirFirma.getValor_campo();
	static By AdmUsulabelFirmaActualSubirFirma = AquariusElements.lblFirmaActualSubirFirma.getValor_campo();
	
	public void ingresarModulo() throws FileNotFoundException, IOException, InterruptedException {
		loadProperty.load(new FileReader("./params.properties"));
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		if (element(AdmUsuBoton).isEnabled()) {			
			find(AdmUsuBoton).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsuTitulo));
			System.out.print("Se hizó clic en el botón ADMINISTRACIÓN USUARIOS---");
			String titulo_AdmUsu = find(AdmUsuTitulo).getText();
			String ttl_AdmUsu = loadProperty.getProperty("AdmUsu_TituloModulo");
			assertEquals(titulo_AdmUsu,ttl_AdmUsu);
			System.out.print("Se abrió correctamente el módulo "+titulo_AdmUsu+"---");
		}
	}

	public void validaBusqueda() throws SQLException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		WebDriver driver = getDriver();		
		String emailUsu = conexionQueryAdmUsu.AdmUsuBuscarCorreo();
		String newemailUsu = emailUsu.trim();
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaCorreo));
		Serenity.takeScreenshot();
		System.out.print("Se realiza busqueda por correo---");
		String DatoCorreoGrillaAdminUsu = find(AdmUsugrillaCorreo).getText();
		assertEquals(DatoCorreoGrillaAdminUsu,newemailUsu);
		System.out.print("Se consultó correctamente el correo "+newemailUsu+"---");
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsutextBuscar));
		Serenity.takeScreenshot();
		String name = conexionQueryAdmUsu.AdmUsuBuscarNombre();
		find(AdmUsutextBuscar).type(name);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaNombres));				
		Serenity.takeScreenshot();
		System.out.print("Se realiza busqueda por nombre---");
		String DatoNombresGrillaAdminUsu = find(AdmUsugrillaNombres).getText();
		assertEquals(name,DatoNombresGrillaAdminUsu); 
		System.out.print("Se consultó correctamente el nombre "+DatoNombresGrillaAdminUsu+"---");
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsutextBuscar));
		Serenity.takeScreenshot();
		String lastName = conexionQueryAdmUsu.AdmUsuBuscarApellido();
		String newLastName = lastName.trim();
		find(AdmUsutextBuscar).type(lastName);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaApellidos));				
		Serenity.takeScreenshot();
		System.out.print("Se realiza busqueda por Apellido---");
		String DatoApellidossGrillaAdminUsu = find(AdmUsugrillaApellidos).getText();
		assertEquals(newLastName,DatoApellidossGrillaAdminUsu);
		System.out.print("Se consultó correctamente el apellido "+DatoApellidossGrillaAdminUsu+"---");
	}


	public void validaAgregar() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		find(botonAgregar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ventanaCrearUsuario));
		System.out.print("Se hizó clic en el botón Agregar---");
		if (element(ventanaCrearUsuario).isVisible()) {
			System.out.print("Se vizualiza correctamente la ventana Crear Usuario---");
		}
	}


	public void validaCrearUsuario() throws InterruptedException, SQLException, FileNotFoundException, IOException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String CampoCorreoAdmUsu_Inicial = loadProperty.getProperty("CampoCorreoAdmUsu_Inicial");
		String CampoNombreAdmUsu = loadProperty.getProperty("CampoNombreAdmUsu");
		String CampoApellidoAdmUsu = loadProperty.getProperty("CampoApellidoAdmUsu");		
		String email = conexionQueryAdmUsu.AdmUsuCorreoCrearUsuario();
		if (email == null) {
			find(textcorreoadmusu).type(CampoCorreoAdmUsu_Inicial);
			System.out.print("Se diligenció el campo Correo---");
		}
		else {
			String cadenaEmail = email;
			String[] partsEmail = cadenaEmail.split("\\_");
			String part0 = partsEmail[0];
			int part0New = Integer.parseInt(part0)+1;
			String part1 = partsEmail[1];
			String newEmail = (part0New+"_"+part1);
			if (part0New == 10) {
				conexionQueryAdmUsu.AdmUsuEliminarUsuarios();
				wait.until(ExpectedConditions.visibilityOfElementLocated(textcorreoadmusu));
				find(textcorreoadmusu).type(CampoCorreoAdmUsu_Inicial);
				System.out.print("Se diligenció el campo Correo---");
			}
			else {								
				find(textcorreoadmusu).type(newEmail);
				System.out.print("Se diligenció el campo Correo---");
			}			
		}
			find(textnombresadmusu).type(CampoNombreAdmUsu);
			System.out.print("Se diligenció el campo Nombre---");
			find(textapellidosadmusu).type(CampoApellidoAdmUsu);
			System.out.print("Se diligenció el campo Apellido---");
			String cliente = conexionQueryAdmUsu.AdmUsuClienteCrearUsuario();
			find(listaclienteadmusu).click();
			getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			Select listaCliente = new Select (find(listaclienteadmusu));
			listaCliente.selectByVisibleText(cliente);
			System.out.print("Se diligenció el campo Cliente---");
			String sucursal = conexionQueryAdmUsu.AdmUsuSucursalCrearUsuario();
			find(listasucursaladmusu).click();
			getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			Select listaSucursal = new Select (find(listasucursaladmusu));
			listaSucursal.selectByVisibleText(sucursal);			
			System.out.print("Se diligenció el campo Sucursal---");
			Serenity.takeScreenshot();
			find(botonGuardarAdmUsu).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(botonAceptarCrearAdmUSu));
			System.out.print("Se hizó clic en el botón Guardar---");
			Serenity.takeScreenshot();
			find(botonAceptarCrearAdmUSu).click();
			Thread.sleep(1000);
			System.out.print("Se hizó clic en el botón Aceptar---");
			if (element(ventanaUsuarioCreadoAdmUsu).isVisible()) {
				System.out.print("Al finalizar el proceso de creación de usuario, NO se cerró correctamente la ventana de confirmación---");
				getDriver().quit();
			}
			else {
				System.out.print("El proceso de creación de usuario finalizó correctamente---");
			}
	}

	public void validaUsuarioCreado() throws SQLException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String email = conexionQueryAdmUsu.AdmUsuCorreoCrearUsuario();
		find(AdmUsutextBuscar).type(email);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaCorreo));
		System.out.print("Se realiza busqueda del usuario creado con correo: "+email+"---");
		Serenity.takeScreenshot();
		String DatoCorreoGrillaAdminUsu = find(AdmUsugrillaCorreo).getText();
		assertEquals(DatoCorreoGrillaAdminUsu,email);
		System.out.print("Se creó correctamente el usuario con correo: "+email+"---");
	}

	public void validaCancelarCrearUsuario() throws InterruptedException {
		validaAgregar();		
		find(botonCancelarAdmUsu).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Cancelar---");
		Serenity.takeScreenshot();
		if (element(ventanaCrearUsuario).isVisible()) {
			System.out.print("Al cancelar el proceso de asignación de grupos, NO se cerró correctamente la ventana de creación de usuarios---");
			getDriver().quit();
		}
		else {
			System.out.print("La cancelación del proceso de creación de usuarios se realizó correctamente---");
		}	
	}

	public void validaTitulos() throws FileNotFoundException, IOException {;
		if (element(AdmUsugrilla).isVisible()) {
			String TituloGrillaCorreo = find(AdmUsutituloGrillaCorreo).getText();
			String TituloCorreo = loadProperty.getProperty("Admusu_TituloGrillaCorreo");
			assertEquals(TituloGrillaCorreo,TituloCorreo);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloCorreo+"---");	
			String TituloGrillaNombre = find(AdmUsutituloGrillaNombre).getText();
			String TituloNombre = loadProperty.getProperty("AdmUsu_TituloGrillaNombres");
			assertEquals(TituloGrillaNombre,TituloNombre);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloNombre+"---");
			String TituloGrillaApellido = find(AdmUsutituloGrillaApellido).getText();
			String TituloApellido = loadProperty.getProperty("AdmUsu_TituloGrillaApellidos");
			assertEquals(TituloGrillaApellido,TituloApellido);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloApellido+"---");
			String TituloGrillaGrupos = find(AdmUsutituloGrillaGrupos).getText();
			String TituloGrupos = loadProperty.getProperty("AdmUsuTituloGrillaGrupos");
			assertEquals(TituloGrillaGrupos,TituloGrupos);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloGrupos+"---");
			String TituloGrillaSeries = find(AdmUsutituloGrillaSeries).getText();
			String TituloSeries = loadProperty.getProperty("AdmUsu_TituloGrillaSeries");
			assertEquals(TituloGrillaSeries,TituloSeries);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloSeries+"---");
			String TituloGrillaActivo = find(AdmUsutituloGrillaActivo).getText();
			String TituloActivo = loadProperty.getProperty("AdmUsu_TituloGrillaActivo");
			assertEquals(TituloGrillaActivo,TituloActivo);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloActivo+"---");
			String TituloGrillaAccion = find(AdmUsutituloGrillaAccion).getText();
			String TituloAccion = loadProperty.getProperty("AdmUsu_TituloGrillaAccion");
			assertEquals(TituloGrillaAccion,TituloAccion);
			System.out.print("Se visualiza correctamente el título de la grilla "+TituloAccion+"---");
		}
		else {
			System.out.print("No es posible validar los títulos porque NO se encontró la grilla---");
			getDriver().quit();
		}	
	}

	public void validaAdministrarVerGrupos() throws InterruptedException, FileNotFoundException, IOException, SQLException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String emailUsu = conexionQueryAdmUsu.AdmUsuBuscarCorreo();
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaCorreo));
		Serenity.takeScreenshot();
		find(AdmUsubotonAdministrarGrupo).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se hizó clic en el botón Administrar grupo---");
		Serenity.takeScreenshot();
		String TituloVentanaAsignarGruposUsuario = find(AdmUsutituloAsignarGruposUsuario).getText();
		String TituloVtnAsignarGruposUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaAsignarGruposUsuario");
		assertEquals(TituloVentanaAsignarGruposUsuario,TituloVtnAsignarGruposUsuario);
		System.out.print("Se visualiza correctamente la ventana "+TituloVtnAsignarGruposUsuario+"---");
		Select listaAsigGrupoUsuario = new Select (find(AdmUsulistaAsignarGrupoUSuario));
		listaAsigGrupoUsuario.deselectAll();		
		Serenity.takeScreenshot();
		System.out.println("Se desmarcaron los grupos que se encontraban seleccionados---");
		List<String> seleccionGrupo = conexionQueryAdmUsu.AdmUsuAsignarGrupo();
		for (int i=0; i<seleccionGrupo.size(); i++) {
			listaAsigGrupoUsuario.selectByVisibleText(seleccionGrupo.get(i));
		}
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se realizó la selección de grupos---");
		Serenity.takeScreenshot();
		find(AdmUsubotonGuardarAsigGrupUsu).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		System.out.println("Se hizó clic en el botón Guardar para realizar la asignción de grupos---");
		String TituloTransaccionAsigGrupUsu = find(AdmUsutituloTransaccionAsignarGrupo).getText();
		String TituloTranAsignarGrupo = loadProperty.getProperty("AdmUsu_TituloTranAsignarGrupo");
		assertEquals(TituloTransaccionAsigGrupUsu,TituloTranAsignarGrupo);
		System.out.print("El resultado del guardado de la asignación de grupos fue: "+TituloTransaccionAsigGrupUsu+"---");
		find(AdmUsubotonAceptarTranExitAsignarGrupo).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		System.out.print("Se hizó clic en el botón Aceptar---");
		if (element(AdmUsuventanaTranExitAsignarGrupo).isVisible()) {
			System.out.print("Al finalizar el proceso de asignación de grupos, NO se cerró la ventana "+TituloTransaccionAsigGrupUsu+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de asignación de grupos finalizó correctamente---");
		}
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		Serenity.takeScreenshot();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaCorreo));
		find(AdmUsubotonAdministrarGrupo).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se hizó clic en el botón Administrar grupo---");
		Serenity.takeScreenshot();
		find(AdmUsubotonCancelarTranExitAsignarGrupo).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se hizó clic en el botón Cancelar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaTranExitAsignarGrupo).isVisible()) {
			System.out.print("Al cancelar el proceso de asignación de grupos, NO se cerró la ventana "+TituloTransaccionAsigGrupUsu+"---");
			getDriver().quit();
		}
		else {
			System.out.print("La cancelación del proceso de asignación de grupos se realizó correctamente---");
		}
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsugrillaCorreo));
		find(AdmUsubotonVerGrupo).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se hizó clic en el botón Ver grupo---");
		String TituloVentanaGruposUsuario = find(AdmUsutituloGruposUsuario).getText();
		String TituloVtnGruposUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaGruposUsuario");
		assertEquals(TituloVentanaGruposUsuario,TituloVtnGruposUsuario);
		System.out.print("Se visualiza correctamente la ventana "+TituloVtnGruposUsuario+"---");		
		Select listaVerGrupo = new Select (find(AdmUsulistaGrupoUSuario));
		for (int i=0; i<seleccionGrupo.size(); i++) {
			listaVerGrupo.selectByVisibleText(seleccionGrupo.get(i));
		}
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se visualiza correctamente los grupos asignados---");		
		Serenity.takeScreenshot();		
		find(AdmUsubotonAceptarGU).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println("Se hizó clic en el botón Aceptar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaGruposUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Aceptar, NO se cerró la ventana "+TituloVtnGruposUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("La consulta de los grupos asignados finalizó correctamente");
		}	
	}

	public void validaAdministrarVerSeries() throws InterruptedException, FileNotFoundException, IOException, SQLException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String emailUsu = conexionQueryAdmUsu.AdmUsuBuscarCorreo();
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonAdministrarSeries));
		Serenity.takeScreenshot();
		find(AdmUsubotonAdministrarSeries).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Administrar series---");
		Serenity.takeScreenshot();
		String TituloVentanaAsignarSeriesUsuario = find(AdmUsutituloAsignarSeriesUsuario).getText();
		String TituloVtnAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaAsignarSeriesUsuario");
		assertEquals(TituloVentanaAsignarSeriesUsuario,TituloVtnAsignarSeriesUsuario);
		if (element(AdmUsubotonEliminarAsignarSeriesUsuario).isVisible()) {
			find(AdmUsubotonEliminarAsignarSeriesUsuario).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonCancelarDeseEliminarAsignarSeriesUsuario));
			System.out.print("Se hizó clic en el botón Eliminar---");
			Serenity.takeScreenshot();
			String TituloVentanaDeseaEliminarAsignarSeriesUsuario = find(AdmUsutituloDeseaEliminarAsignarSeriesUsuario).getText();
			String TituloVtnDeseaEliminarAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaDeseaEliminarAsignarSeriesUsuario");
			assertEquals(TituloVentanaDeseaEliminarAsignarSeriesUsuario,TituloVtnDeseaEliminarAsignarSeriesUsuario);
			find(AdmUsubotonCancelarDeseEliminarAsignarSeriesUsuario).click();
			getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			System.out.print("Se hizó clic en el botón Cancelar---");
			Serenity.takeScreenshot();
			if (element(AdmUsuventanaDeseaEliminarAsignarSeriesUsuario).isVisible()) {
				System.out.print("Al hacer clic en el botón Cancelar, NO se cerró la ventana "+TituloVentanaDeseaEliminarAsignarSeriesUsuario+"---");
			}
			else {
				System.out.print("El proceso de eliminación de series se canceló correctamente---");
			}
			boolean t = true;
			for (@SuppressWarnings("unused")
			int i = 0; t; i++) {
				if (element(AdmUsubotonEliminarAsignarSeriesUsuario).isVisible()) {
					find(AdmUsubotonEliminarAsignarSeriesUsuario).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonAceptarDeseEliminarAsignarSeriesUsuario));
					System.out.print("Se hizó clic en el botón Eliminar---");
					Serenity.takeScreenshot();
					find(AdmUsubotonAceptarDeseEliminarAsignarSeriesUsuario).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonCerrarSerieEliminadaAsignarSeriesUsuario));
					System.out.print("Se hizó clic en el botón Aceptar---");
					Serenity.takeScreenshot();
					find(AdmUsubotonCerrarSerieEliminadaAsignarSeriesUsuario).click();
					getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
					System.out.print("Se hizó clic en el botón Cerrar---");
					Serenity.takeScreenshot();
					continue;
				}
				break;
			}
			System.out.print("El proceso de elimicación de series se realizó correctamente---");
			find(AdmUsulistaClienteAsignarSeriesUsuario).click();
			Thread.sleep(1000);
			Serenity.takeScreenshot();
			asignarActualizarSeries();
		}
		else {
			asignarActualizarSeries();
			eliminarSeries();				
		}			
		find(AdmUsubotonCerrarAsignarSeriesUsuario).click();
		Thread.sleep(1000);
		System.out.print("Se hizó clic en el botón Cerrar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaAsignarSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloVentanaAsignarSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de asignación de series finalizó correctamente---");
		}
		verSeries();
	}
	
	public void asignarActualizarSeries( ) throws InterruptedException, SQLException, FileNotFoundException, IOException {
		find(AdmUsulistaClienteAsignarSeriesUsuario).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		Select listaClienteAsigSerieUsuario = new Select (find(AdmUsulistaClienteAsignarSeriesUsuario));		
		String Cliente = conexionQueryAdmUsu.AdmUsuClienteAsignarSerie();
		listaClienteAsigSerieUsuario.selectByVisibleText(Cliente);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se diligenció el campo Cliente---");
		Serenity.takeScreenshot();
		find(AdmUsulistaAreaAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		Select listaAreaAsigSerieUsuario = new Select (find(AdmUsulistaAreaAsignarSeriesUsuario));
		String Area = conexionQueryAdmUsu.AdmUsuAreaAsignarSerie();
		listaAreaAsigSerieUsuario.selectByVisibleText(Area);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se diligenció el campo Área---");
		Serenity.takeScreenshot();
		Select listaSeriesAsigSerieUsuario = new Select (find(AdmUsulistaSeriesAsignarSeriesUSuario));
		List<String> seleccionSeries = conexionQueryAdmUsu.AdmUsuSeriesAsignarSerie();
		for (int i=0; i<seleccionSeries.size(); i++) {
			listaSeriesAsigSerieUsuario.selectByVisibleText(seleccionSeries.get(i));
		}
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se realizó la selección de la(s) serie(s)---");
		Serenity.takeScreenshot();
		find(AdmUsubotonAsignarSerie).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Asignar serie---");
		Serenity.takeScreenshot();
		String TituloVentanaSerieInsertadaAsignarSeriesUsuario = find(AdmUsutituloSerieInsertadaAsignarSeriesUsuario).getText();
		String TituloVtnSerieInsertadaAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaSerieInsertadaAsignarSeriesUsuario");
		assertEquals(TituloVentanaSerieInsertadaAsignarSeriesUsuario,TituloVtnSerieInsertadaAsignarSeriesUsuario);
		find(AdmUsubotonCerrarSerieInsertadaAsignarSeriesUsuario).click();
		Thread.sleep(1000);
		System.out.print("Se hizó clic en el botón Cerrar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaSerieInsertadaAsignarSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloVentanaSerieInsertadaAsignarSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de asignación de series finalizó correctamente---");
		}
		find(AdmUsubotonMasivoAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se realizó la marcación de MASIVO---");
		Serenity.takeScreenshot();
		String TituloVentanaSerieActualizadaAsignarSeriesUsuario = find(AdmUsutituloSerieActualizadaAsignarSeriesUsuario).getText();
		String TituloVtnSerieActualizadaAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaSerieActualizadaAsignarSeriesUsuario");
		assertEquals(TituloVentanaSerieActualizadaAsignarSeriesUsuario,TituloVtnSerieActualizadaAsignarSeriesUsuario);
		find(AdmUsubotonCerrarSerieActualizadaAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Cerrar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaSerieActualizadaAsignarSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloVentanaSerieActualizadaAsignarSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de actualización de series finalizó correctamente---");
		}
	}
	
	public void eliminarSeries() {
		find(AdmUsubotonEliminarAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Eliminar---");
		Serenity.takeScreenshot();
		String TituloVentanaDeseaEliminarAsignarSeriesUsuario = find(AdmUsutituloDeseaEliminarAsignarSeriesUsuario).getText();
		String TituloVtnDeseaEliminarAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaDeseaEliminarAsignarSeriesUsuario");
		assertEquals(TituloVentanaDeseaEliminarAsignarSeriesUsuario,TituloVtnDeseaEliminarAsignarSeriesUsuario);
		find(AdmUsubotonCancelarDeseEliminarAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Cancelar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaDeseaEliminarAsignarSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloVentanaDeseaEliminarAsignarSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de eliminación de series se canceló correctamente---");
		}
		find(AdmUsubotonEliminarAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Eliminar---");
		Serenity.takeScreenshot();
		find(AdmUsubotonAceptarDeseEliminarAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Aceptar---");
		Serenity.takeScreenshot();
		String TituloVentanaSerieEliminadaAsignarSeriesUsuario = find(AdmUsutituloSerieEliminadaAsignarSeriesUsuario).getText();
		String TituloVtnSerieEliminadaAsignarSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaSerieEliminadaAsignarSeriesUsuario");
		assertEquals(TituloVentanaSerieEliminadaAsignarSeriesUsuario,TituloVtnSerieEliminadaAsignarSeriesUsuario);
		find(AdmUsubotonCerrarSerieEliminadaAsignarSeriesUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Cerrar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaSerieEliminadaAsignarSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloVentanaSerieEliminadaAsignarSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("El proceso de eliminación de series finalizó correctamente---");
		}
	}
	
	public void verSeries() throws SQLException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String emailUsu = conexionQueryAdmUsu.AdmUsuBuscarCorreo();
		find(AdmUsutextBuscar).type(emailUsu);
		Serenity.takeScreenshot();
		find(AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonAdministrarSeries));
		Serenity.takeScreenshot();
		find(AdmUsubotonVerSeries).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Ver series---");
		Serenity.takeScreenshot();
		String TituloSeriesUsuario = find(AdmUsutituloVentanaSeriesUsuario).getText();
		String TituloVtnSeriesUsuario = loadProperty.getProperty("AdmUsu_TituloVentanaSeriesUsuario");
		assertEquals(TituloSeriesUsuario,TituloVtnSeriesUsuario);
		System.out.print("Se visualiza correctamente la ventana "+TituloSeriesUsuario+"---");
		Select listaSeriesUsuario = new Select (find(AdmUsulistaSeriesUSuario));
		List<String> consultaSeries = conexionQueryAdmUsu.AdmUsuSeriesConsultarSerie();
		for (int i=0; i<consultaSeries.size(); i++) {
			listaSeriesUsuario.selectByVisibleText(consultaSeries.get(i));
		}
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		System.out.print("Las series asignadas se visualizan correctamente---");
		find(AdmUsubotonCerrarSeriesUSuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.print("Se hizó clic en el botón Cerrar---");
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaSeriesUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Cerrar, NO se cerró la ventana "+TituloSeriesUsuario+"---");
			getDriver().quit();
		}
		else {
			System.out.print("La consulta de series asignadas finalizó correctamente---");
		}
	}

	public void validaEditarUsuario() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String CorreoAdmUsu = find(AdmUsugrillaCorreo).getText();
		find(AdmUsutextBuscar).type(CorreoAdmUsu);
		Serenity.takeScreenshot();
		find (AdmUsubotonBuscar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonAccion));
		System.out.print("Se realiza consulta del usuario a editar---");
		Serenity.takeScreenshot();
		
		
		
		
		find(AdmUsubotonAccion).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdmUsubotonEditarUsuario));
		System.out.print("Se hizó clic en el botón Acción---");
		Serenity.takeScreenshot();
		find(AdmUsubotonEditarUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		String TituloVentanaEditarUsuario = find(AdmUsutituloEditarUsuario).getText();
		String TituloVtnEditarUsuario = (loadProperty.getProperty("AdmUsu_TituloVentanaEditarUsuario"));
		assertEquals(TituloVentanaEditarUsuario,TituloVtnEditarUsuario);
		System.out.print("Se visualiza correctamente la ventana "+TituloVentanaEditarUsuario+"---");
		String NombreEditado = loadProperty.getProperty("AdmUsu_NombresEditadoEditarUsuario");
		find(AdmUsutextNombresEditarUsuario).type(NombreEditado);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		String ApellidoEditado = loadProperty.getProperty("AdmUsu_ApellidosEditadoEditarUsuario");
		find(AdmUsutextApellidosEditarUsuario).type(ApellidoEditado);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		
		
		Select listClienteEditarUsuario = new Select (find(AdmUsulistaClienteEditarUsuario));
		String listaClienteEditadoEditarUsuario = loadProperty.getProperty("AdmUsu_listaClienteEditadoEditarUsuario");
		listClienteEditarUsuario.selectByVisibleText(listaClienteEditadoEditarUsuario);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		Select listSucursalEditarUsuario = new Select (find(AdmUsulistaSucursalEditarUsuario));
		String listaSucursalEditadoEditarUsuario=loadProperty.getProperty("AdmUsu_listaSucursalEditadoEditarUsuario");
		listSucursalEditarUsuario.selectByVisibleText(listaSucursalEditadoEditarUsuario);
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		find(AdmUsubotonGuadarEditarUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		String TituloTransaccionEditarUsuario = find(AdmUsutituloVentanaTransaccionEditarUsuario).getText();
		String TituloUsuarioActualizado = loadProperty.getProperty("AdmUsu_TituloUsuarioActualizado");
		assertEquals(TituloTransaccionEditarUsuario,TituloUsuarioActualizado);
		
		find(AdmUsubotonAceptarTransaccionEditarUsuario).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaTransaccionEditarUsuario).isVisible()) {
			System.out.print("Al hacer clic en el botón Aceptar, NO se cerró la ventana "+TituloTransaccionEditarUsuario+"---");
		}
		else {
			System.out.print("La edición de series asignadas finalizó correctamente---");
		}
		find(AdmUsutextBuscar).type(CorreoAdmUsu);
		Serenity.takeScreenshot();
		find (AdmUsubotonBuscar).click();
		getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Serenity.takeScreenshot();
		String NombresAdmUsu = find(AdmUsugrillaNombres).getText();
		String ApellidosAdmUsu = find(AdmUsugrillaApellidos).getText();
		String TituloGrillaNombre = find(AdmUsutituloGrillaNombre).getText();
		String TituloGrillaApellido = find(AdmUsutituloGrillaApellido).getText();
		assertEquals(NombresAdmUsu,NombreEditado);
		System.out.print("Se actualizó correctamente el campo "+TituloGrillaNombre+"---");
		assertEquals(ApellidosAdmUsu,ApellidoEditado);
		System.out.print("Se actualizó correctamente el campo "+TituloGrillaApellido+"---");
		
		
		
		
	}

	public void validaSubirFirma() throws InterruptedException {
		String Guion = loadProperty.getProperty("Guion");
		String MSGVisualizaVentanaOK = loadProperty.getProperty("MSGVisualizaVentanaOK");
		String MSGResultadoProceso = loadProperty.getProperty("MSGResultadoProceso");
		String MSGCerrarVentanaFAIL = loadProperty.getProperty("MSGCerrarVentanaFAIL");
		String MSGCerrarVentanaOK = loadProperty.getProperty("MSGCerrarVentanaOK");
		String MSGVisualizaImagenOK = loadProperty.getProperty("MSGVisualizaImagenOK");
		String CorreoAdmUsu = find(AdmUsugrillaCorreo).getText();
		find(AdmUsubotonAccion).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonSubirFirma).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		String TituloAgregarFirma = find(AdmUsutituloAgregarFirma).getText();
		String TituloVtnAgregarFirma = loadProperty.getProperty("AdmUsu_TituloVentanaAgregarFirma");
		assertEquals(TituloAgregarFirma,TituloVtnAgregarFirma);
		System.out.print(MSGVisualizaVentanaOK+TituloAgregarFirma+Guion);
		Thread.sleep(1000);
		find(AdmUsubotonCancelarSubirFirma).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonAccion).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonSubirFirma).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		WebElement fileInput = find(AdmUsubotonnBuscarFirma);
		String Ubicacion = loadProperty.getProperty("AdmUsu_UbicacionFirmaDigital");
		fileInput.sendKeys(Ubicacion);
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonGuardarSubirFirma).click();
		String TituloOperacionExitosaSubirFirma = find(AdmUsutituloVtnOperacionExitosa).getText();
		String TituloVtnOperacionExitosaSubirFirma = loadProperty.getProperty("AdmUsu_TituloVtnOperacionExitosaSubirFirma");
		assertEquals(TituloOperacionExitosaSubirFirma,TituloVtnOperacionExitosaSubirFirma);
		System.out.print(MSGResultadoProceso+TituloOperacionExitosaSubirFirma+Guion);
		find(AdmUsubotonAceptarOperacionExitosaSubirFirma).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		if (element(AdmUsuventanaOperacionExitosaSubirFirma).isVisible()) {
			System.out.print(MSGCerrarVentanaFAIL+TituloOperacionExitosaSubirFirma+Guion);
		}
		else {
			System.out.print(MSGCerrarVentanaOK+TituloOperacionExitosaSubirFirma+Guion);
		}
		find(AdmUsutextBuscar).type(CorreoAdmUsu);
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find (AdmUsubotonBuscar).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonAccion).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		find(AdmUsubotonSubirFirma).click();
		Thread.sleep(1000);
		Serenity.takeScreenshot();
		String LabelFirmaActual = find(AdmUsulabelFirmaActualSubirFirma).getText();
		if (element(AdmUsuimagenSubirFirma).isVisible()) {
			System.out.print(MSGVisualizaImagenOK+LabelFirmaActual+Guion);
		}
	}	
	
}
