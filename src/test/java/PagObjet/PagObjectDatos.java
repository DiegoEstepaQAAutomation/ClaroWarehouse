package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapObjectDatos;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectDatos extends MapObjectDatos
{
	
	public PagObjectDatos(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	public String SeleccionarDate(File rutaCarpeta,String generarEvidencia,String Barrio,String NumeroPrincipal,String NumeroSecundario,String compu,String numero) throws Exception
	{
		try {
			
			
			
			tiempoEspera(5000);
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
			
			tiempoEspera(7000);
			
			
			tiempoEspera(2000);
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
			tiempoEspera(2000);
			
			tocarPantalla(477,73);
			
			scrollVertical1(rutaCarpeta,444,612,501, 2,generarEvidencia);
			click(GreatFinale,rutaCarpeta,generarEvidencia);
			
			click(Close,rutaCarpeta,generarEvidencia);

			
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		String valor = capturarValorSelenium(resultado);
		return valor;

	}
  @Test
  public void f() {
  }
}
