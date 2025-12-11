package Test;

import org.openqa.selenium.WebElement;
import pages.Adress;
import pages.Login_page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newaddress extends Testbase{


    Login_page Login_page;



    @Test (groups = {"Regression"})
    public void Valid_Login(){
        Login_page =new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com","Ahmed123#");

        Adress adress =new Adress(driver);
        adress.address();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/address");
    }

}
