package br.tricentis.com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.core.Log;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = { "@CT01" }, 
		features = "src/test/features", 
		glue = { "br.tricentis.com.stepdefinition"}, 
		plugin = {"pretty"},
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		strict = true)
public class RunCucumber {

	@AfterClass
	public static void finalizaTest() throws IOException {
		Log.screenshot();
		DriveFactory.fecharBrowser();
	}

}
