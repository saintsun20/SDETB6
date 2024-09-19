package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _07_Soru extends BaseDriver {

    /*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */
    @Test
    public void Test1() {
        driver.get("https://google.com/");

        //bulursan tıklat, bulamzsan geç
        List<WebElement> acceptAll = driver.findElements(By.id("L2AGLb"));
        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        WebElement srcBox = driver.findElement(By.name("q"));
        srcBox.sendKeys("Selenium" + Keys.ENTER); // \n \r

//        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
//        WebElement srcBtn=driver.findElement(By.name("btnK"));
//        srcBtn.click();

          WebElement seleniumLink = driver.findElement(By.xpath("//cite[text()='https://www.selenium.dev']"));
          seleniumLink.click();

          wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
          Assert.assertTrue("Sayfaya ulaşılamadı", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

          BekleKapat();
    }
}
