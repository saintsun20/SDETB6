package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _06_Soru extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test1()
    {
        driver.get("https://www.demoblaze.com/index.html");

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6")));
        WebElement link = driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
        WebElement sepeteEkle =driver.findElement(By.linkText("Add to cart"));
        sepeteEkle.click();

        wait.until(ExpectedConditions.alertIsPresent());// alert gözükene kadar bekle
        driver.switchTo().alert().accept();

        WebElement anaSayfa = driver.findElement(By.id("nava"));
        anaSayfa.click();

        Assert.assertTrue("Ana sayfaya dönülemedi",
                driver.getCurrentUrl().equalsIgnoreCase("https://www.demoblaze.com/index.html"));

        BekleKapat();
    }
}
