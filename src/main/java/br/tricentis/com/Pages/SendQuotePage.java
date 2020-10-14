package br.tricentis.com.Pages;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.basePages.BaseSendQuote;
import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsVehicleData;

public class SendQuotePage extends ObjectsVehicleData {
	DriveFactory driveFactory;

	public SendQuotePage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void enviarEmail() {
		BaseSendQuote.informarEmail();
		BaseSendQuote.informarUsuario();
		BaseSendQuote.informarPassword();
		BaseSendQuote.confirmarPassword();
		BaseSendQuote.enviarEmail();

	}

	public static void validaMensagem(String mensagem) {

		BaseSendQuote.alertaMensagem(mensagem);

	}

}
