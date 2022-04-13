package salesforceelement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;

public class TextArea {
    private static final Logger LOGGER = LogManager.getLogger(TextArea.class.getName());
    WebDriver driver;
    String label;
    String textareaXpath = "//article[contains(., 'New Account')]//label[contains(., '%s')]/following-sibling::textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void textareaText(String text) {
        textareaXpath = String.format(textareaXpath, label);
        LOGGER.trace(String.format("Fill in %s text into %s field located by %s xpath", text,label,textareaXpath));
        driver.findElement(By.xpath(textareaXpath)).sendKeys(text);
    }

}
