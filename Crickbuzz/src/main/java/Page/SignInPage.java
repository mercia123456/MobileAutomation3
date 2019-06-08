package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.MobileAPI2;

public class SignInPage extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.Button[*@='SIGN IN']")
     WebElement SignIn;


public void setSignIn(){
    SignIn.sendKeys();

}



// public void sendKeyAccount() {
//
//        userName.sendKeys("example");
//    }


}
