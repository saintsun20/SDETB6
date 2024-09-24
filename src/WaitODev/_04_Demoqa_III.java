package WaitODev;
/*
Senaryo
https://demoqa.com/dynamic-properties adresine gidin
1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static jdk.internal.agent.Agent.getText;

public class _04_Demoqa_III extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement visibleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        Assert.assertTrue("Buton hala görünür değil!", visibleButton.isDisplayed());

        BekleKapat();
    }
}
