package pageObjects;

import org.openqa.selenium.By;

public class FalabellaPages {
    private static By btnApple = By.xpath("//a[@data-testid=\"linkCard\" and @href=\"https://www.falabella.com.co/falabella-co/category/cat10441102/Apple-Watch\"]");
    private static By txtBarraBusqueda = By.xpath("//input[@class='SearchBar-module_searchBar__Input__1VvhT']");
    private static By btnAppleWatch = By.xpath("//a[@href=\"https://www.falabella.com.co/falabella-co/product/prod12160024/Apple%C2%A0Watch%C2%A0SE-(GPS)-Caja-de-Aluminio-de-44%C2%A0mm/19897499\"]");
    private static By btnEnvioGratis = By.xpath("//a[@class=\"fb-promo-banner__gradial huinchaonlymobiele\" and @href=\"https://www.falabella.com.co/falabella-co/collection/enviogratis\"]");
    private static By btnPerfume = By.xpath("//a[@href=\"https://www.falabella.com.co/falabella-co/product/4976204/Perfume-Moschino-Pink-Fresh-EDT-Mujer-100-ml/4976204\"]");
    private static By btnXbox = By.xpath("//a[@href=\"https://www.falabella.com.co/falabella-co/product/9777842/Control-Cont-Robot-Gen-9-Xbox-One/9777842\"]");
    private static By btnHome = By.xpath("//a[@href=\"https://www.falabella.com.co/falabella-co\" and @class=\"Logo-module_logo-wrapper__3QoXr\"]");
    private static By lblEntrega = By.xpath("//span[contains(text(),'tienda')]");

    public static By getbtnApple() {return btnApple;}
    public static By getTxtBarra() {return txtBarraBusqueda;}
    public static By getBtnAppleWatch() {return btnAppleWatch;}
    public static By getBtnEnvioGratis() {return btnEnvioGratis;}
    public static By getBtnXbox() {return btnXbox;}
    public static By getBtnPerfume() {return btnPerfume;}
    public static By getBtnHome(){return btnHome;}
    public static By getLblEntrega() {return lblEntrega;
    }
}

