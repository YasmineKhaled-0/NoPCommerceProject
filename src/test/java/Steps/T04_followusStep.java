package Steps;

import Base.TestBase;
import Pages.FollowUs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class T04_followusStep extends TestBase {
    FollowUs followUsObject = new FollowUs(driver);



    @When("user clicks on facebook button")
    public void userClicksOnFacebookButton() throws InterruptedException {
        followUsObject.clickOnFacebook();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));


    }

    @Then("user clicks on twitter button")
    public void userClicksOnTwitterButton() throws InterruptedException {
        followUsObject.clickOnTwitter();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/i/flow/login?redirect_after_login=%2FnopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));
    }



    @Then("user clicks on rss button")
    public void userClicksOnRssButton() throws InterruptedException {
        followUsObject.clickOnRss();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/news/rss/1");
        Thread.sleep(Long.parseLong("2"));
        driver.navigate().to("https://demo.nopcommerce.com/");

    }



    @Then("user clicks on youtube page")
    public void userClicksOnYoutubePage() throws InterruptedException {
        followUsObject.clickOnYoutube();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));


    }
}
