package testCase;

import Page.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MobileAPI2;

public class TestSignInPage extends MobileAPI2 {


    SignInPage testSignInPage;

    @BeforeMethod
    public void intializationSignInPage() {

        testSignInPage = PageFactory.initElements(appiumDriver, SignInPage.class);
    }
    @Test(enabled = false)
    public void testSignIn() {
        testSignInPage.setSignIn();

    }
}