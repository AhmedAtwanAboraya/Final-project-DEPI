package pages;

import Test.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class payment extends Testbase {
    WebDriver driver;


    public payment(WebDriver driver) {
        this.driver = driver;

    }

    public void payment1()  {

        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Show All Desktops")).click();
        driver.findElement(By.linkText("HP LP3065")).click();
        driver.findElement(By.id("button-cart")).click();
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        driver.findElement(By.id("button-payment-address")).click();
        driver.findElement(By.id("button-shipping-address")).click();
        driver.findElement(By.id("button-shipping-method")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.id("button-payment-method")).click();
        driver.findElement(By.id("button-confirm")).click();


    }
}
