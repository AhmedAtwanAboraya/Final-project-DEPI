package Test;

import pages.Invalid_Signup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class invalid_signup extends Testbase {
    Invalid_Signup Invalid_Signup;
    @Test(groups = {"Regression"})
    public void Invalid_Signup(){

        Invalid_Signup Invalid= new Invalid_Signup(driver);
        Invalid.invalid();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
    }
}
