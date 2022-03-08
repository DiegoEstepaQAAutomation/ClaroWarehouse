package PagObjet;

import java.io.File;

import org.testng.annotations.Test;

import MapsObjet.MapObjectCerrarPagos;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectSesion extends MapObjectCerrarPagos 
{
	
	
	public PagObjectSesion(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	

	public void CerrarPagos (File rutaCarpeta,String generarEvidencia) throws Exception 
	{  
		
		
		try { 
			click(btnPerfilEnd,rutaCarpeta,generarEvidencia);
			
			scrollVertical1(rutaCarpeta,444,612,501, 2,generarEvidencia);
			tiempoEspera(2000);
			
			click(GreatFinale,rutaCarpeta,generarEvidencia);
			tiempoEspera(3000);
			
			click(Close,rutaCarpeta,generarEvidencia);
			tiempoEspera(11000);
			
			
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}


		
		
		
		
	}
	
	
  @Test
  public void f() {
  }
}
