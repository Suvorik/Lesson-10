package rd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "loginform-username")
    WebElement nameField;

    @FindBy(id = "loginform-password")
    WebElement passwordField;

    @FindBy(id = "login_btn")
    WebElement loginButton;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}