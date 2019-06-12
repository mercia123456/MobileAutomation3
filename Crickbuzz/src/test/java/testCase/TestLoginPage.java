package testCase;

import Page.LoginPage;
import cucumber.api.java.ca.I;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MobileAPI2;

public class TestLoginPage extends MobileAPI2 {


    LoginPage loginPage;

    @BeforeMethod
    public void intializationSignInPage() {

       loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
    }
    @Test
    public void clickOnCric() throws InterruptedException {
        loginPage.clickOnCric();

    }

    @Test
    public void clickOnsettings()throws InterruptedException{
        loginPage.clickOnsetting();

    }
    @Test
    public void clickOnFEATUREDVIDEOS()throws InterruptedException{
        loginPage.clickOnFEATUREDVIDEOS();

    }

    @Test
    public void clickOnPOINTSTABLE()throws InterruptedException{
        loginPage.clickOnPOINTSTABLE();

    }
    @Test
    public void clickOnSCHEDULE()throws InterruptedException{
        loginPage.clickOnSCHEDULE();

    }
    @Test
    public void clickOnTOPSTORIES()throws InterruptedException{
        loginPage.clickOnTOPSTORIES();

    }
    @Test
    public void clickOnMatches()throws InterruptedException{
        loginPage.clickOnMatches();

    }
    @Test
    public void clickOnNews()throws InterruptedException{
        loginPage.clickOnNews();

    }
    @Test
    public void clickOnMore()throws InterruptedException{
        loginPage.clickOnNews();
    }






}