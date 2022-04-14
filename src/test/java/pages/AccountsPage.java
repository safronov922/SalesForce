package pages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AccountsPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());
    private By NEW_BUTTON = By.cssSelector("div[title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open modal window New Account")
    public void OpenCreateAccountModel() {
        LOGGER.trace("Clicking button New on Account page");
        driver.findElement(NEW_BUTTON).click();
    }

    @Step("Open '{WebUrls.SALEFROCE_ACTIONS}' url")
    public void openAccountsTab() {
        LOGGER.trace("Open Account Tab");
        driver.get(WebUrls.SALEFROCE_ACTIONS);
    }
}
