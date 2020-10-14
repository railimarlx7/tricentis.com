package br.tricentis.com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjectsSendQuote {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjectsSendQuote(WebDriver driver) {
		ObjectsSendQuote.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elementos Insurant  Data
	@FindBy(id = "email")
	@CacheLookup
	protected static WebElement email;
	
	@FindBy(id = "username")
	@CacheLookup
	protected static WebElement username;
	
	@FindBy(id = "password")
	@CacheLookup
	protected static WebElement password;
	
	@FindBy(id = "confirmpassword")
	@CacheLookup
	protected static WebElement confirmpassword;
	
	
	@FindBy(id = "sendemail")
	@CacheLookup
	protected static WebElement sendemail;
	
	@FindBy(css = "div.sweet-alert")
	@CacheLookup
	protected static WebElement alerta;
	
	@FindBy(css = "body > div > h2")
	@CacheLookup
	protected static WebElement textoMensagem;
	
		
}
