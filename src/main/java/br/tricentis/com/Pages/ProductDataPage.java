package br.tricentis.com.Pages;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.basePages.BaseProductData;
import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsProductData;

public class ProductDataPage extends ObjectsProductData {
	DriveFactory driveFactory;

	public ProductDataPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void preencheDadosProduto() {
		BaseProductData.informarDataInicio();
		BaseProductData.selecionarValorSeguro();
		BaseProductData.selecionarCobertura();
		BaseProductData.selecionaOpcional();
		BaseProductData.avancaSelecaoPrecos();
		
		
	}

}
