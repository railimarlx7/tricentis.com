package br.tricentis.com.basePages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsSendQuote;

public class BaseSendQuote extends ObjectsSendQuote {
	DriveFactory driveFactory;

	public BaseSendQuote(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void informarEmail() {
		WebElement elemento = email;
		elemento.sendKeys("seguros@seguros.com");
	}

	public static void informarUsuario() {
		WebElement elemento = username;
		elemento.sendKeys("raimundo.junior");
	}

	public static void informarPassword() {
		WebElement elemento = password;
		elemento.sendKeys("Qw1234");
	}

	public static void confirmarPassword() {
		WebElement elemento = confirmpassword;
		elemento.sendKeys("Qw1234");
	}

	public static void enviarEmail() {
		WebElement elemento = sendemail;
		elemento.click();
	}

	@SuppressWarnings("deprecation")
	public static void alertaMensagem(String mensagem) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(alerta));
		WebElement element = textoMensagem;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		assertEquals(mensagem, element.getText());
	}

}
