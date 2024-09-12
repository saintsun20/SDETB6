package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox)  // kutucuğa git
                .click()                // yazabilmek için içine tıklat
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.Bekle(2); // tuşa basıldığında seçeneklerin çıkması için bir süre gerekiyor

        new Actions(driver)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();
    }
}
