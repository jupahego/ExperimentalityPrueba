package co.com.experimentality.prueba.tasks.compras;

import co.com.experimentality.prueba.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.experimentality.prueba.userinterfaces.ComprasUX.*;
import static co.com.experimentality.prueba.userinterfaces.SummaryUX.LBL_PRODUCT_SUMMARY;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.*;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItems implements Task {

    public static AddItems toShoppingCart() {
        return instrumented(AddItems.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(2000),
                Click.on(BTN_MENU.of(obtener(MAIN_MENU))),
                WaitUntil.the(LBL_PRODUCT.of(obtener(SELECTED_PRODUCT)), WebElementStateMatchers.isClickable()),
                Scroll.to(BTN_ADD_PRODUCT.of(obtener(SELECTED_PRODUCT))).andAlignToBottom(),
                Esperar.unTiempo(500),
                Click.on(BTN_ADD_PRODUCT.of(obtener(SELECTED_PRODUCT))),
                Esperar.unTiempo(500),
                Click.on(BTN_ADD_PRODUCT.of(obtener(SELECT_PRODUCT_TWO))),
                Esperar.unTiempo(500),
                Click.on(BTN_ADD_PRODUCT.of(obtener(SELECT_PRODUCT_THREE))),
                Esperar.unTiempo(500),
                Click.on(LBL_SMALL_MESSAGE),
                Click.on(LBL_SMALL_MESSAGE),
                Esperar.unTiempo(1000),
                Click.on(BTN_SHOPPING_CART),
                Esperar.unTiempo(1000),
                WaitUntil.the(LBL_PRODUCT_SUMMARY.of(obtener(SELECTED_PRODUCT)), WebElementStateMatchers.isVisible())
        );
    }
}
