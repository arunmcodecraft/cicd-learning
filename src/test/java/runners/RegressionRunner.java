package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "steps",
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/regression-report.html",
                "json:target/regression-report.json"
        },
        monochrome = true
)
public class RegressionRunner extends AbstractTestNGCucumberTests {
}
