package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Invalid_Signup {
    WebDriver driver;

    public Invalid_Signup(WebDriver driver) {
        this.driver = driver;
    }

    public void invalid()
    {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ramadan");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ahmedramadan//*@gma+il.com");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("01090742732");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ahmed123#");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Ahmed123#");
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();



    }

}
