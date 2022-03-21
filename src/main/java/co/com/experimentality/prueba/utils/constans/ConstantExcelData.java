package co.com.experimentality.prueba.utils.constans;

import static co.com.experimentality.prueba.utils.constans.ConstantTypeClass.CONSTANT_CLASS;

public class ConstantExcelData {

    public static final String ACTOR = "The user";
    public static final String MAIN_MENU = "mainMenu";
    public static final String ANSWER_EXPECTED = "answerExpected";
    public static final String SELECTED_PRODUCT = "product";
    public static final String QUANTITY = "quantity";
    public static final String SELECT_PRODUCT_TWO = "productoTwo";
    public static final String SELECT_PRODUCT_THREE = "productThree";

    private ConstantExcelData() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }

}
