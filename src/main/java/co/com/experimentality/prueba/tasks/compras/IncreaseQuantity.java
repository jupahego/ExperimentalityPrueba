package co.com.experimentality.prueba.tasks.compras;

import co.com.experimentality.prueba.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.experimentality.prueba.userinterfaces.SummaryUX.TXT_QUANTITY;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.QUANTITY;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.SELECTED_PRODUCT;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IncreaseQuantity implements Task {

    public static IncreaseQuantity ofItems(){
        return instrumented(IncreaseQuantity.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener(QUANTITY)).into(TXT_QUANTITY.of(obtener(SELECTED_PRODUCT))),
                Hit.the(Keys.ENTER).into(TXT_QUANTITY.of(obtener(SELECTED_PRODUCT))),
                Esperar.unTiempo(2000)
        );
    }
}
