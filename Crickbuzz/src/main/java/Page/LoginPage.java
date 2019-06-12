package Page;

import gherkin.lexer.Th;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.MobileAPI2;

public class LoginPage extends MobileAPI2 {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView\n")
     WebElement cric;

    @FindBy(id = "com.cricbuzz.android:id/img_action_settings")
    WebElement settings;

    @FindBy(id = "com.cricbuzz.android:id/txt_header")
    WebElement FEATUREDVIDEOS;

    @FindBy(id = "com.cricbuzz.android:id/txt_pointstable")
    WebElement POINTSTABLE;

    @FindBy(xpath = "//android.widget.TextView[@='SCHEDULE']")
    WebElement SCHEDULE;

    @FindBy(xpath = "//android.widget.TextView[@='TOP STORIES']")
    WebElement TOPSTORIES;

    @FindBy(id = "com.cricbuzz.android:id/bb_bottom_bar_icon")
    WebElement Matches;

    @FindBy(id = "com.cricbuzz.android:id/tab_news")
    WebElement News;

    @FindBy(xpath = "//android.widget.TextView[@='More']")
    WebElement More;



public void clickOnCric() throws InterruptedException{
    cric.click();
    Thread.sleep(5000);

}
public void clickOnsetting()throws InterruptedException{
    settings.click();
    Thread.sleep(5000);
}

public void clickOnFEATUREDVIDEOS()throws InterruptedException{
    FEATUREDVIDEOS.click();
    Thread.sleep(5000);

}
public void clickOnPOINTSTABLE()throws InterruptedException{
    POINTSTABLE.click();
    Thread.sleep(5000);

}
public void clickOnSCHEDULE()throws InterruptedException{
    SCHEDULE.click();
    Thread.sleep(5000);

}
public void clickOnTOPSTORIES()throws InterruptedException{
    TOPSTORIES.click();
    Thread.sleep(5000);

}
public void clickOnMatches()throws InterruptedException{
    Matches.click();
    Thread.sleep(5000);

}
public void clickOnNews()throws InterruptedException{
    News.click();
    Thread.sleep(5000);

}
public void clickOnMore()throws InterruptedException{
    More.click();
    Thread.sleep(5000);
}





}
