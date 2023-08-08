package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    By emailField = By.xpath("//input[@class='email']");
    By passwordField = By.xpath("//input[@class='password']");
    By login = By.xpath("//button[@class='button-1 login-button']");
    By logOut = By.className("ico-logout");

    By wrongEmail = By.xpath("//input[@class='email']");
    By wrongPassword = By.xpath("//input[@class='password']");
    By invalidCredential = By.xpath("//div[@class='message-error validation-summary-errors']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setEmailField(){
        setElementText(emailField,"yasmine12@gmail.com");
    }
    public void setPasswordField(){
        setElementText(passwordField,"123456789");
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }

    public void setWrongEmail(){
        setElementText(wrongEmail,"yasmine@test.com");
    }
    public void setWrongPassword(){
        setElementText(wrongPassword,"147852369");
    }
    public String invalidCredentialMessage(){
        String invalid = driver.findElement(invalidCredential).getText();
        return invalid;
    }
}
