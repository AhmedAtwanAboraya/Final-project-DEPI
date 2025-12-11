package Test;

import pages.Login_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Show_items extends Testbase {
    Login_page Login_page;
    //WebDriver driver;

    @Test (groups = {"Regression"})
    public void Valid_Login() {

        Login_page = new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com", "Ahmed123#");

        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Show All Desktops")).click();
        WebElement Dropdown = driver.findElement(By.id("input-limit"));
        Select select = new Select(Dropdown);
        select.selectByIndex(3);
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/category&path=20&limit=75");

        }

    }

