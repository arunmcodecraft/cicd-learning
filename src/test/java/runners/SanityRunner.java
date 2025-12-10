package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "steps",
        tags = "@Sanity",
        plugin = {
                "pretty",
                "html:target/sanity-report.html",
                "json:target/sanity-report.json"
        },
        monochrome = true
)
public class SanityRunner extends AbstractTestNGCucumberTests {
}
