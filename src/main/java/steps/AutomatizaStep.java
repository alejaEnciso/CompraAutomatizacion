package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pageObjects.AutomatizaPages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AutomatizaStep {

    //metodos de acciones
    public void darClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public String obtenerTexto(By elemento) {
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    //método que ordena las acciones
    @Step
    public void cursos() {
        darClick(AutomatizaPages.getBtnSelectCursoS());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        darClick(AutomatizaPages.getBtnSelectCursoM());
    }

    @Step
    public void compra() {
        darClick(AutomatizaPages.getBtnCarroCompras());
    }

    @Step
    public void eliminar() {
        darClick(AutomatizaPages.getBtnEliminarCurso());
    }

    @Step
    public void validar(By elemento, int texto) {
        assertTrue(Integer.parseInt(obtenerTexto(elemento).replace("₹", "") )< texto);


    }

}



