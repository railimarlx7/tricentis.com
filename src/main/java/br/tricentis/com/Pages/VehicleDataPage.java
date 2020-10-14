package br.tricentis.com.Pages;

import org.openqa.selenium.WebDriver;

import br.tricentis.com.basePages.BaseVehicleData;
import br.tricentis.com.core.DriveFactory;
import br.tricentis.com.objects.ObjectsVehicleData;

public class VehicleDataPage extends ObjectsVehicleData {
	DriveFactory driveFactory;

	public VehicleDataPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void preencheDadosVeiculo() {
		BaseVehicleData.selecionaVeiculo();
		BaseVehicleData.selecionaMarca();
		BaseVehicleData.selecionaModelo();
		BaseVehicleData.informarCilindrada();
		BaseVehicleData.informarPerfomanceMotor();
		BaseVehicleData.informarDataFabricacao();
		BaseVehicleData.informarNumeroAssentos();
		BaseVehicleData.informarPrecoTabela();
		BaseVehicleData.informarMilhasAno();
		BaseVehicleData.avancarDadosSeguro();
	}

}
