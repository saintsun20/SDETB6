package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_Alertler extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe = driver.findElement(By.id("alert"));
        clickMe.click();
        MyFunc.Bekle(2);

        // şu anda alert çıkmış oldu
        driver.switchTo().alert().accept(); // Alertin OK butonuna Tıklat

        BekleKapat();
    }

    @Test
    public void Test2(){

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        MyFunc.Bekle(2);

        // şu anda alert çıkmış oldu
        driver.switchTo().alert().dismiss(); // Alertin CANCEL butonuna Tıklat

        WebElement txtMesaj = driver.findElement(By.id("text"));

        Assert.assertTrue("Mesaj Bulunamadı", txtMesaj.getText().equalsIgnoreCase("null"));

        BekleKapat();
    }

    @Test
    public void Test3(){

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        MyFunc.Bekle(2);

        // şu anda alert çıkmış oldu
        driver.switchTo().alert().sendKeys("İsmet");
        driver.switchTo().alert().accept(); // Alertin OK butonuna Tıklat

        WebElement txtMesaj = driver.findElement(By.id("text"));

        new Actions(driver).scrollToElement(txtMesaj).build().perform();
        MyFunc.Bekle(2);

        Assert.assertTrue("Mesaj Bulunamadı", txtMesaj.getText().equalsIgnoreCase("ismet"));

        BekleKapat();
    }

    @Test
    public void Test4(){

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement prompt = driver.findElement(By.id("prompt-with-default"));
        prompt.click();
        MyFunc.Bekle(2);

        // şu anda alert çıkmış oldu
        String okunanYazi = driver.switchTo().alert().getText(); // promptun Açıklama başlığını
        driver.switchTo().alert().accept(); // Alertin OK butonuna Tıklat

        System.out.println("okunanYazi = " + okunanYazi);
        Assert.assertTrue("Mesaj Bulunamadı", okunanYazi.contains("Enter"));

        BekleKapat();

    }
}

