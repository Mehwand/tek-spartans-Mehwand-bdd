package TesRunnerPaven;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Mehwa//OneDrive//Desktop//Class Spartans//Mehwand Practice" +
                "//bddFramework//Features//OrangeHRM.feature",
        glue = "stepDefinitions"
)
public class TestRunnerOrange {

}
