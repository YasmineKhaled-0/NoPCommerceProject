package Runner;

import Base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "Steps"
)
public class TestRunner extends TestBase {
}
