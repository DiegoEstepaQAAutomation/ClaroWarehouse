package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Utilidades.GenerarReportePdf;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ClaseBase {
	
	
	protected AppiumDriver<MobileElement> driver;
	
	//String Properties;
	String rutaOutut;
	
	
	public String getRutaOutut() {
		return rutaOutut;
	}

	public void setRutaOutut(String rutaOutut,AppiumDriver<MobileElement> driver2) {
		this.rutaOutut = rutaOutut;
		this.driver = driver2;
	}

	
	//public void setProperties(String properties) {
	//	Properties = properties;
	//}

	public ClaseBase(WebDriver driver) 
	{
		super();

	}


		
	



//METODO DE NAVEGADOR
	@SuppressWarnings("rawtypes")
	public static AppiumDriver chromeDriverConnection(String platformName, String deviceName, String platformVersion, String appPackage, String appActivity, String noReset, String autoGrantPermissior) {

		AppiumDriver _driver = null;
		//Properties propiedades;
		//InputStream entrada= null;
		//propiedades = new Properties();
		try 
		{
			
			
			
			
			//entrada =new FileInputStream("./Properties/datos.propiedades");
			//propiedades.load(entrada);
			
			
			DesiredCapabilities caps = new DesiredCapabilities();  
			caps.setCapability("platformName",platformName);
			caps.setCapability("deviceName",deviceName);
			caps.setCapability("platformVersion",platformVersion);
			caps.setCapability("appPackage", appPackage);
			caps.setCapability("appActivity",appActivity);
			caps.setCapability("noReset" ,noReset);
			caps.setCapability("autoGrantPermissior",autoGrantPermissior);
			
			
			
			//caps.setCapability
		
		
		
			try 
			{
				printConsola("Loading please wait clod");
				_driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			}
			
			catch(MalformedURLException e) 
			{
				printConsola(e.getMessage());
				
			}
			
			return _driver;
			
		   }
			catch(Exception e) 
			{
				printConsola(e.getMessage());		
			}
			
			return _driver;
			
		   
		
		
	}	

	// METODO CLICK

	public void click(By locator, File rutaCarpeta, String generarEvidencia) throws Exception 
	{
		try
		{
			driver.findElement(locator).click();
			tiempoEspera(2);
			captureScreen(rutaCarpeta,locator,generarEvidencia);
		}
		
		catch (Exception e) 
		{
			captureScreenError(rutaCarpeta,locator,generarEvidencia,e.toString());
			throw new InterruptedException();
		}
		
	}

	// METODO BORRAR

	public void borrar(By locator,File rutaCarpeta, String generarEvidencia) throws Exception 
	{
		try
		{
			driver.findElement(locator).clear();
			tiempoEspera(2);
			captureScreen(rutaCarpeta, locator,generarEvidencia);
		}		
		catch (Exception e) 
		{
			captureScreenError(rutaCarpeta,locator,generarEvidencia,e.toString());
			throw new InterruptedException();
		}
	}
	
	

	private static void printConsola(String cadena) {
		System.out.println(cadena);

		// TODO Auto-generated method stub

	}



	// METODO ENVIAR TEXTO

	//METODO ENVIAR TEXTO
		public void sendkey(String inputText, By locator, File rutaCarpeta,String generarEvidencia) throws Exception 
		{
			try
			{
				driver.findElement(locator).sendKeys(inputText);
				tiempoEspera(2);
				captureScreen(rutaCarpeta, locator,generarEvidencia);
			}		
			catch (Exception e) 
			{
				captureScreenError(rutaCarpeta,locator,generarEvidencia,e.toString());
				throw new InterruptedException();
			}
		}

	// METODO ENTER SUBMIN

	public void submit(By locator, File rutaCarpeta, String generarEvidencia) throws Exception {
		driver.findElement(locator).submit();
		captureScreen(rutaCarpeta, locator, generarEvidencia);
	}
	
	public String capturarValorSelenium(By locator) throws Exception 
	{
		String valor = driver.findElement(locator).getText();
		return valor;
	}

	// METODO DE ESPERA
	public void tiempoEspera(long tiempo) throws InterruptedException {
		Thread.sleep(tiempo);
	}

	// IMPORTANTE ESTA ESTATICA -VALIDAR FUNCIONAMIENTO ASI

	public static String fechaHora() {
		// TOMAMOS LA FECHA DEL SISTEMA
		LocalDateTime fechaSistema = LocalDateTime.now();
		// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
		// DAR FORMATO A LA FECHA DEL SISTEMA
		String formatFecha = fecha.format(fechaSistema);
		return formatFecha;
	}
	
	@SuppressWarnings("deprecation")
	public void sendkeyandroid(String generarEvidencia) throws Exception
	{
		driver.getKeyboard().sendKeys();
	}
	
	public static String fechaHora2()
	{
		//TOMAMOS LA FECHA DEL SISTEMA
		LocalDateTime fechaSistema = LocalDateTime.now();
		//DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//DAR FORMATO A LA FECHA DEL SITEMA
		String formatFecha = fecha.format(fechaSistema);		
		return formatFecha;
	}
	
	
	
	
	
	

	public static String HoraSistema() {

		// TOMAMOS LA FECHA DEL SISTEMA
		LocalTime horaSistema = LocalTime.now();
		// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HHmmss");
		// DAR FORMATO A LA FECHA DEL SISTEMA
		String hora = fecha.format(horaSistema);
		return hora;
	}

	public void captureScreen(File rutaCarpeta,By locator,String generarEvidencia) throws Exception 
	{
		if (generarEvidencia.equals("Si"))
		{
			String hora = HoraSistema();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(rutaCarpeta+"\\"+hora+".png"));
			String rutaImagen =new File(rutaCarpeta+"\\"+hora+".png").toString();
			
			//INSTACIAMOS LA CLASE GENERAR PDF
			GenerarReportePdf informePdf = new GenerarReportePdf();
			//SE PROCEDE A INSERTAR LOCALIZADOR HE IMAGEN EN EL PDF
			informePdf.crearbody(locator,rutaImagen);
			//ELIMINAR IMAGEN CREADA
			
			eliminarArchivo(rutaImagen);
		}
	}	
	
	public void captureScreenError(File rutaCarpeta, By locator, String generarEvidencia, String msnError) throws Exception 
	{
		if (generarEvidencia.equals("Si"))
		{
			String hora = HoraSistema();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(rutaCarpeta+"\\"+hora+".png"));
			String rutaImagen =new File(rutaCarpeta+"\\"+hora+".png").toString();
			
			//INSTACIAMOS LA CLASE GENERAR PDF
			GenerarReportePdf informePdf = new GenerarReportePdf();
			//SE PROCEDE A INSERTAR LOCALIZADOR HE IMAGEN EN EL PDF
			informePdf.crearbodyError(locator,rutaImagen,msnError);
			//ELIMINAR IMAGEN CREADA
			
			eliminarArchivo(rutaImagen);
		}
	}	
	

	public void eliminarArchivo(String rutaImagen) {

		File fichero = new File(rutaImagen);
		fichero.delete();

	}

	// METODO ESTATICO OJO
	public File crearCarpeta(String nomTest) {
		// ALCACENAMOS LA FECHA DEL SISTEMA
		String fecha = fechaHora();
		// CREAMOS EL NOMBRE DE LA CARPETA
		String nomCarpeta = nomTest + "-" + fecha;
		// OBTENEMOS LA RUTA DE ALOJAMIENTO DE SALIDA Y EL NOMBRE DEL TEST A EJECUTAR
		File directorio = new File(rutaOutut + nomCarpeta);
		// CREAMOS LA CARPETA
		directorio.mkdir();
		return directorio;
	}

	// METODO INICIAL

	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();

	}
	
	public void esconderteclado() 
	{
		driver.hideKeyboard();
	}
	
	public void tocarPantalla1(int col,int fil)
	{
	@SuppressWarnings("rawtypes")
	TouchAction touch = new TouchAction(driver);
	touch.press(PointOption.point(col,fil)).release().perform();

	}

	// METODO DE SCROLL
	public void scrollpage(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(x,y)");
	}

	// METODO CONTROLA

	public void controla(By locator, File rutaCarpeta, String generarEvidencia) throws Exception {
		driver.findElement(locator).sendKeys(Keys.CONTROL, "a");
		captureScreen(rutaCarpeta, locator, generarEvidencia);
	}

	// METODO TECLA BORRAR

	public void teclaborrar(By locator, File rutaCarpeta, String generarEvidencia) throws Exception {

		driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
		captureScreen(rutaCarpeta, locator, generarEvidencia);
	}

	// METODO INTRO

	public void intro(By locator, File rutaCarpeta, String generarEvidencia) throws Exception {
		driver.findElement(locator).sendKeys(Keys.ENTER);
		captureScreen(rutaCarpeta, locator, generarEvidencia);
	}

	// METODO INTERACTUAR ALERTA

	public void alert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			tiempoEspera(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// METODO ALERTAS
	public void clickDato(By locator) throws Exception {
		driver.findElement(locator).click();
		tiempoEspera(2000);

	}
	
	
	
	//Metodos del appium
	
	//METODO SCROLLVERTICAL//CREA LAS VARIABLES DE LAS COORDENADAS DEL INSPECTOR
		public void scrollVertical1(File rutaCarpeta, int xini,int yini, int yfinal, int iteraciones,String generarEvidencia) throws Exception
		{

		for (int i = 1 ;i<=iteraciones;i++)
		{
		@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(xini,yini))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(xini,yfinal))
		.release().perform();
		//captureScreen(rutaCarpeta,locator,generarEvidencia);
		}
		}
		
		
		public void inivideo() 
		{
			
			((CanRecordScreen) driver).startRecordingScreen();
		}
		
		public void finVideo(File rutaCarpeta) throws IOException 
		{
			
			String hora = HoraSistema();
			String video = ((CanRecordScreen) driver).startRecordingScreen();
			byte[] decode = Base64.getDecoder().decode(video);
			FileUtils.writeByteArrayToFile(new File(rutaCarpeta + "\\"+hora+".mp4"),decode);
			
			
			
		}
		
		
			 
		
		public void tocarPantalla(int col,int fil)
		{
		@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(col,fil)).release().perform();

		}
		
		public void scrollHorizontal(File rutaCarpeta, int X, int Y, int XFin, int YFin, int iteraciones,By locator,String generarEvidencia) throws Exception 
		{



			for (int i = 1; i <= iteraciones; i++) {
			@SuppressWarnings("rawtypes")
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(X, Y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			.moveTo(PointOption.point(XFin, YFin)).release().perform();
			captureScreen(rutaCarpeta, locator, generarEvidencia);
			}
			}
		


	
}
