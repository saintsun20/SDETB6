package CssSelectorOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPages extends BaseDriver {

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.
 */

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement cal = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        cal.click();
        MyFunc.Bekle(2);

        WebElement input1 = driver.findElement(By.xpath("//input[@id='number1']"));
        input1.sendKeys("15");
        MyFunc.Bekle(2);

        WebElement input2 = driver.findElement(By.xpath("//input[@id='number2']"));
        input2.sendKeys("7");
        MyFunc.Bekle(2);

        WebElement calculate = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement cevap = driver.findElement(By.xpath("//input[@id='answer']"));
        System.out.println("cevap.getText() = " + cevap.getText());

        Assert.assertTrue(true);

        BekleKapat();
    }
}