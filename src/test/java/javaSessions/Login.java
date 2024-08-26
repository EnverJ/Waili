package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class Login {
    public static void main(String[] args){
        //set up the path
      //  System.setProperty("webdriver.chrome.driver","path");
        //create new instance of chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //navigate to loginpage
        driver.get("https://naveenautomationlabs.com/opencart/");
        //myaccount
        WebElement myAccount= driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
        myAccount.click();
        WebElement login= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        login.click();
        WebElement emailAddress= driver.findElement(By.id("input-email"));
        WebElement password= driver.findElement(By.id("input-password"));
        WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        // envernurl123@gmail.com
        //Enver@12345
        emailAddress.sendKeys("envernurl123@gmail.com");
        password.sendKeys("Enver@12345");
        loginButton.click();

        //wait for the webpage to load
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement MyAccount= driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        assert MyAccount.isDisplayed();

        //
        List<WebElement> link= driver.findElements(By.cssSelector("a"));
        //get title
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String title= js.executeScript( "returnDocument.title;").toString();

        //TakeScreenshot interface
        File screnshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile( screnshot, new File(""));








        driver.quit();


    }

}
