package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "steps",
        tags = "@Smoke",
        plugin = {
                "pretty",
                "html:target/smoke-report.html",
                "json:target/smoke-report.json"
        },
        monochrome = true
)
public class SmokeRunner extends AbstractTestNGCucumberTests {
}
