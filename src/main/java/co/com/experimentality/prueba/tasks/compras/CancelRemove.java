package co.com.experimentality.prueba.tasks.compras;

import co.com.experimentality.prueba.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.experimentality.prueba.userinterfaces.SummaryUX.BTN_DONT_CONFIRM;
import static co.com.experimentality.prueba.userinterfaces.SummaryUX.BTN_REMOVE_ALL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancelRemove implements Task {

    public static CancelRemove items() {
        return instrumented(CancelRemove.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REMOVE_ALL, WebElementStateMatchers.isClickable()),
                Scroll.to(BTN_REMOVE_ALL).andAlignToBottom(),
                Click.on(BTN_REMOVE_ALL),
                Esperar.unTiempo(1000),
                Click.on(BTN_DONT_CONFIRM),
                Esperar.unTiempo(1000)
        );
    }
}
