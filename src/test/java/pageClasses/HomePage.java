package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    //Locating elements
    @FindBy(xpath = "//a[text()='Bags']")
    public WebElement categoryType;

    //Constructor method for connecting to test classes
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public void clickCategoryMethod(){
        categoryType.click();
    }
}
