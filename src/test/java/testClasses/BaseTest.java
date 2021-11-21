package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void driverMethod() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //wait
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Login']")).click(); //click login link
    }

    @AfterMethod
    public void closeMethod()
    {
        driver.quit();
    }
}