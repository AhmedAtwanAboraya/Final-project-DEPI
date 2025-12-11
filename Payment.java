package Test;

import pages.Login_page;
import pages.payment;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Payment extends Testbase{
    Login_page Login_page;


    @Test (groups = {"Regression"})
    public void Valid_Login()  {

        Login_page = new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com", "Ahmed123#");
        payment pay= new payment(driver);
        pay.payment1();

        Assert.assertTrue(driver.findElement(By.linkText("Success")).isDisplayed());


    }
}
