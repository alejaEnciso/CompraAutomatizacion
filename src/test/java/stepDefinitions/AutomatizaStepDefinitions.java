package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.AutomatizaPages;
import steps.AutomatizaStep;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class AutomatizaStepDefinitions {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Steps
    AutomatizaStep step = new AutomatizaStep();

    @Given("^que me encuentro en la pagina de practica$") //before
    public void queMeEncuentroEnLaPaginaDePractica() {
        SeleniumWebDriver.chromeDrive("https://practice.automationtesting.in/shop/");
    }

    @When("^compro cursos$") //Test
    public void comproCursos() {
        step.cursos();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        step.compra();
        step.eliminar();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @Then("^muestra resultados en el carro y valida$") //After
    public void muestraResultadosEnElCarroYValida() {

        step.validar(AutomatizaPages.getLblTotal(), Integer.parseInt("400"));

    }
}