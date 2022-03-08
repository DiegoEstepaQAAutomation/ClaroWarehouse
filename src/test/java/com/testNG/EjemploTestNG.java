package com.testNG;

import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import com.Utilidades.MyScreenRecorder;

import PagObjet.PagObjectCerrarSesion;
import PagObjet.PagObjectDatos;
import PagObjet.PagObjectSelectElement;
import PagObjet.PagObjectTarjeta;
//import PagObjet.PagObjetAlerts;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EjemploTestNG

{
	private AppiumDriver<MobileElement> driver;

	PagObjectDatos datos;
	PagObjectTarjeta tarjeta;
	PagObjectCerrarSesion sesion;
	ClaseBase claseBase;
	PagObjectSelectElement element;
	//By txtBusquedaGoogle = By.name("q");
	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;
	String valor;
	String valor1;

	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({"rutaImagenReporte","rutaOutut","platformName","deviceName","platformVersion","appPackage","appActivity","noReset","autoGrantPermissior" })

	public void beforeClass(String rutaImagenReporte,@Optional("default")String rutaOutut,@Optional("default")String platformName,@Optional("default")String deviceName,
				@Optional("default")String platformVersion,@Optional("default")String appPackage,@Optional("default")String appActivity,@Optional("default")String noReset,@Optional("default")String autoGrantPermissior ) {

		driver= ClaseBase.chromeDriverConnection(platformName,deviceName,platformVersion,appPackage,appActivity,noReset,autoGrantPermissior);
		
		
		claseBase = new ClaseBase(driver);
		
		generarReportepdf = new GenerarReportePdf();
		
		
		datos = new PagObjectDatos(driver);
		
		tarjeta = new PagObjectTarjeta(driver);
		
		sesion = new PagObjectCerrarSesion(driver);
		
		//libre = new PagObjectMercadoLibre(driver);
		
	
		
		
        generarReportepdf.setRutaImagen(rutaImagenReporte);
		
		claseBase.setRutaOutut(rutaOutut,driver);
		
		element = new PagObjectSelectElement(driver);
		
		//libre.setUrl3(url3);

	}
	
	@DataProvider(name = "ClaroMobil")
	public Object[][] datos() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja1");

		return arreglo;
	}
	
	

	// TEST MERCURY TOOLS QA
	@Test(dataProvider = "ClaroMobil",priority = 5)
	public void pruebaInicialTest(String Ejecutar,String generarEvidencia, String Barrio,String NumeroPrincipal,String NumeroSecundario,String compu,String numero,
			   String Correo,String Password)
			throws Exception {

		if (Ejecutar.equals("Si")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			//tools.urlAcceso();

			if (generarEvidencia.contains("Si")) {

				claseBase.inivideo();
				
				
				generarReportepdf.crearPlantilla(nomTest,rutaCarpeta);
				
				
				
				element.CallPage(rutaCarpeta,generarEvidencia,Correo, Password,Barrio,NumeroPrincipal,NumeroSecundario,compu,numero);
				sesion.CerrarSesion(rutaCarpeta, generarEvidencia);
				
				//valor=datos.SeleccionarDate(rutaCarpeta, generarEvidencia, Barrio, NumeroPrincipal, NumeroSecundario, numero, compu);
				
				claseBase.finVideo(rutaCarpeta);
				generarReportepdf.cerrarPlantilla();
			} else {
				element.CallPage(rutaCarpeta,generarEvidencia, Correo,Password,Barrio,NumeroPrincipal,NumeroSecundario,compu,numero);
				sesion.CerrarSesion(rutaCarpeta, generarEvidencia);
				
				//valor=datos.SeleccionarDate(rutaCarpeta, generarEvidencia, Barrio, NumeroPrincipal, NumeroSecundario, numero, compu);
			
			}
			assert valor.contains(NumeroSecundario);
			//assert valor.contains(Barrio);
		}
	}
	
	
	

	


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
