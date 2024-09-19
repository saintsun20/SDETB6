package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _02_ImplicitlyWait extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        // önce alttaki bölüm yok/sonra 5 sn/sonra 20 sn
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // findelement/s mühlet
        
        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();
        
        WebElement msj = driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        BekleKapat();
    }
}
