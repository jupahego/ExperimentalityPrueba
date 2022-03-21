package co.com.experimentality.prueba.tasks.compras;

import co.com.experimentality.prueba.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.experimentality.prueba.userinterfaces.SummaryUX.BTN_CONFIRM_DELETE;
import static co.com.experimentality.prueba.userinterfaces.SummaryUX.BTN_SUMMARY_REMOVE;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.SELECT_PRODUCT_TWO;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveItem implements Task {

    public static RemoveItem inSummary() {
        return instrumented(RemoveItem.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SUMMARY_REMOVE.of(obtener(SELECT_PRODUCT_TWO)), WebElementStateMatchers.isClickable()),
                Scroll.to(BTN_SUMMARY_REMOVE.of(obtener(SELECT_PRODUCT_TWO))).andAlignToBottom(),
                Click.on(BTN_SUMMARY_REMOVE.of(obtener(SELECT_PRODUCT_TWO))),
                Esperar.unTiempo(500),
                Click.on(BTN_CONFIRM_DELETE)
        );
    }
}
