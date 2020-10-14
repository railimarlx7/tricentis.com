package br.tricentis.com.basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsInsuranceData;

public class BaseInsuranceData extends ObjectsInsuranceData {
	DriveFactory driveFactory;

	public BaseInsuranceData(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	
	public static void informarNome() {
		WebElement elemento = nome;
		elemento.sendKeys("Raimundo");
	}

	public static void informarSobrenome() {
		WebElement elemento = sobrenome;
		elemento.sendKeys("Junior");
	}
	
	public static void informarAniversario() {
		WebElement elemento = aniversario;
		elemento.sendKeys("02/03/1983");
	}
	
	public static void selecionaGenero() {
		WebElement elemento = generoMasculino;
		elemento.click();
	}

	public static void informarEndereco() {
		WebElement elemento = endereco;
		elemento.sendKeys("Rua Nova");
	}
	
	public static void selecionaPais() {
		WebElement comboBox = pais;
		Select combo = new Select(comboBox);
		combo.selectByVisibleText("Brazil");
	}

		
	public static void informarCep() {
		WebElement elemento = cep;
		elemento.sendKeys("06414");
	}

	public static void informarCidade() {
		WebElement elemento = cidade;
		elemento.sendKeys("Barueri");
	}
	
	public static void selecionaOcupacao() {
		WebElement comboBox = ocupacao;
		Select combo = new Select(comboBox);
		combo.selectByVisibleText("Employee");
	}

	public static void selecionarHobbie() {
			
		WebElement elemento = skydiving;
		elemento.click();
	}

	public static void avancaProductData() {
		WebElement elemento = avancaProductData;
		elemento.click();
	}
}
