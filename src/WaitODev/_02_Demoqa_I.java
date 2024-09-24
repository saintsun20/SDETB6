package WaitODev;
/*
Senaryo
1) https://demoqa.com/browser-windows adresine gidin
2) Alerts’e tiklayin
3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
4) Allert’in gorunur olmasini bekleyin
5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
6) Ok diyerek alerti kapatin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static jdk.internal.agent.Agent.getText;

public class _02_Demoqa_I extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/browser-windows");

        WebElement alerts = driver.findElement(By.xpath("(//span[@class='text'])[12]"));
        alerts.click();

        WebElement alertClickMe = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        alertClickMe.click();

        wait.until(ExpectedConditions.alertIsPresent());

        String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals("This alert appeared after 5 seconds",alertText);

        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
