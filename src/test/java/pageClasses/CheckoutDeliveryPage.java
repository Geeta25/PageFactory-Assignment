package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutDeliveryPage {
    public WebDriver driver;
    //Locating elements
    @FindBy(xpath = "//span[text()='UPS Two Day (USD)']/preceding-sibling::input")
    public WebElement shippingMethodOption;
    @FindBy(name = "commit")
    public WebElement saveAndContinue;

    //Constructor method for connecting to test classes
    public CheckoutDeliveryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public void selectShippingMethod(){
        shippingMethodOption.click();
        saveAndContinue.click();
    }
}
