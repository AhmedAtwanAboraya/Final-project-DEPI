package Test;

import pages.Login_page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Currencies extends Testbase{
    Login_page Login_page;
    //WebDriver driver;

    @Test (groups = {"Regression"})
    public void Valid_Login() {


        Login_page = new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com", "Ahmed123#");
        driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
        driver.findElement(By.xpath("//button[@name='GBP']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='form-currency']/div/button/strong")).isDisplayed());


    }
}
