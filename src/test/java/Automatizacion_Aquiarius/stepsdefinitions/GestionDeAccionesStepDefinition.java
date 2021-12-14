package Automatizacion_Aquiarius.stepsdefinitions;

import Automatizacion_Aquiarius.pageobjects.GestionDeAccionesPageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GestionDeAccionesStepDefinition {
	
	GestionDeAccionesPageObjects GestionDeAccionesPageObjects;
	
	@When("^ingresa al módulo de gestión de acciones$")
	public void ingresa_al_módulo_de_gestión_de_acciones() throws Throwable {
		GestionDeAccionesPageObjects.ingresarModulo();
	}

	@Then("^valida persona natural y persona jurídica$")
	public void valida_persona_natural_y_persona_jurídica() throws Throwable {
		GestionDeAccionesPageObjects.validaPersona_Natural_Y_Juridica();
	}

}
