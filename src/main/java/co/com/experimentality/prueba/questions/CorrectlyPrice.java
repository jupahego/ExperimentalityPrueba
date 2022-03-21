package co.com.experimentality.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.experimentality.prueba.userinterfaces.SummaryUX.LBL_FULL_PRICE;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.ANSWER_EXPECTED;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.SELECTED_PRODUCT;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;

public class CorrectlyPrice implements Question<Boolean> {

    public static CorrectlyPrice inSummary(){
        return new CorrectlyPrice();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LBL_FULL_PRICE.of(obtener(SELECTED_PRODUCT))).viewedBy(actor).asString()
                .contains(obtener(ANSWER_EXPECTED));
    }
}
