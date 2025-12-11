package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
    WebDriver driver;

    public Login_page(WebDriver driver) {
        this.driver = driver;
    }


    public void Login(String user, String pass){
        driver.findElement(By.id("input-email")).sendKeys(user);
        driver.findElement(By.id("input-password")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
    }
}
