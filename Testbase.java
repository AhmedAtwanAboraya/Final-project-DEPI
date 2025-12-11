package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Testbase {
    WebDriver driver;
    @BeforeMethod
    public void openbrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

     @AfterMethod
     public void closeBrowser()
     {
        driver.close();
    }
}
