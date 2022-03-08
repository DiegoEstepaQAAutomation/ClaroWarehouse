
//AUTOR DIEGO FERNANDO ESTEPA RINCON
// 08-03-2022
//CLARO NG

package com.testNG;

import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import com.Utilidades.MyScreenRecorder;

import PagObjet.PagObjectCerrarSesion;
import PagObjet.PagObjectDatos;
import PagObjet.PagObjectSelectElement;
import PagObjet.PagObjectSesion;
import PagObjet.PagObjectTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;

import org.testng.annotations.AfterClass;

public class RunPagos 

{
	
	private AppiumDriver<MobileElement> driver;

	PagObjectDatos datos;
	PagObjectTarjeta tarjeta;
	PagObjectCerrarSesion sesion;
	ClaseBase claseBase;
	PagObjectSelectElement element;
	
	PagObjectSesion cierrapagos;
	//By txtBusquedaGoogle = By.name("q");
	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;
	String valor;
	String valorA;
	
	
	
	
	
  
  @SuppressWarnings("unchecked")
  @BeforeClass
  @Parameters({"rutaImagenReporte","rutaOutut","platformName","deviceName","platformVersion","appPackage","appActivity","noReset","autoGrantPermissior" })
  
  
  public void beforeClass(String rutaImagenReporte,@Optional("default")String rutaOutut,@Optional("default")String platformName,@Optional("default")String deviceName,
			@Optional("default")String platformVersion,@Optional("default")String appPackage,@Optional("default")String appActivity,@Optional("default")String noReset,@Optional("default")String autoGrantPermissior) {
  
	    driver= ClaseBase.chromeDriverConnection(platformName,deviceName,platformVersion,appPackage,appActivity,noReset,autoGrantPermissior);
		
		
		claseBase = new ClaseBase(driver);
		
		generarReportepdf = new GenerarReportePdf();
		
		
		datos = new PagObjectDatos(driver);
		
		tarjeta = new PagObjectTarjeta(driver);
		
		sesion = new PagObjectCerrarSesion(driver);
		
		cierrapagos = new PagObjectSesion(driver);
		
		//libre = new PagObjectMercadoLibre(driver);
		
	
		
		
      generarReportepdf.setRutaImagen(rutaImagenReporte);
		
		claseBase.setRutaOutut(rutaOutut,driver);
		
		element = new PagObjectSelectElement(driver);
	
  
  
  
  }
  
  
  @Test(dataProvider ="Garuda")
  
  public void Pagos (String Ejecutar1,String generarEvidencia, String Correo2,String Password,String Tarjeta,String codigoSeguridad,String nombreTarjeta,
		   String numeroDocumento,String telefono)  throws Exception 
  {
	  if (Ejecutar1.equals("Si")) {
		  
		  
		  	//setimg(0) setear el metodo de imagen en blanco 
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			//tools.urlAcceso();

			if (generarEvidencia.contains("Si")) {

				claseBase.inivideo();
				
				
				
				generarReportepdf.crearPlantilla(nomTest,rutaCarpeta);
				
				
				
				
				tarjeta.Tarjeta(Correo2, rutaCarpeta, generarEvidencia, Password, Tarjeta, codigoSeguridad, nombreTarjeta, telefono,numeroDocumento);
				
				cierrapagos.CerrarPagos(rutaCarpeta, generarEvidencia);
				
				//valor=datos.SeleccionarDate(rutaCarpeta, generarEvidencia, Barrio, NumeroPrincipal, NumeroSecundario, numero, compu);


				claseBase.finVideo(rutaCarpeta);
				
				
				generarReportepdf.cerrarPlantilla();
			} else {
				tarjeta.Tarjeta(Correo2, rutaCarpeta, generarEvidencia, Password, Tarjeta, codigoSeguridad, nombreTarjeta, telefono,numeroDocumento);
				cierrapagos.CerrarPagos(rutaCarpeta, generarEvidencia);
				
				//valor=datos.SeleccionarDate(rutaCarpeta, generarEvidencia, Barrio, NumeroPrincipal, NumeroSecundario, numero, compu);
			
			}
			assert valor.contains(Tarjeta);
			//assert valorA.contains(Barrio);
		}

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  @DataProvider(name = "Garuda")
  
  public Object [][] datos9() throws Exception {  
	  
	  Object [][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja4");
	  return arreglo;
	  
  }
  
  

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
