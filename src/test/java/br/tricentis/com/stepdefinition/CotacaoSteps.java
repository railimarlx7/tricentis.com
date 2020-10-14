package br.tricentis.com.stepdefinition;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.Pages.InsuranceDataPage;
import br.tricentis.com.Pages.PriceOptionPage;
import br.tricentis.com.Pages.ProductDataPage;
import br.tricentis.com.Pages.SendQuotePage;
import br.tricentis.com.Pages.VehicleDataPage;
import br.tricentis.com.basePages.BaseInsuranceData;
import br.tricentis.com.basePages.BasePriceOption;
import br.tricentis.com.basePages.BaseProductData;
import br.tricentis.com.basePages.BaseSendQuote;
import br.tricentis.com.basePages.BaseVehicleData;
import br.tricentis.com.core.DriveFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CotacaoSteps {

	static WebDriver driver;

	@SuppressWarnings("unused")
	@Dado("^que acesso o site sampleapp\\.tricentis\\.com$")
	public void queAcessoOSiteSampleappTricentisCom() throws Throwable {

		DriveFactory driveFactory = new DriveFactory();
		driver = DriveFactory.getHomePage();

	}

	@Quando("^preecho o formulario, aba Enter Vehicle Data$")
	public void preechoOFormularioAbaEnterVehicleData() throws Throwable {

		@SuppressWarnings("unused")
		BaseVehicleData bvd = new BaseVehicleData(driver);
		VehicleDataPage.preencheDadosVeiculo();

	}

	@Quando("^preecho o formulario, aba  Enter Insurant Data$")
	public void preechoOFormularioAbaEnterInsurantData() throws Throwable {
		@SuppressWarnings("unused")
		BaseInsuranceData bid = new BaseInsuranceData(driver);
		InsuranceDataPage.preencheDadosSeguro();
	}

	@Quando("^preecho o formulario, aba  Enter Product Data$")
	public void preechoOFormularioAbaEnterProductData() throws Throwable {
		@SuppressWarnings("unused")
		BaseProductData bpd = new BaseProductData(driver);
		ProductDataPage.preencheDadosProduto();
	}

	@Quando("^preecho o formulario, aba Select Price Option$")
	public void preechoOFormularioAbaSelectPriceOption() throws Throwable {
		@SuppressWarnings("unused")
		BasePriceOption bpo = new BasePriceOption(driver);
		PriceOptionPage.selecionarPlano();
	}

	@Quando("^preecho o formulario, aba Send Quote$")
	public void preechoOFormularioAbaSendQuote() throws Throwable {
		@SuppressWarnings("unused")
		BaseSendQuote bsq= new BaseSendQuote(driver);
		SendQuotePage.enviarEmail();
	}

	@Entao("^verifico a mensagem \"([^\"]*)\" na tela$")
	public void verificoAMensagemNaTela(String mensagem) throws Throwable {
		SendQuotePage.validaMensagem(mensagem);
	}

}
