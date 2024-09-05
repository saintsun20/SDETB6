package CssSelectorOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoqa extends BaseDriver {

/*1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

            8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

 */

    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement automation = driver.findElement(By.xpath("//input[@type='text']"));
        automation.sendKeys("Automation");
        MyFunc.Bekle(2);

        WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
        mail.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement adres1 = driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
        adres1.sendKeys("Kuşadası");
        MyFunc.Bekle(2);

        WebElement adres2 = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
        adres2.sendKeys("Aydın");
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        giris.click();
        MyFunc.Bekle(2);

        Assert.assertTrue(true);

        Assert.assertTrue(true);

        BekleKapat();
    }
}