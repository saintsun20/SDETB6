package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ExplicitWait extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(20));// Driver 20 sn en fazla bekletecek

        bekle.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        // id si demo olan webelemntin görünen yazısı "WebDriver" olana kadar(20sn) bekle

        WebElement demoMsj=driver.findElement(By.id("demo"));
        System.out.println("demoMsj.getText() = " + demoMsj.getText());

        BekleKapat();
    }
}
