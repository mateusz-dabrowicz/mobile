package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {
                "src/test/resources/features/",
        },
        plugin = {
                "json:build/reports/cucumberRunner.json",
                "html:build/reports/html",
                "pretty"
        },
        monochrome = true,
        tags = {"not @ignore", "not @wip"},
        glue = {
                "hooks",
                "glue",
        }
)
public class TestsRunner {
}