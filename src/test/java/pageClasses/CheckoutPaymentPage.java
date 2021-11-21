package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPaymentPage {
    public WebDriver driver;
    //Locating elements
    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    public WebElement checkPaymentOption;
    @FindBy(name = "commit")
    public WebElement saveAndContinue;

    //Constructor method for connecting to test classes
    public CheckoutPaymentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public void placeOrder(){
        checkPaymentOption.click();
        saveAndContinue.click();
    }
}
