package Test;

import pages.Login_page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends Testbase{
    //WebDriver driver;
    Login_page Login_page;


    @Test (groups = {"Regression"})
    public void Valid_Login(){
        Login_page =new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com","Ahmed123#");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']")).isDisplayed());


    }
}
