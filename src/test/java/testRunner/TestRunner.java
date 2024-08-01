package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Mehwa\\OneDrive\\Desktop\\Class Spartans" +
                "\\Mehwand Practice\\bddFramework\\Features\\SetupTest.feature", // Directory for Feature file
        glue = "tek.bdd.steps", //Package for all the steps
        dryRun = true //set to true to scan feature for unimplemented steps
)
public class TestRunner {
}
