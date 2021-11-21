package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

    public WebDriver driver;
    //Locating elements
    @FindBy(xpath = "//span[text()='Ruby on Rails Tote']")
    public WebElement firstProduct;

    //Constructor method for connecting to test classes
    public CategoriesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Operational methods
    public void selectProductMethod() {
        firstProduct.click();
    }
}
