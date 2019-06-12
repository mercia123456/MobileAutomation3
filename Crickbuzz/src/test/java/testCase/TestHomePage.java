package testCase;

import Page.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MobileAPI2;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;

    @BeforeMethod
    public void intializationSignInPage() { homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    /*public void testAccountFunctionallity() {
        homePage.clickAccount();
        accountPage.sendKeyAccount();
    }*/

    @Test
    public void swipeDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        functionSwipe("up", 200, 200);

    }

    @Test(enabled = false)
    public void testCrickBuzz() {
        homePage.sandKeyCrickBuzz();

    }

    @Test
    public void testSettings() {
        homePage.sandKeySettings();

    }

    @Test
    public void testDarkThem() {
        homePage.sandKeyDarkThem();

    }
    @Test
    public void ClickListView() {
        homePage.setListView();

    }
    @Test
    public void ClickPhotos() {
        homePage.setPhotos(10);


    }

    @Test
    public void testMaps() {
        homePage.setMaps("woodside");

    }


    @Test
    public void testCalender() {
        homePage.sandKeyCalender();

    }

    @Test
    public void clicAppiumSetting() {
        homePage.setAppiumSetting();

    }

    @Test
    public void testCalculator() {
       homePage.setCalculator();

    }

    @Test
    public void testCamera() {
        homePage.setCamera();

    }

    @Test
    public void testChrome() {
        homePage.sandKeyChrome();

    }

    @Test
    public void testClock() {
        homePage.sandKeyClock();

    }

    @Test
    public void testContacts() {
       homePage.sandKeyContacts();


    }

    @Test
    public void testDriver() {
       homePage.sandKeyDriver();

    }

    @Test
    public void testFiles() {
        homePage.sandKeyFiles();

    }

    @Test
    public void testGmail() {
        homePage.sandKeyGmail();

    }

    @Test
    public void testGoogle() {
        homePage.sandKeyGoogle();

    }

    @Test
    public void testMessages() {
       homePage.sandKeyMessages();

    }

    @Test
    public void testPhone() {
        homePage.sandKeyPhone();


    }

    @Test
    public void testPlayMoviesAndTV() {
        homePage.sandKeyPlayMoviesAndTV();


    }

    @Test
    public void testWebBrowserTester() {
       homePage.sandKeyWebBrowserTester();


    }

    @Test
    public void testYouTube() {
        homePage.sandKeyYouTube();


    }
}