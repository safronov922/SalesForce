package tests;

import models.SalesForceAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class AccountTest extends BaseTest {

    private static String USERMANE = "xi2004-73ev@force.com";
    private static String PASSWORD = "Safronov21";
    private static final Logger LOGGER = LogManager.getLogger(AccountTest.class.getName());


    @Test
    public void createAccountTest() {
        LOGGER.info("createAccountTest started");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("open page" + loginPage.getClass().getName());
        loginPage.openPage();
        loginPage.login(USERMANE, PASSWORD);
        LOGGER.info("Login with username and password " + USERMANE + " " + PASSWORD );
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info("open page  " + accountsPage.getClass().getName());
        accountsPage.openAccountsTab();
        accountsPage.OpenCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        SalesForceAccountModel salesForceAccountModel = GetNewAccountModel.getAccountWithAllFields();
        LOGGER.info("Attempt to create account with name " + salesForceAccountModel.getAccountName());
        createAccountPage.saveNewAccountForm(salesForceAccountModel);
        boolean success = createAccountPage.displaedSuccessMessage();
        Assert.assertTrue(success, "Account don't create");
    }

}
