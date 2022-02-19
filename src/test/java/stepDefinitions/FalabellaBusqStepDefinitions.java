package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageObjects.FalabellaPages;
import steps.FalabellaBuscarStep;

public class FalabellaBusqStepDefinitions {

    FalabellaBuscarStep busquedaStep = new FalabellaBuscarStep();
@Step
    @Given("^que me encuentro en la pagina fe falabella$")
    public void queMeEncuentroEnLaPaginaFeFalabella() {
        SeleniumWebDriver.chromeDriver("https://www.falabella.com.co/falabella-co");
    }


    @When("^busco productos$")
    public void buscoProductos() {
        busquedaStep.buscar1();
        busquedaStep.buscar2();
        busquedaStep.buscar3();
    }

    @Then("^hace la busqueda y me muestra resultados$")
    public void haceLaBusquedaYMeMuestraResultados() {
        busquedaStep.validar(FalabellaPages.getLblEntrega(),"Disponible para retiro en tienda");
    }
}
