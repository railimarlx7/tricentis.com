package br.tricentis.com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjectsProductData {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjectsProductData(WebDriver driver) {
		ObjectsProductData.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elementos Product  Data
	@FindBy(id = "startdate")
	@CacheLookup
	protected static WebElement dataInicio;
	
	@FindBy(id = "insurancesum")
	@CacheLookup
	protected static WebElement valorSeguro;
	
	@FindBy(id = "damageinsurance")
	@CacheLookup
	protected static WebElement cobertura;
	
	@FindBy(css = "section:nth-child(3) > div > p > label:nth-child(1) > span")
	@CacheLookup
	protected static WebElement opcional;
	
	
	@FindBy(id = "nextselectpriceoption")
	@CacheLookup
	protected static WebElement avancaSelecaoPrecos;
	
	
	
	
}
