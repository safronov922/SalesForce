package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class LoginPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());
    private By USERNAME_INPUT = By.id("username");
    private By USER_PASSWORD_INPUT = By.id("password");
    private By LOGin_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(WebUrls.SALEFORCE_URL);
    }

    public void login(String username, String password) {
        LOGGER.trace("Fill in username and password");
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        LOGGER.trace("Clicking log in button");
        driver.findElement(LOGin_BUTTON).click();
    }


}
