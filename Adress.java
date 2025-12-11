package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adress {
    WebDriver driver;


    public Adress(WebDriver driver) {
        this.driver = driver;
    }

    public void address() {
        driver.findElement(By.linkText("Modify your address book entries")).click();
        driver.findElement(By.linkText("New Address")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ramadan");
        driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("Mansoura Meet Khamees Mostafa Street");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Mansoura");
        driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12345");
        WebElement Dropdown = driver.findElement(By.id("input-country"));
        Select select = new Select(Dropdown);
        select.selectByValue("63");
        WebElement Dropdown1 = driver.findElement(By.id("input-zone"));
        Select select1 = new Select(Dropdown1);
        select1.selectByValue("1001");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

    }
}
