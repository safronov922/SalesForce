package pages;

import models.SalesForceAccountModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import salesforceelement.DropDawnList;
import salesforceelement.InputField;
import salesforceelement.TextArea;


public class CreateAccountPage extends BasePage {
    private By SEARCH_INPUT = By.xpath("//article[contains(., 'New Account')]//label[contains(., 'Account Name')]/following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    private By SUCCESS_MESSAGE = By.xpath("//div[@data-key='success']//span[text()='Account']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void saveNewAccountForm(SalesForceAccountModel accountModel) {
        driver.findElement(SEARCH_INPUT).sendKeys(accountModel.getAccountName());
        new InputField(driver, "Phone").inputText(accountModel.getPhone());
        new InputField(driver, "Fax").inputText(accountModel.getFax());
        new InputField(driver, "Website").inputText(accountModel.getWebSite());
        new DropDawnList(driver, "Type").selectOption(accountModel.getType());
        new DropDawnList(driver, "Industry").selectOption(accountModel.getIndustry());
        new InputField(driver, "Employees").inputText(accountModel.getEmployees());
        new InputField(driver, "Annual Revenue").inputText(accountModel.getAnnualRevenue());
        new TextArea(driver, "Description").textareaText(accountModel.getDescription());
        new TextArea(driver, "Billing Street").textareaText(accountModel.getBillingStreet());
        new TextArea(driver, "Shipping Street").textareaText(accountModel.getShippingStreet());
        new InputField(driver, "Billing City").inputText(accountModel.getBillingCity());
        new InputField(driver, "Billing State/Province").inputText(accountModel.getBillingState());
        new InputField(driver, "Shipping City").inputText(accountModel.getShippingCity());
        new InputField(driver, "Shipping State/Province").inputText(accountModel.getShippingState());
        new InputField(driver, "Billing Zip/Postal Code").inputText(accountModel.getBillingZip());
        new InputField(driver, "Billing Country").inputText(accountModel.getBillingCountry());
        new InputField(driver, "Shipping Zip/Postal Code").inputText(accountModel.getShippingZip());
        new InputField(driver, "Shipping Country").inputText(accountModel.getShippingCountry());
        driver.findElement(SAVE_BUTTON).click();
    }

    public boolean displaedSuccessMessage() {
        return driver.findElement(SUCCESS_MESSAGE).isDisplayed();
    }
}
