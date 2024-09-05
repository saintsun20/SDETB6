package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {

//    Senaryo: (Sadece CSSSelector)
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculate'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız.

      @Test
      public void Test1(){
          driver.get("https://testpages.herokuapp.com/styled/index.html");

          WebElement cal = driver.findElement(By.cssSelector("[id='calculatetest']"));
          cal.click();
          MyFunc.Bekle(2);

          WebElement input1 = driver.findElement(By.cssSelector("[id='number1']"));
          input1.sendKeys("6");
          MyFunc.Bekle(2);

          WebElement input2 = driver.findElement(By.cssSelector("[id='number2']"));
          input2.sendKeys("5");
          MyFunc.Bekle(2);

          WebElement calculate = driver.findElement(By.cssSelector("[id='calculate']"));
          calculate.click();
          MyFunc.Bekle(2);

          WebElement cevap = driver.findElement(By.cssSelector("[id='answer']"));
          System.out.println("cevap.getText() = " + cevap.getText());

          Assert.assertTrue(true);

          BekleKapat();
     }
}
