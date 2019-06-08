package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.MobileAPI2;

import java.util.concurrent.Callable;

public class HomePage extends MobileAPI2 {


   /* @FindBy(xpath = "//android.view.View[@content-desc=\"Voice search\"]")
    public WebElement Voicesearch;*/

    @FindBy(xpath = "//android.widget.TextView[@='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@='Dark Theme']")
    public WebElement DarkThem;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Cricbuzz\"])[2]")
    public WebElement CrickBzz;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Photos\"])[2]")
    public WebElement Photos;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Maps\"])[2]")
    public WebElement Maps;

    @FindBy(xpath = "//android.widget.EditText[@='Search here']")
    public WebElement MapsSearch;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Settings\"])[2]")
    public WebElement Settings;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"Calendar\"])[2]")
    public WebElement Calender;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Appium Settings\"]")
    public WebElement AppiumSetting;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Calculator\"]")
    public WebElement Calculator;

    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Camera\"]")
    public WebElement Camera;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Chrome\"]")
    public WebElement Chrome;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Clock\"]")
    public WebElement Clock;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Contacts\"]")
    public WebElement Contacts;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Drive\"]")
    public WebElement Driver;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Files\"]")
    public WebElement Files;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Gmail\"]")
    public WebElement Gmail;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Google\"]")
    public WebElement Google;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Messages\"]")
    public WebElement Messages;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Phone\"]")
    public WebElement Phone;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Play Movies & TV\"]")
    public WebElement PlayMoviesAndTV;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"WebView Browser Tester\"]")
    public WebElement WebBrowserTester;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"YouTube\"]")
    public WebElement YouTube;



    public void ClickVoicesearch() {
        //Voicesearch.sendKeys();

    }

    public void ClickSettings(){
        settings.sendKeys();

    }

    public void setDarkThem(){
        DarkThem.click();

    }
    public void ClickCrickBzz(){
        CrickBzz.sendKeys();

    }

    public void setPhotos(){
        Photos.click();

    }
    public void setMaps(String address){
        Maps.click();
        MapsSearch.sendKeys();

    }
    public void setSettings(){
        Settings.click();

    }
    public void setCalender(){
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
    public void setChrome(){
        Chrome.click();

    }
    public void setClock(){
        Clock.click();

    }
    public void setContacts(){
        Contacts.click();

    }
    public void setDriver(){
        Driver.click();

    }

    public void setFiles(){
        Files.click();

    }

    public void setGmail(){
        Gmail.click();

    }
    public void setGoogle(){
        Google.click();

    }
    public void setMessages(){
       Messages.click();

    }

    public void setPhone(){
       Phone.click();

    }

    public void setPlayMoviesAndTV(){
        PlayMoviesAndTV.click();

    }

    public void setWebBrowserTester(){
        WebBrowserTester.click();


    }

    public void setYouTube(){
        YouTube.click();

    }
}
