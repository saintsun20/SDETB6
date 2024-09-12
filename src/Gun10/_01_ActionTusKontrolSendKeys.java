package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");
        MyFunc.Bekle(2);

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox)  // kutucuğa git
                .click()                // yazabilmek için içine tıklat
                .keyDown(Keys.SHIFT)    // shift tuşuna bas
                .sendKeys("a")          // a harfini gönder büyük A yazmalı shift ten dolayı
                .keyUp(Keys.SHIFT)      // shift tuşunu geri bırak
                .sendKeys("hmet")       // hmet yazısını gönder küçük harflerle yazmalı
                .build()                // aksiyonu hazırla
                .perform();             // işlemi gerçeklştir

        BekleKapat();
    }
}
