package br.tricentis.com.Pages;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.basePages.BasePriceOption;
import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsProductData;

public class PriceOptionPage extends ObjectsProductData {
	DriveFactory driveFactory;

	public PriceOptionPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void selecionarPlano() {
		BasePriceOption.selecionaUltimate();
		BasePriceOption.avancaSendQuote();
	
	
		
	}

}
