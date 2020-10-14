package br.tricentis.com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjectsVehicleData {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjectsVehicleData(WebDriver driver) {
		ObjectsVehicleData.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elementos Vehicle Data
	@FindBy(id = "nav_motorcycle")
	@CacheLookup
	protected static WebElement motorcycle;

	@FindBy(id = "make")
    @CacheLookup
	protected static WebElement marca;

    @FindBy(id = "model")
    @CacheLookup
    protected static WebElement modelo;

    @FindBy(id = "cylindercapacity")
    @CacheLookup
    protected static WebElement cilindrada;
   
    @FindBy(id = "engineperformance")
    @CacheLookup
    protected static WebElement perfomanceMotor;

    @FindBy(id = "dateofmanufacture")
    @CacheLookup
    protected static WebElement dataFabricacao;
    
    @FindBy(id = "numberofseatsmotorcycle")
    @CacheLookup
    protected static WebElement numeroAssentos;
    
    @FindBy(id = "listprice")
    @CacheLookup
    protected static WebElement preco;

    @FindBy(id = "annualmileage")
    @CacheLookup
    protected static WebElement milhasAno;
  
    @FindBy(id = "nextenterinsurantdata")
    @CacheLookup
    protected static WebElement avancarDadosSeguro;

}
