package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class AccountTest extends BaseTest {

    private static String USERMANE = "xi2004-73ev@force.com";
    private static String PASSWORD = "Safronov21";


    @Test
    public void CreateAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(USERMANE, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.OpenCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        boolean success = createAccountPage.displaedSuccessMessage();
        Assert.assertTrue(success, "Account don't create");
    }

}
