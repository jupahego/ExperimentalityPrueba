package co.com.experimentality.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprasUX {
    public static final Target BTN_MENU = Target.the("Menu option {0}")
            .locatedBy("//div[@id='filters']//span[contains(text(),'{0}')]");
    public static final Target LBL_PRODUCT = Target.the("Product {0}")
            .locatedBy("(//a[(contains(@class,'product_name'))and(contains(text(),'{0}'))])[1]");
    public static final Target BTN_ADD_PRODUCT = Target.the("agregar producto {0}")
            .locatedBy("(//a[(contains(@class,'product_name'))and(contains(text(),'{0}'))]/ancestor::div[2]//button)[1]");
    public static final Target LBL_SMALL_MESSAGE = Target.the("Message confirmation item")
            .locatedBy("//div[@id='toast-container']//div");
    public static final Target BTN_SHOPPING_CART = Target.the("Button shopping cart")
            .locatedBy("//img[@id='cart-icon']");
public static final Target TXT_SEARCH_ITEM = Target.the("Search any item")
        .locatedBy("//input[@title='Ingrese el producto que quiere buscar']");
}
