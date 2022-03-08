package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapObjectTarjeta extends ClaseBase
{
	
	public MapObjectTarjeta(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}

	
	
	
	   protected By btnPerfilEnd = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgPerfil']");
		
		protected By GreatFinale = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[11]");
		
		protected By Close = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");

	
	
		protected By Cerrarinicio = By.xpath("//android.widget.Button[@text = 'Cerrar'] ");

	protected By resultado = By.xpath("//android.widget.TextView[@text = '¡Hola!']");
	
	protected By GoBack  = By.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
	
	protected By btnPago = By.xpath("//android.widget.FrameLayout[@content-desc=\"Pagos\"]/android.view.ViewGroup/android.widget.TextView");
	
	
	
	//REPARAR
	protected By btnPagaAqui = By.xpath("//android.widget.Button[@text = 'Paga tu factura aquí']");
	
	
	
	protected By btnOtroValor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]");
	
	protected By btnPagar = By.xpath("//android.widget.Button[@text=\"Pagar\"]");
	
	protected By btnMedioDePago = By.xpath("//android.view.View[@resource-id=\"select\"]");
	
	
	protected By btnTarjetaDeCredito = By.xpath(" //android.view.View[@content-desc='Tarjeta de Crédito - Débito Tarjeta de Crédito - Débito']  ");
	
	protected By btnContinuar = By.xpath("//android.widget.Button[@text=\"Continuar\"]");
	
	
	protected By NumberOfPlastic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
	
	
	protected By btnMesVencido = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_MES']");
	
	protected By Mes4 = By.xpath("//android.widget.CheckedTextView[@text = '04']");
	
	protected By YearSelected = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_ANNO']");
	
	
	protected By OneYear = By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
	
	protected By SecuCode = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	
	protected By MenuCuotas = By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]");
	
	protected By SeleccionCuotas= By.xpath("//android.widget.CheckedTextView[@text = '3']");
	
	protected By NombreYapellidoTarjeta = By.xpath("//android.widget.EditText[@resource-id='NOMBRE_TARJETA']");
	
	protected By TipoDocumento = By.xpath("//android.view.View[@resource-id='TIPO_DOCUMENTO']");
	
	
	protected By DocumentoSeleccionado = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	
	
	
	protected By btnCancelarTarjeta = By.xpath("//android.widget.Button[@resource-id='btnCancelar']");
	
	protected By NumberDocument = By.xpath("//android.widget.EditText[@resource-id = 'NUMERO_DOCUMENTO']");
	
	protected By Telefono = By.xpath("//android.widget.EditText[@resource-id = 'TELEFONO']");
	
	protected By Mail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	
	protected By Cancelar = By.xpath("//android.widget.Button[@text = 'Cancelar']");
	
	protected By btnLogin = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	
	protected By btnIngreso = By.xpath("//android.widget.TextView[@text = 'Correo electrónico']");
	
	protected By btnCorreo = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	
	protected By btnPassword = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edPassword']");
	
	protected By btnAccepts = By.xpath("//android.widget.LinearLayout/android.widget.Button");
	
	protected By btnAccepts1 = By.xpath("//android.widget.Button[@text = 'Iniciar sesión']");
	
	protected By Option2  = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	
	protected By Option3 = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]");
	
	protected By MineCel = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
			
	protected By AcceptDevice = By.xpath("//android.widget.Button[@text='Continuar']");
	
	protected By btnAcceptDevice = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");

	

	
  @Test
  public void f() {
  }
}
