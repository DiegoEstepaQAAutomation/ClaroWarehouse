package PagObjet;

import java.io.File;
import java.util.Properties;

import org.testng.annotations.Test;

import MapsObjet.MapObjectElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectSelectElement extends MapObjectElement  
{
	
	
	public PagObjectSelectElement(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	//USAR XPATH PRIMERO DE RESOURCE ID  Y LUEGO DE Text
		public void CallPage (File rutaCarpeta,String generarEvidencia,String Correo2,String Password,String Barrio,String NumeroPrincipal,String NumeroSecundario,String compu, String numero) throws Exception 
		{
			
			try { 
				
			tiempoEspera(7000);
			click(btnLogin,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(btnIngreso,rutaCarpeta,generarEvidencia); 
			tiempoEspera(2000);
			

			sendkey(Correo2, btnCorreo, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			sendkey(Password, btnPassword, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
				
			
		
			
			click(btnAccepts1,rutaCarpeta,generarEvidencia);
			tiempoEspera(5000);
			
			
			
			//tocarPantalla(399,711);
			//tocarPantalla(343,802);
			
			
			//click(btnAccepts,rutaCarpeta,generarEvidencia);
			//tiempoEspera(5000);

			
			click(btnPerfil,rutaCarpeta,generarEvidencia);
			
			tiempoEspera(2000);
			click(btnDatos,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			tiempoEspera(2000);
			click(ActualizarDatos11,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			tiempoEspera(2000);
			click(ActualizaDatos,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			tiempoEspera(2000);
			click(CambiarDireccion,rutaCarpeta,generarEvidencia);
			tiempoEspera(15000);
			
			
			scrollVertical1(rutaCarpeta, 361, 560, 510, 5, generarEvidencia);
			tiempoEspera(1000);
			
			
			
			click(SeleccionDeparta,rutaCarpeta,generarEvidencia);
			
			tiempoEspera(2000);
			
			click(City,rutaCarpeta,generarEvidencia);
			
			tiempoEspera(2000);
			
			click(SeleccionCiudad,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			
			click(City2,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			
			sendkey(Barrio, barrio, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			
			click(PrimerTipo,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(Tipo,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			

			
			

			sendkey(NumeroPrincipal, numeroPrincipal, rutaCarpeta,generarEvidencia);
			tiempoEspera(3000);
			
			
			
			
			click(Sufijo,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			
			click(TipoDireccion,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			scrollVertical1(rutaCarpeta, 200, 720, 677, 18,generarEvidencia);
			
			
			sendkey(NumeroSecundario, numeroSecundario, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(MenuSufijoSecundario,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(sufijo2,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			sendkey(compu, Compu, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click (complemento,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(complemento2,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			sendkey(numero, Numero, rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(validar,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(cerrar,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(GoBack,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(GoBack,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(GoBack,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(GoBack,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			
			click(GoBack,rutaCarpeta,generarEvidencia);
			tiempoEspera(9000);
			
			//tocarPantalla(477,73);
			

				
		
			
				
			//colocarlo como falso al comienzo
			//colocarlo con un touch
			
			/*
			boolean elementoPresente
			try {
				
				driver.findElement(By.xpath(""))
				
				elementoPresente = true;
				
			} catch (NoSuchElementException e) {
				
				elementoPresente = false;
			}
			*/
			
			
			
			//click(AcceptDevice,rutaCarpeta);
			
			//btnPassword
			
			}
			catch (Exception e ) 
			{
				
				System.out.println(e);
				
			}
		

			
			
			
		} 		
		

	
	
	
	

}
