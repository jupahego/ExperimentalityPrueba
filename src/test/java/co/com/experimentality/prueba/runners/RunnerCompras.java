package co.com.experimentality.prueba.runners;


import co.com.experimentality.prueba.utils.excel_data.BeforeSuite;
import co.com.experimentality.prueba.utils.excel_data.DataToFeature;
import co.com.experimentality.prueba.utils.runner.RunnerPersonalizado;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.experimentality.prueba.utils.constans.ConstantTypeClass.RUNNER_CLASS;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features/compras.feature",
        glue = "co.com.experimentality.prueba.stepdefinitions",
        tags = "@searchAnItem",
        snippets = SnippetType.CAMELCASE
)

public class RunnerCompras {
    private RunnerCompras() {
        throw new IllegalStateException(RUNNER_CLASS);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/");
    }
}
