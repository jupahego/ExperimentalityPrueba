package co.com.experimentality.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryUX {
    public static final Target LBL_PRODUCT_SUMMARY = Target.the("Product {0} in summary")
            .locatedBy("//strong[contains(text(),'{0}')]");
    public static final Target LBL_FULL_PRICE = Target.the("Full price {0}")
            .locatedBy("//strong[contains(text(),'{0}')]/ancestor::div[3]//div[@class='subtotal']");
    public static final Target TXT_QUANTITY = Target.the("Quantity of {0}")
            .locatedBy("//strong[contains(text(),'{0}')]/ancestor::div[3]//input[@class='quantity-field']");
    public static final Target BTN_SUMMARY_REMOVE = Target.the("Remove item {0}")
            .locatedBy("//strong[contains(text(),'{0}')]/ancestor::div[3]//button[@title='Remover item']");
    public static final Target BTN_CONFIRM_DELETE = Target.the("Confirm delete item")
            .locatedBy("//button[contains(text(),', eliminar')]|//button[contains(text(),', vaciar')]");
    public static final Target LBL_MESSAGE_DELETE = Target.the("Message confirm delete item")
            .locatedBy("//h2[@class='swal2-title']");
    public static final Target BTN_REMOVE_ALL = Target.the("Button remove all items")
            .locatedBy("//button[@title='Remover todos los items']");
    public static final Target BTN_DONT_CONFIRM = Target.the("I dont confirm delete item")
            .locatedBy("//button[contains(text(),'Cancelar')]");

}
