package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    // Locators for login page
    By Username = By.id("username");
    By PassWord = By.xpath("//input[@id=\"password\"]");
    By LoginButton = By.xpath("//button[@name=\"login\"]");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    // methods for login page
    public void setUsername()
    {
        driver.findElement(Username).sendKeys("noureddine.ghrab@value.com.tn");
    }

    public void setPassWord() {
        driver.findElement(PassWord).sendKeys("ValueBIAT.2020");
    }
    public void hitLoginButton()
    {
        driver.findElement(LoginButton).click();
    }
}
