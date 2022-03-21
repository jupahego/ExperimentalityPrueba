package co.com.experimentality.prueba.tasks.compras;

import co.com.experimentality.prueba.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.experimentality.prueba.userinterfaces.ComprasUX.LBL_PRODUCT;
import static co.com.experimentality.prueba.userinterfaces.ComprasUX.TXT_SEARCH_ITEM;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.SELECTED_PRODUCT;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAnItem implements Task {

    public static SearchAnItem inPage() {
        return instrumented(SearchAnItem.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(1000),
                Enter.theValue(obtener(SELECTED_PRODUCT)).into(TXT_SEARCH_ITEM),
                WaitUntil.the(LBL_PRODUCT.of(obtener(SELECTED_PRODUCT)), WebElementStateMatchers.isClickable()),
                Esperar.unTiempo(1000)
        );
    }
}
