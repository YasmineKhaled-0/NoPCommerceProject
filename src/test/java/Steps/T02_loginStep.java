package Steps;

import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class T02_loginStep extends TestBase {
    LoginPage loginPageObject = new LoginPage(driver);



    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
    }

    @When("user login with valid email")
    public void user_login_with_valid_email() {
        loginPageObject.setEmailField();
    }
    @Then("user login with valid password")
    public void user_login_with_valid_password() {
        loginPageObject.setPasswordField();
    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPageObject.clickOnLogin();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @And("user logout to homepage")
    public void userLogoutToHomepage() {
        loginPageObject.clickOnLogOut();

    }

    @Then("user is on login page again")
    public void user_is_on_login_page_again() {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Then("user login with invalid email")
    public void user_login_with_invalid_email() {
        loginPageObject.setWrongEmail();

    }

    @Then("user login with invalid password")
    public void user_login_with_invalid_password() {
        loginPageObject.setWrongPassword();

    }

    @Then("user clicks on login button with invalid data")
    public void user_clicks_on_login_button_with_invalid_data() {
        loginPageObject.clickOnLogin();

    }
    @Then("user login to the system unsuccessfully")
    public void user_login_to_the_system_unsuccessfully() {
        Assert.assertTrue(loginPageObject.invalidCredentialMessage().contains("Login was unsuccessful. Please correct the errors and try again"));

    }
}
