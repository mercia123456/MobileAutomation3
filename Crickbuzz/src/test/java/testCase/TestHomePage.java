package testCase;

import Page.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MobileAPI2;

public class TestHomePage extends MobileAPI2 {

    HomePage testHomePage;

    @BeforeMethod
    public void intializationSignInPage() {

        testHomePage = PageFactory.initElements(appiumDriver, HomePage.class);
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
    public void testSettings() {
        testHomePage.ClickSettings();

    }

    @Test
    public void testDarkThem() {
        testHomePage.setDarkThem();

    }
    @Test
    public void testCrickBzz() {
        testHomePage.ClickCrickBzz();

    }


    @Test
    public void testPhotos() {
        testHomePage.setPhotos();

    }

    @Test
    public void testMaps() {
        testHomePage.setMaps("woodside");

    }

    @Test
    public void ClickSettings() {
        testHomePage.setSettings();

    }

    @Test
    public void testCalender() {
        testHomePage.setCalender();

    }

    @Test
    public void clicAppiumSetting() {
        testHomePage.setAppiumSetting();

    }

    @Test
    public void testCalculator() {
        testHomePage.setCalculator();

    }

    @Test
    public void testCamera() {
        testHomePage.setCamera();

    }

    @Test
    public void testChrome() {
        testHomePage.setChrome();

    }

    @Test
    public void testClock() {
        testHomePage.setClock();

    }

    @Test
    public void testContacts() {
        testHomePage.setContacts();


    }

    @Test
    public void testDriver() {
        testHomePage.setDriver();

    }

    @Test
    public void testFiles() {
        testHomePage.setFiles();

    }

    @Test
    public void testGmail() {
        testHomePage.setGmail();

    }

    @Test
    public void testGoogle() {
        testHomePage.setGoogle();

    }

    @Test
    public void testMessages() {
        testHomePage.setMessages();


    }

    @Test
    public void testPhone() {
        testHomePage.setPhone();


    }

    @Test
    public void testPlayMoviesAndTV() {
        testHomePage.setPlayMoviesAndTV();


    }

    @Test
    public void testWebBrowserTester() {
        testHomePage.setWebBrowserTester();


    }

    @Test
    public void testYouTube() {
        testHomePage.setYouTube();


    }
}




