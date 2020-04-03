package shouty;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/shouty",
        plugin = {"pretty"},
        glue = {"shouty/step_definitions"})


public class TestRunner {

}
