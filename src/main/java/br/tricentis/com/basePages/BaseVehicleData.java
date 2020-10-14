package br.tricentis.com.basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsVehicleData;

public class BaseVehicleData extends ObjectsVehicleData {
	DriveFactory driveFactory;

	public BaseVehicleData(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void selecionaVeiculo() {
		WebElement elemento = motorcycle;
		elemento.click();
	}

	public static void selecionaMarca() {
		WebElement comboBox = marca;
		Select combo = new Select(comboBox);
		combo.selectByVisibleText("BMW");
	}
	
	public static void selecionaModelo() {
		WebElement comboBox = modelo;
		Select combo = new Select(comboBox);
		combo.selectByVisibleText("Motorcycle");
	}

	public static void informarCilindrada() {
		WebElement elemento = cilindrada;
		elemento.sendKeys("313");
	}
	
	public static void informarPerfomanceMotor() {
		WebElement elemento = perfomanceMotor;
		elemento.sendKeys("25");
	}
	
	public static void informarDataFabricacao() {
		WebElement elemento = dataFabricacao;
		elemento.sendKeys("01/31/2019");
	}

	public static void informarNumeroAssentos() {
		WebElement comboBox = numeroAssentos;
		Select combo = new Select(comboBox);
		combo.selectByIndex(1);
	}

	public static void informarPrecoTabela() {
		WebElement elemento = preco;
		elemento.sendKeys("10000.99");
	}
	
	public static void informarMilhasAno() {
		WebElement elemento = milhasAno;
		elemento.sendKeys("5000");
	}
	
	public static void avancarDadosSeguro() {
		WebElement elemento = avancarDadosSeguro;
		elemento.click();
	}
	
}
