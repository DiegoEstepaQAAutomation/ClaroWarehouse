package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapObjectCerrarSesion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectCerrarSesion extends MapObjectCerrarSesion

{
	
	
	public PagObjectCerrarSesion(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	
	
	public void CerrarSesion (File rutaCarpeta,String generarEvidencia) throws Exception
	{
		
		try {
			
			
		
			
		tiempoEspera(3000);
		click(btnPerfilEnd,rutaCarpeta,generarEvidencia);
		
		tiempoEspera(3000);
		scrollVertical1(rutaCarpeta,444,612,501, 2,generarEvidencia);
		
		tiempoEspera(3000);
		click(GreatFinale,rutaCarpeta,generarEvidencia);
		
		tiempoEspera(3000);
		click(Close,rutaCarpeta,generarEvidencia);
		
		
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}


		
	} 
	
	
	
	

}
