package Automatizacion_Aquiarius.pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Automatizacion_Aquiarius.elements.AquariusElements;
import net.serenitybdd.core.pages.PageObject;

public class GestionDeAccionesPageObjects extends PageObject{
	
	Properties loadProperty = new Properties();
	
	//HOME
	static By botonGestionDeAcciones = AquariusElements.btnGestionDeAcciones.getValor_campo();

	public void ingresarModulo() {
		if (element(botonGestionDeAcciones).isEnabled()) {
			WebElement element = find(botonGestionDeAcciones);
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
			find(botonGestionDeAcciones).click();			
		}
		else {
			System.out.print(loadProperty.getProperty("MSGVisualizaBotonFAIL")+loadProperty.getProperty("NombreBotonGestionAcciones")+loadProperty.getProperty("Guion"));
		}
	}

	public void validaPersona_Natural_Y_Juridica() {
		
	}

}
