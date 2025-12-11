package Test;

import pages.Login_page;
import pages.returnn;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Returns extends Testbase {
    Login_page Login_page;


    @Test (groups = {"Regression"})
    public void Valid_Login() {

        Login_page = new Login_page(driver);
        Login_page.Login("ahmedramadan1404@gmail.com", "Ahmed123#");
        returnn retn =new returnn(driver);
        retn.returns();
        Assert.assertTrue(driver.findElement(By.linkText("Continue")).isDisplayed());
    }
}
