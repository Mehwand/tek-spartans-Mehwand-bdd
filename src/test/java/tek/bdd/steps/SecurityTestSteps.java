package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {
    @When("user click on sign in link")
    public void user_click_on_sign_in_link() {
        clickOnElement(By.id("signinLink"));
    }
    @Then("validate user is in sign in page")
    public void validate_user_is_in_sign_in_page() {
        String pageSubtitle = getElementText(By.className("login__subtitle"));
        Assert.assertEquals("Sign in", pageSubtitle);
    }
    @When("user enter username and password and click on login")
    public void user_enter_and_and_click_on_login() {
       sendText(By.name("email"), "Mehwands@gmail.com");
       sendText(By.name("password"), "Shah1234");
       clickOnElement(By.id("loginBtn"));
    }
    @Then("user should be able to see account link")
    public void user_should_be_able_to_see_account_link() {
        boolean isAccountDisplayed = isElementDisplayed(By.id("accountlink"));
        Assert.assertTrue(isAccountDisplayed);
    }


}
