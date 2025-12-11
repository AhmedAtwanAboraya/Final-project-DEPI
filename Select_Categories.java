package Test;

import pages.Login_page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Select_Categories extends Testbase{
    Login_page Login_page;

    @Test (groups = {"Regression"})
    public void Valid_Login() {

        Login_page = new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com", "Ahmed123#");


        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Show All Desktops")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/category&path=20");
        driver.findElement(By.linkText("Components")).click();
        driver.findElement(By.linkText("Monitors (2)")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/category&path=25_28");
        driver.findElement(By.linkText("Tablets")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/category&path=57");

    }
}
