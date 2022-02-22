package tests;

import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

public class AccountTest extends BaseTest {

    private static String USERMANE = "safronov922-zg2x@force.com";
    private static String PASSWORD= "Safronov21";


    @Test
    public void CreateAccountTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(USERMANE,PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.OpenCreateAccountModel();
        System.out.println("");

    }

}
