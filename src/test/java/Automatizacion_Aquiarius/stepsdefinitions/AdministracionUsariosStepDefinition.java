package Automatizacion_Aquiarius.stepsdefinitions;

import Automatizacion_Aquiarius.pageobjects.AdministracionUsariosPageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdministracionUsariosStepDefinition {
	
	AdministracionUsariosPageObjects AdministracionUsariosPageObjects;

	@When("^ingresa al módulo de administración de usuarios$")
	public void ingresa_al_módulo_de_administración_de_usuarios() throws Throwable {
		AdministracionUsariosPageObjects.ingresarModulo();
	}

	@Then("^valida busqueda$")
	public void finaliza_la_validación_del_módulo() throws Throwable {
		AdministracionUsariosPageObjects.validaBusqueda();
	}
	
	@Then("^valida Agregar$")
	public void valida_Agregar() throws Throwable {
		AdministracionUsariosPageObjects.validaAgregar();
	}

	@Then("^valida Crear Usuario$")
	public void valida_Crear_Usuario() throws Throwable {
		AdministracionUsariosPageObjects.validaCrearUsuario();
	}

	@Then("^valida usuario creado$")
	public void valida_usuario_creado() throws Throwable {
		AdministracionUsariosPageObjects.validaUsuarioCreado();
	}

	@Then("^valida Cancelar Crear Usuario$")
	public void valida_Cancelar_Crear_Usuario() throws Throwable {
		AdministracionUsariosPageObjects.validaCancelarCrearUsuario();
	}
	
	@Then("^valida Los títulos de la grilla$")
	public void valida_Los_títulos_de_la_grilla() throws Throwable {
		AdministracionUsariosPageObjects.validaTitulos();
	}
	
	@Then("^valida administrar y ver grupo$")
	public void valida_administrar_y_ver_grupo() throws Throwable {
		AdministracionUsariosPageObjects.validaAdministrarVerGrupos();
	}
	
	@Then("^valida administrar y ver series$")
	public void valida_administrar_y_ver_series() throws Throwable {
		AdministracionUsariosPageObjects.validaAdministrarVerSeries();
	}
	
	@Then("^valida Editar usuario$")
	public void valida_Editar_usuario() throws Throwable {
		AdministracionUsariosPageObjects.validaEditarUsuario();
	}

	@Then("^subir firma$")
	public void subir_firma() throws Throwable {
		AdministracionUsariosPageObjects.validaSubirFirma();
	}
	
}
