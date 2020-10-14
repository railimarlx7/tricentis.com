package br.tricentis.com.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.tricentis.com.objects.ObjectsVehicleData;

public class DriveFactory extends ObjectsVehicleData {

	public DriveFactory() {
		super(setChrome());
	}

	public DriveFactory(WebDriver driver) {
		super(driver);
	}

	public static WebDriver setChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		return new ChromeDriver();
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static WebDriver getHomePage() {
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		return driver;
	}

	public static void fecharBrowser() {
		driver.quit();
	}

}
