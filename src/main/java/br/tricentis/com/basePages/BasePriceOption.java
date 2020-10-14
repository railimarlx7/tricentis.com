package br.tricentis.com.basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsPriceOption;

public class BasePriceOption extends ObjectsPriceOption {
	DriveFactory driveFactory;

	public BasePriceOption(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	
		
	public static void selecionaUltimate() {
		WebElement elemento = ultimate;
		elemento.click();
	}


	public static void avancaSendQuote() {
		WebElement elemento = avancaSendQuote;
		elemento.click();
	}
}
