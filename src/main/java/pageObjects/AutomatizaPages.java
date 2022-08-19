package pageObjects;

import org.openqa.selenium.By;

public class AutomatizaPages {
    public static By btnSelectCursoS = By.xpath("//a [@href='/shop/?add-to-cart=160' ]");
    public static By btnSelectCursoM = By.xpath("//a [@href='/shop/?add-to-cart=165' ]");
    private static By btnCarroCompras = By.xpath("//span [@class='cartcontents' ]");
    private static By btnEliminarCurso = By.xpath("//a[@class='remove' and @data-product_id='160']");
    private static By lblTotal = By.xpath("//td[@data-title='Total']//strong//span[@class='woocommerce-Price-amount amount']");

    public static By getBtnSelectCursoS() {
        return btnSelectCursoS;
    }

    public static By getBtnSelectCursoM() {
        return btnSelectCursoM;
    }

    public static By getBtnCarroCompras() {
        return btnCarroCompras;
    }

    public static By getBtnEliminarCurso() {
        return btnEliminarCurso;
    }

    public static By getLblTotal() {
        return lblTotal;
    }

}
