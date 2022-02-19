package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.FalabellaPages;
import utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class FalabellaBuscarStep {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    public void escribirMasEnter(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    public void darClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void limpiarTxt(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).clear();}
    @Step
    public void buscar1(){
        try {
            leerExcel = Excel.leerXlsx("Semillero.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0 ; i < leerExcel.size();i++){
            escribirMasEnter(FalabellaPages.getTxtBarra(),leerExcel.get(i).get("Busquedas"));}
            darClick(FalabellaPages.getBtnXbox());
        try {Thread.sleep(5000);} catch (InterruptedException e){e.printStackTrace();        }
            darClick(FalabellaPages.getBtnHome());
        try {Thread.sleep(5000);} catch (InterruptedException e){e.printStackTrace();        }
            darClick(FalabellaPages.getBtnEnvioGratis());}
    @Step
    public void buscar2 (){
            darClick(FalabellaPages.getBtnPerfume());
            darClick(FalabellaPages.getBtnHome());}
    @Step
    public void buscar3 (){
        try {Thread.sleep(5000);} catch (InterruptedException e){e.printStackTrace();        }
            darClick(FalabellaPages.getbtnApple());
            darClick(FalabellaPages.getBtnAppleWatch());
    }
    private String obtenerTexto (By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validar (By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }
}
