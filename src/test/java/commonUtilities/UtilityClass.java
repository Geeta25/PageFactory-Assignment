package commonUtilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityClass {
    public WebDriver driver;

    //Constructor method for connecting to test classes
    public UtilityClass(WebDriver driver){
        this.driver=driver;
    }

    //Get Screen shot
    public String getScreenShot() throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat(("dd-MMM-yyyy-hh-mm-ss"));
        Date dt=new Date();
        String fileName=sdf.format(dt)+".png";
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filePath="./drivers/";
        File destination=new File(filePath+fileName); //filepath specified
        FileHandler.copy(source,destination);
        return(destination.getAbsolutePath());
    }
}
