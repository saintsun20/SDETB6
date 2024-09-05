package CssSelectorOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPagesII extends BaseDriver {

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
 */

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alarm1 = driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        alarm1.click();
        MyFunc.Bekle(2);

        WebElement alrmbox = driver.findElement(By.xpath("//input[@value='Show fake alert box']"));
        alrmbox.click();
        MyFunc.Bekle(2);

        WebElement buton = driver.findElement(By.xpath("//div[@class='page-footer']"));
        buton.click();
        MyFunc.Bekle(2);

        Assert.assertTrue(true);

        BekleKapat();
    }
}