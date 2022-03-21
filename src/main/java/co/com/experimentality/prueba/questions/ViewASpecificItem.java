package co.com.experimentality.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.experimentality.prueba.userinterfaces.ComprasUX.LBL_PRODUCT;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.ANSWER_EXPECTED;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.SELECTED_PRODUCT;
import static co.com.inova.certificacion.colectiva.app.models.DatosPrueba.obtener;

public class ViewASpecificItem implements Question<Boolean> {

    public static ViewASpecificItem inScreen(){
        return new ViewASpecificItem();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LBL_PRODUCT.of(obtener(SELECTED_PRODUCT))).viewedBy(actor).asString()
                .contains(obtener(ANSWER_EXPECTED));
    }
}
