package CssSelectorOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoAppli extends BaseDriver {

/*
1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
 */

    @Test
    public void Test1() {
        driver.get("http://demo.applitools.com/");

        WebElement kullAdı = driver.findElement(By.xpath("//input[@type='text']"));
        kullAdı.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("techno123");
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        giris.click();
        MyFunc.Bekle(2);

        Assert.assertTrue(true);

        BekleKapat();
    }
}
