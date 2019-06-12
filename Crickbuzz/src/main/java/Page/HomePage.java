package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.MobileAPI2;


public class HomePage extends MobileAPI2 {

    @FindBy(id = "com.cricbuzz.android:id/toolbar")
    public WebElement CrickBzz;

    @FindBy(xpath = "//android.widget.TextView[@='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@='Dark Theme']")
    public WebElement DarkThem;

    @FindBy(id = "com.google.android.apps.nexuslauncher:id/apps_list_view")
    public WebElement ListView;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Photos\"])[2]")
    public WebElement Photos;

    @FindBy(id = "com.google.android.apps.photos:id/negative_button")
    public WebElement NOTNOW;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Maps\"])[2]")
    public WebElement Maps;

    @FindBy(xpath = "//android.widget.EditText[@='Search here']")
    public WebElement MapsSearch;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Calculator\"])[2]")
    public WebElement Calculator;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Calendar\"])[2]")
    public WebElement Calender;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Appium Settings\"]")
    public WebElement AppiumSetting;

    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Camera\"]")
    public WebElement Camera;

    @FindBy(id = "com.android.chrome:id/terms_accept")
    public WebElement ACCEPTAndCONTINUE;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Chrome\"]")
    public WebElement Chrome;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Clock\"]")
    public WebElement Clock;

    @FindBy(xpath = "//android.widget.TextView[@='ALARM']")
    public WebElement ALARM;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Contacts\"])[1]")
    public WebElement Contacts;

    @FindBy(xpath = "//android.widget.Button[@='ADD ACCOUNT']")
    public WebElement ADDACCOUNT;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Drive\"]")
    public WebElement Driver;

    @FindBy(xpath = "//android.view.View[@='Sign in']")
    public WebElement Signin;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Files\"]")
    public WebElement Files;

    @FindBy(xpath = "//android.widget.TextView[@='Modified']")
    public WebElement Modified;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Gmail\"]")
    public WebElement Gmail;

    @FindBy(xpath = "//android.widget.TextView[@='New in Gmail']")
    public WebElement NewinGmail;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Google\"]")
    public WebElement Google;

    @FindBy(xpath = "//android.widget.TextView[@='SIGN IN']")
    public WebElement SIGNIN;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Messages\"]")
    public WebElement Messages;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Phone\"]")
    public WebElement Phone;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Play Movies & TV\"]\n")
    public WebElement PlayMoviesAndTV;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"WebView Browser Tester\"]")
    public WebElement WebBrowserTester;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"YouTube\"]")
    public WebElement YouTube;


    public void sandKeyCrickBuzz() throws InterruptedException {
        CrickBzz.click();
        Thread.sleep(5000);

    }

    public void sandKeySettings() {
        settings.click();

    }

    public void sandKeyDarkThem() {
        DarkThem.click();

    }
    public void setListView(){
        ListView.click();

    }

    public void setPhotos(int number){
        Photos.click();
        NOTNOW.click();
        Photos.sendKeys();

    }
    public void setMaps(String address){
        Maps.click();
        MapsSearch.sendKeys();

    }

    public void sandKeyCalender(){
        Calender.click();


    }
    public void setAppiumSetting() {
        AppiumSetting.click();

    }
    public void setCalculator(){
        Calculator.click();

    }
    public void setCamera(){
       Camera.click();

    }
    public void sandKeyChrome(){
        Chrome.click();
        ACCEPTAndCONTINUE.click();


    }
    public void sandKeyClock(){
        Clock.click();
        ALARM.click();

    }
    public void sandKeyContacts(){
        Contacts.click();
        ADDACCOUNT.click();


    }
    public void sandKeyDriver(){
        Driver.click();
        Signin.click();

    }

    public void sandKeyFiles(){
        Files.click();
        Modified.click();

    }

    public void sandKeyGmail(){
        Gmail.click();
        NewinGmail.click();

    }
    public void sandKeyGoogle(){
        Google.click();
        SIGNIN.click();

    }
    public void sandKeyMessages(){
       Messages.click();

    }

    public void sandKeyPhone(){
       Phone.click();

    }

    public void sandKeyPlayMoviesAndTV(){
        PlayMoviesAndTV.click();

    }

    public void sandKeyWebBrowserTester(){
        WebBrowserTester.click();


    }

    public void sandKeyYouTube()throws InterruptedException{
        YouTube.click();
        Thread.sleep(5000);

    }
}
