package rd;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static WebDriver driver;
    public static LoginPage LoginPage;
    public static MainPage MainPage;
    public static String url = "https://diary.ru/user/login";
    public static String name = "TyrloTV";
    public static String password = "kfTeh9rrcu";

    @BeforeClass
    public static void openLoginPage() {
        System.setProperty("webdriver.chrome.driver", "c:/Program Files/Google/Chrome/Application/chrome.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);

        LoginPage = new LoginPage(driver);
        MainPage = new MainPage(driver);
    }

    @Test
    public void wikiLoginTest() {
        LoginPage.inputName(name);
        LoginPage.inputPassword(password);
        LoginPage.clickLoginButton();

        Assert.assertEquals(MainPage.getUserName(), name);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}