package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderConfirmationPage {
    public WebDriver driver;
    //Locating elements
    @FindBy(xpath = "//div[text()='Your order has been processed successfully']")
    public WebElement orderNotification;

    //Constructor method for connecting to test classes
    public OrderConfirmationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public  void getOrderStatus(){
        Assert.assertEquals(orderNotification.getText(),"Your order has been processed successfully");
    }
}
