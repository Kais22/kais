package Login_Page;

import Page.Login;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login_Page_Demo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/adelinoubli/Desktop/Java_selenium_web_driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://identity-test.tst-ocpapps.biat.int:8080/auth/realms/biat-retail/protocol/openid-connect/auth?client_id=bb-web-client&redirect_uri=http%3A%2F%2Fips-edge-edge-test.tst-ocpapps.biat.int%3A8080%2Fmybiat-web%2Flogin&state=36bcadb2-8bee-498d-800d-1a422fdd8cb0&response_mode=fragment&response_type=code%20id_token%20token&scope=openid&nonce=83e7e19b-56d3-4424-a246-cca08c395c5f&ui_locales=en%20fr&code_challenge=IzdwUiLDiXvZIipfBUqTEGIr2zx4dWEOZ6fl8EMX1cA&code_challenge_method=S256");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        Login Log = new  Login(driver);
        Log.setUsername();
        Log.setPassWord();
        Log.hitLoginButton();
        try {
            Thread.sleep(5000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            String acutalTiltle = driver.getTitle();
            System.out.println(acutalTiltle);
            driver.quit();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
