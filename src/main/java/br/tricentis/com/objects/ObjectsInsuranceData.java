package br.tricentis.com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjectsInsuranceData {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjectsInsuranceData(WebDriver driver) {
		ObjectsInsuranceData.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elementos Insurant  Data
	@FindBy(id = "firstname")
	@CacheLookup
	protected static WebElement nome;
	
	@FindBy(id = "lastname")
	@CacheLookup
	protected static WebElement sobrenome;

	@FindBy(id = "birthdate")
	@CacheLookup
	protected static WebElement aniversario;
	
	@FindBy( css = "section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span")
	@CacheLookup
	protected static WebElement generoMasculino;
	
	@FindBy(id = "streetaddress")
	@CacheLookup
	protected static WebElement endereco;
	
	@FindBy(id = "country")
	@CacheLookup
	protected static WebElement pais;
	
	@FindBy(id = "zipcode")
	@CacheLookup
	protected static WebElement cep;
	
	@FindBy(id = "city")
	@CacheLookup
	protected static WebElement cidade;
	
	@FindBy(id = "occupation")
	@CacheLookup
	protected static WebElement ocupacao;

	@FindBy(css = "section:nth-child(2) > div > p > label:nth-child(4) > span")
	@CacheLookup
	protected static WebElement skydiving;
	
	@FindBy(id = "nextenterproductdata")
	@CacheLookup
	protected static WebElement avancaProductData;
	
	
	
}
