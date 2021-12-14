package Automatizacion_Aquiarius.stepsdefinitions;

import Automatizacion_Aquiarius.pageobjects.AquariusPageObjects;
import cucumber.api.java.en.Given;

public class AquariusStepDefinition {
	
	AquariusPageObjects AquariusPageObjects;
	
	@Given("^un usuario que ingresa al aplicativo Aquarius$")
	public void un_usuario_que_ingresa_al_aplicativo_Aquarius() throws Throwable {
		AquariusPageObjects.open();
	}

	@Given("^se autentica con usuario y contraseña$")
	public void se_autentica_con_usuario_y_contraseña() throws Throwable {
		AquariusPageObjects.autenticar();
	}

}
