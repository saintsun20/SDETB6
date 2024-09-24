package WaitODev;
/*
Senaryo
1) https://demoqa.com/dynamic-properties adresine gidin
2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
3) “Will enable 5 seconds” butonunun enable oldugunu test edin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class _03_Demoqa_II extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement enableButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        Assert.assertTrue("Buton hala etkin değil!", enableButton.isEnabled());

        BekleKapat();
    }
}
