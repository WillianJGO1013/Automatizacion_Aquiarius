package Automatizacion_Aquiarius.pageobjects;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automatizacion_Aquiarius.elements.AquariusElements;
import jxl.read.biff.BiffException;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;


public class AquariusPageObjects extends PageObject{
	
Properties loadProperty = new Properties();
	
	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}
	
	//INICIO
		static By Ingresar = AquariusElements.btnIngresar.getValor_campo();
		
	//INICIAR SESION
		static By PanelInciarSesion = AquariusElements.pnlInciarSesion.getValor_campo();
		static By CorreoElectronico = AquariusElements.txtCorreoElectronico.getValor_campo();
		static By Clave = AquariusElements.txtClave.getValor_campo();
		static By Enviar = AquariusElements.btnEnviar.getValor_campo();
		
	

	public void autenticar() throws FileNotFoundException, IOException, BiffException, InterruptedException {
		loadProperty.load(new FileReader("./params.properties"));
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		String TituloInicial = loadProperty.getProperty("InicioTitulo");
		String CredencialesCorreo = loadProperty.getProperty("CredencialesCorreo");
		String CredencialesContrasena = loadProperty.getProperty("CredencialesContrasena");
		assertEquals(TituloInicial,getDriver().getTitle());
		System.out.print("Se abrió correctamente la página Aquarius---");
		find(Ingresar).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(PanelInciarSesion));
		System.out.print("Se hizó clic en el botón Ingresar---");
		if (element(PanelInciarSesion).isEnabled()) {
			System.out.print("Se abrió correctamente la página Login---");
			find(CorreoElectronico).type(CredencialesCorreo);
			find(Clave).type(CredencialesContrasena);
			Serenity.takeScreenshot();
			find(Enviar).click();
			getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			System.out.print("Se hizó clic en el botón Enviar---");
			String TituloHome = loadProperty.getProperty("InicioTituloHome");
			assertEquals(TituloHome,getDriver().getTitle());
			System.out.print("Se abrió correctamente la página Home---");
			Serenity.takeScreenshot();
		}
	}

}
