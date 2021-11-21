package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public WebDriver driver;
    //Locating elements
    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    //Constructor method for connecting to test classes
    public ProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public void addToCartMethod() {
        addToCart.submit();
    }
}
