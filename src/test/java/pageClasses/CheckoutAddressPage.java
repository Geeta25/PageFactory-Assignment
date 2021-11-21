package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutAddressPage {
    public WebDriver driver;
    //Locating elements
    @FindBy(id = "order_bill_address_id_0")
    public WebElement otherAddress;
    @FindBy(id = "order_bill_address_attributes_firstname")
    public WebElement firstName;
    @FindBy(id = "order_bill_address_attributes_lastname")
    public WebElement lastName;
    @FindBy(id = "order_bill_address_attributes_address1")
    public WebElement address1;
    @FindBy(id = "order_bill_address_attributes_address2")
    public WebElement address2;
    @FindBy(id = "order_bill_address_attributes_city")
    public WebElement cityName;
    @FindBy(id = "order_bill_address_attributes_state_id")  //dropdown
    public WebElement stateName;
    @FindBy(id = "order_bill_address_attributes_zipcode")
    public WebElement zipCode;
    @FindBy(id = "order_bill_address_attributes_country_id") //dd
    public WebElement countryName;
    @FindBy(id = "order_bill_address_attributes_phone")
    public WebElement phoneNum;
    @FindBy(name = "commit")
    public WebElement saveAndContinue;

    //Constructor method for connecting to test classes
    public CheckoutAddressPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Operational methods
    public void enterBillingAddress(String firstname,String lastname,String adrs1,String adrs2, String city,String state,String zip,String country,String phone){

        boolean firstNamedisplayed = firstName.isDisplayed();
        if (firstNamedisplayed==false){
            otherAddress.click();
        }
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        address1.sendKeys(adrs1);
        address2.sendKeys(adrs2);
        cityName.sendKeys(city);
        //state dropdown
        Select selectState=new Select(stateName);
        selectState.selectByVisibleText(state);
        zipCode.clear();
        zipCode.sendKeys(zip);
        //country dropdown
        Select selectCountry=new Select(countryName);
        selectCountry.selectByVisibleText(country);
        phoneNum.clear();
        phoneNum.sendKeys(phone);
        saveAndContinue.click();
    }
}
