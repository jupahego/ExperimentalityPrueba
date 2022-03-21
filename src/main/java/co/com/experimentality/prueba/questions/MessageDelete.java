package co.com.experimentality.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.experimentality.prueba.userinterfaces.SummaryUX.LBL_MESSAGE_DELETE;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.ANSWER_EXPECTED;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;

public class MessageDelete implements Question<Boolean> {

    public static MessageDelete inScreen(){
        return new MessageDelete();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LBL_MESSAGE_DELETE).viewedBy(actor).asString().contains(obtener(ANSWER_EXPECTED));
    }
}
