package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class returnn {
    WebDriver driver;


    public returnn(WebDriver driver) {
        this.driver = driver;
    }

    public void returns(){
        driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahmed");
       // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ahmedramadan1404@gmail.com");
      //  driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("01090742732");
        driver.findElement(By.xpath("//input[@name='order_id']")).sendKeys("101213");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='product']")).sendKeys("labtop");
        driver.findElement(By.xpath("//input[@name='model']")).sendKeys("A7adfg");
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();






    }
}
