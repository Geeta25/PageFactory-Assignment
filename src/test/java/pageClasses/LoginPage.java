package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    //Locating elements
    @FindBy(id = "spree_user_email")
    public WebElement userEmail;
    @FindBy(id = "spree_user_password")
    public WebElement userPassword;

    //Constructor method for connecting to test classes
    public LoginPage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }
    //Operational methods
    public void loginMethod(String userId, String password){
        userEmail.sendKeys(userId); //enter user id
        userPassword.sendKeys(password); //enter password
        driver.findElement(By.xpath("//input[@data-disable-with='Login']")).submit(); //login using submit
    }
}
