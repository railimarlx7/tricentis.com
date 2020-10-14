package br.tricentis.com.Pages;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.basePages.BaseInsuranceData;
import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsProductData;

public class InsuranceDataPage extends ObjectsProductData {
	DriveFactory driveFactory;

	public InsuranceDataPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void preencheDadosSeguro() {
		BaseInsuranceData.informarNome();
		BaseInsuranceData.informarSobrenome();
		BaseInsuranceData.informarAniversario();
		BaseInsuranceData.selecionaGenero();
		BaseInsuranceData.informarEndereco();
		BaseInsuranceData.selecionaPais();
		BaseInsuranceData.informarCep();
		BaseInsuranceData.informarCidade();
		BaseInsuranceData.selecionaOcupacao();
		BaseInsuranceData.selecionarHobbie();
		BaseInsuranceData.avancaProductData();
		
	}

}
