package Automatizacion_Aquiarius.elements;

import org.openqa.selenium.By;

public enum AquariusElements {
	
/////////////////////////////////////////////////BASE/////////////////////////////////////////////////////
	
	//INICIO
		btnIngresar (By.xpath("//*[@id=\"navbarCollapse\"]/a")),
		
	//INICIAR SESION
		pnlInciarSesion (By.xpath("/html/body/main/main/div/div/div")),
		txtCorreoElectronico (By.xpath("/html/body/main/main/div/div/div/main/form/fieldset/div[1]/div/input")),
		txtClave (By.xpath("/html/body/main/main/div/div/div/main/form/fieldset/div[2]/div/input")),
		btnEnviar (By.xpath("/html/body/main/main/div/div/div/main/form/div/button")),
	
///////////////////////////////////////////ADMINISTRACIÓN USUARIOS////////////////////////////////////////
	
	//HOME
		btnAdministracionUsuarios (By.xpath("//*[@id='sidebar']/div[2]/ul/li[34]/a/i")),
		
	//ADMINISTRACIÓN USUARIOS
		ttlAdmUsu (By.xpath("//*[@id=\"root\"]/div/div[2]/nav/div/div[1]/a")),
		grllCorreoAdmUsu (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[1]")),
		grllNombresAdmUsu (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[2]")),
		grllApellidosAdmUsu (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[3]")),
	
	//BUSCAR ADMINISTRACIÓN USUARIOS
		txtBuscar (By.xpath("//*[@id='textSearch']")),
		btnBuscar (By.xpath("//*[@id='form-list']/div/div[1]/div/button/i")),
	
	//CREAR ADMINISTRACIÓN USUARIOS
		btnAgregarAdmUsu (By.xpath("//*[@id='form-list']/div/div[2]/button")),
		vtnCrearUsuarioAdmUsu (By.xpath("//h5[contains(text(),'Crear Usuario')]")),
		txtCorreoAdmUsu (By.name("correo")),
		txtNombresAdmUsu (By.xpath("//*[@id='form-list']/div[1]/div[2]/div/input")),
		txtApellidosAdmUsu (By.xpath("//*[@id='form-list']/div[2]/div[1]/div/input")),
		lstClienteAdmUsu (By.xpath("//*[@id='form-list']/div[2]/div[2]/div/select")),
		lstSucursalAdmUsu (By.xpath("//*[@id='form-list']/div[3]/div[1]/div/select")),
		btnGuardarAdmUsu (By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/button[1]")),
		btnCancelar (By.xpath("/html/body/div[4]/div/div[1]/div/div/div[3]/button[2]")),
		btnAceptarCrearAdmUSu (By.xpath("/html/body/div[3]/div/div[4]/div/button")),
		vtnUsuarioCreadoAdmUsu (By.xpath("//div[contains(text(),'Usuario creado con éxito')]")),
	
	//TÍTULOS GRILLA ADMINISTRACIÓN USUARIOS
		grllaAdmUsu (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div")),
		ttlgriCorreo (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[1]")),
		ttlgriNombre (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[2]")),
		ttlgriApellido (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[3]")),
		ttlgriGrupos (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[4]")),
		ttlgriSeries (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[5]")),
		ttlgriActivo (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[6]")),
		ttlgriAccion (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/thead/tr/th[7]")),
	
	//GRUPOS GRILLA ADMINISTRACIÓN USUARIOS
		btnVerGrupo (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[4]/button[1]")),
		btnAdministrarGrupo (By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[4]/button[2]")),
		vtnGruposUsuario (By.xpath("/html/body/div[3]/div/div[1]/div/div")),
		ttlGruposUsuario (By.xpath("//*[@class='modal-title']")),
		btnAceptarGU (By.xpath("//button[2][@class='btn-round btn-primary btn btn-secondary']")),
		opt1AsigGrupUsu (By.xpath("//*[@id=\"grupoAsignados\"]/option[1]")),
		opt2AsigGrupUsu (By.xpath("//*[@id=\"grupoAsignados\"]/option[3]")),
		opt3AsigGrupUsu (By.xpath("//*[@id=\"grupoAsignados\"]/option[5]")),
		opt4AsigGrupUsu (By.xpath("//*[@id=\"grupoAsignados\"]/option[8]")),
		btnGuardarAsigGrupUsu (By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/button[1]")),
		ttlAsignarGruposUsuario (By.xpath("//h5[contains(text(),'ASIGNAR GRUPO A USUARIO')]")),
		ttlTransaccionAsignarGrupo (By.xpath("//div[contains(text(),'Transacción exitosa')]")),
		btnAceptarTranExitAsignarGrupo(By.xpath("/html/body/div[3]/div/div[4]/div/button")),
		vtnTranExitAsignarGrupo(By.xpath("/html/body/div[2]/div")),
		btnCancelarTranExitAsignarGrupo(By.xpath("//*[@class='btn-round btn btn-secondary']")),
		lstAsignarGrupoUSuario(By.xpath("//*[@id='grupoAsignados']")),
		lstGrupoUSuario(By.xpath("//*[@id='diasNotificaciones']")),
	
	//SERIES GRILLA ADMINISTRACIÓN USUARIOS
		btnAdministrarSeries (By.xpath("//button[@title='Administrar series']")),
		btnVerSeries (By.xpath("//button[@title='Ver series']")),
		ttlAsignarSeriesUsuario (By.xpath("//h5[contains(text(),'Asignar serie a un usuario')]")),
		grllAsignarSerieUsuario (By.xpath("//*[@id='form-list']/div[2]/div[6]/div/table/tbody")),	
		lstClienteAsignarSeriesUsuario (By.xpath("//*[@id='form-list']/div[2]/div[2]/div/select")),
		lstAreaAsignarSeriesUsuario (By.xpath("//*[@id='form-list']/div[2]/div[3]/div/select")),
		lstSeriesAsignarSeriesUSuario (By.xpath("//*[@id='form-list']/div[2]/div[4]/div/select")),
		btnAsignarSerie (By.xpath("//*[@id='form-list']/div[2]/div[5]/button")),
		ttlSerieInsertadaAsignarSeriesUsuario (By.xpath("//div[contains(text(),'Serie insertada')]")),
		btnCerrarSerieInsertadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-button swal-button--confirm']")),
		btnEliminarAsignarSeriesUsuario (By.xpath("//button[@title='Eliminar']")),
		btnMasivoAsignarSeriesUsuario (By.xpath("//*[@id='form-list']/div[2]/div[6]/div/table/tbody/tr/td[4]/button/i")),
		ttlSerieActualizadaAsignarSeriesUsuario (By.xpath("//div[contains(text(),'Serie actualizada')]")),
		btnCerrarSerieActualizadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-modal']/div[4]/div/button")),
		ttlDeseaEliminarAsignarSeriesUsuario (By.xpath("//div[contains(text(),'Estas seguro?')]")),
		btnCancelarDeseEliminarAsignarSeriesUsuario (By.xpath("//*[@class='swal-modal']/div[4]/div/button")),
		btnAceptarDeseEliminarAsignarSeriesUsuario (By.xpath("//*[@class='swal-modal']/div[4]/div[2]/button")),
		ttlSerieEliminadaAsignarSeriesUsuario (By.xpath("//div[contains(text(),'Serie eliminada')]")),
		btnCerrarSerieEliminadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-modal']/div[3]/div/button")),
		btnCerrarAsignarSeriesUsuario (By.xpath("//*[@class='modal-content']/div[3]/button")),
		vtnAsignarSeriesUsuario (By.xpath("/html/body/div[3]/div/div[1]/div/div")),
		vtnDeseaEliminarAsignarSeriesUsuario (By.xpath("//*[@class='swal-overlay swal-overlay--show-modal']/div/div[contains(text(),'Estas seguro?')]")),
		vtnSerieActualizadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-overlay swal-overlay--show-modal']/div/div[contains(text(),'Serie actualizada')]")),
		vtnSerieInsertadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-modal']")),		
		vtnSerieEliminadaAsignarSeriesUsuario (By.xpath("//*[@class='swal-overlay swal-overlay--show-modal']/div/div[contains(text(),'Serie eliminada')]")),
		lstSeriesUSuario (By.xpath("//*[@id='seriesA']")),
		btnCerrarSeriesUSuario (By.xpath("//button[@class='btn-round btn btn-secondary']")),
		vtnSeriesUsuario (By.xpath("/html/body/div[3]/div/div[1]/div/div")),
		ttlVentanaSeriesUsuario (By.xpath("//h5[@class='modal-title']")),
	
	//ACCIÓN GRILLA ADMINISTRACIÓN USUARIOS
		btnAccion (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[7]/div/button")),
		btnEditarUsuario (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[7]/div/div/button[1]")),
		txtNombresEditarUsuario (By.xpath("//*[@id='form-list']/div[1]/div[2]/div/input")),
		txtApellidosEditarUsuario (By.xpath("//*[@id='form-list']/div[2]/div[1]/div/input")),
		lstClienteEditarUsuario (By.xpath("//*[@id='form-list']/div[2]/div[2]/div/select")),
		lstSucursalEditarUsuario (By.xpath("//*[@id='form-list']/div[3]/div[1]/div/select")),
		lstEstadoEditarUsuario (By.xpath("//*[@id='form-list']/div[3]/div[2]/div/select")),
		btnCancelarEditarUsuario (By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")),
		btnGuadarEditarUsuario (By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button[1]")),
		ttlEditarUsuario (By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/h5")),
		vtnEditarUsuario (By.xpath("/html/body/div[2]/div/div[1]/div/div")),
		ttlVentanaTransaccionEditarUsuario (By.xpath("//*[@class='swal-overlay swal-overlay--show-modal']/div/div[2]")),
		btnAceptarTransaccionEditarUsuario (By.xpath("/html/body/div[2]/div/div[4]/div/button")),
		vtnTransaccionEditarUsuario (By.xpath("//*[@class='swal-overlay swal-overlay--show-modal']/div")),
		btnSubirFirma (By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[7]/div/div/button[2]")),
		ttlAgregarFirma (By.xpath("//h5[contains(text(),'Agregar firma')]")),
		btnBuscarFirma (By.xpath("//*[@id='txtFileUpload']")),
		btnGuardarSubirFirma (By.xpath("//*[@class='modal-content']/div[3]/button")),
		btnCancelarSubirFirma (By.xpath("//*[@class='modal-content']/div[3]/button[2]")),
		ttlVtnOperacionExitosa (By.xpath("//div[contains(text(),'Operación exitosa')]")),
		btnAceptarOperacionExitosaSubirFirma (By.xpath("//*[@class='swal-modal']/div[4]/div/button")),
		vtnOperacionExitosaSubirFirma (By.xpath("/html/body/div[2]/div")),
		imgSubirFirma (By.xpath("//*[@class='form-row']/div/div/div/img")),
		lblFirmaActualSubirFirma (By.xpath("//*[@id='form-list']/div[1]/div/div/label")),

///////////////////////////////////////////GESTIÓN DE ACCIONES////////////////////////////////////////
	
	//HOME
		btnGestionDeAcciones (By.xpath("//*[@id='sidebar']/div[2]/ul/li[42]/a/i"));
	
	private By valor_campo;

	AquariusElements(By valorCampo) {
		this.setValor_campo(valorCampo);
	}

	public void setValor_campo(By valorCampo) {
		this.valor_campo = valorCampo;
	}
	
	public By getValor_campo() {
		return valor_campo;
	}

}
