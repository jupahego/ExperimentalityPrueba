package co.com.experimentality.prueba.tasks.cargardedatos;



import co.com.experimentality.prueba.utils.constans.ConstantTypeClass;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Charge {
    private Charge(){throw new IllegalStateException(ConstantTypeClass.FACTORY_CLASS);}

    public static ChargeTestData cargoLosDatosDeLaTransaccionConLaSiguiente(List<Map<String,Object>> information){
        return instrumented(ChargeTestData.class, information);
    }

    public static ChargeTestData conLaSiguiente(List<Map<String,Object>> information){
        return instrumented(ChargeTestData.class, information);
    }
}
