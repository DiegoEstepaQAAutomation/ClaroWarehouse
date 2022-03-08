package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapObjectDatos extends ClaseBase  
{
	public MapObjectDatos(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}
	
	
	
	
	protected By resultado = By.xpath("//android.widget.TextView[@text = '¡Hola!']");
	

	protected By Close = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
	
	protected By btnPerfilEnd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]");
	
	protected By btnPerfil = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgPerfil']");
	
	protected By btnDatos = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvConfiguracion']");
	
	protected By SelTipo = By.xpath("//android.widget.CheckedTextView[@text = 'Avenida Calle']");
	
	protected By ActualizaDatos = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
	
	protected By ActualizarDatos11 = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	
	protected By CambiarDireccion = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgEditarDir']");
	
	protected By SeleccionDeparta = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[1]");
	
	protected By SeleccionCiudad = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[2]");
	
	protected By barrio = By.xpath("//android.widget.LinearLayout/android.widget.EditText");
	
	protected By City = By.xpath("//android.widget.CheckedTextView[@text = 'BOGOTA']");
	
	protected By City2 = By.xpath("//android.widget.CheckedTextView[@text = 'BOGOTÁ, D.C.']");
	
	protected By Tipo = By.xpath("//android.widget.CheckedTextView[@text = 'Avenida Calle']");
	
	protected By PrimerTipo = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[3]");
	
	protected By numeroPrincipal = By.xpath( "//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNPricipal']");
	
	protected By Sufijo = By.xpath("//android.widget.CheckedTextView[@text = 'Selecciona']");
	
	protected By TipoDireccion = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[5]");
	
	protected By numeroSecundario = By.xpath("//android.view.ViewGroup[2]/android.widget.EditText[1]");
	
	protected By MenuSufijoSecundario = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup[2]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By sufijo2 = By.xpath("//android.widget.CheckedTextView[@text = 'Batallon']");
	protected By secundario = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[5]");
	protected By sufijo3 = By.xpath("//android.view.ViewGroup[2]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By sufijo4 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[7]");
	protected By Compu = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.EditText[2]");
	protected By complemento = By.xpath("//android.view.ViewGroup[3]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By complemento2 = By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	protected By Numero = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.EditText");
	protected By validar = By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");
	protected By guardar = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
	protected By cerrar = By.xpath("//android.widget.Button[@text = 'Cancelar']");
	
	
	protected By GreatFinale = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[11]");
	
	protected By GoBack  = By.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");



  @Test
  public void f() {
  }
}
