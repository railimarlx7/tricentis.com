package br.tricentis.com.basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsProductData;

public class BaseProductData extends ObjectsProductData {
	DriveFactory driveFactory;

	public BaseProductData(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	
	public static void informarDataInicio() {
		WebElement elemento = dataInicio;
		elemento.sendKeys("02/03/2021");
	}

	public static void selecionarValorSeguro() {
		WebElement comboBox = valorSeguro;
		Select combo = new Select(comboBox);
		combo.selectByIndex(3);
	}
	
	public static void selecionarCobertura() {
		WebElement comboBox = cobertura;
		Select combo = new Select(comboBox);
		combo.selectByVisibleText("Full Coverage");
	}
	
	public static void selecionaOpcional() {
		WebElement elemento = opcional;
		elemento.click();
	}


	public static void avancaSelecaoPrecos() {
		WebElement elemento = avancaSelecaoPrecos;
		elemento.click();
	}
}
