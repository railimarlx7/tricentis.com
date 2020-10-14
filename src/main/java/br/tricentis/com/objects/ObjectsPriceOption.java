package br.tricentis.com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjectsPriceOption {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjectsPriceOption(WebDriver driver) {
		ObjectsPriceOption.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elementos Price Options
	@FindBy(css = "th > label:nth-child(4) > span")
	@CacheLookup
	protected static WebElement ultimate;

	@FindBy(id = "nextsendquote")
	@CacheLookup
	protected static WebElement avancaSendQuote;
	

	
	
	
}
