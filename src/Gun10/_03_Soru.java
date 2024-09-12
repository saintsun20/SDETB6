package Gun10;

//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.mediamarkt.com.tr/");
        Actions aksiyonlar = new Actions(driver);

        WebElement tumKategoriler = driver.findElement(By.id("mms-app-header-category-button"));
        aksiyonlar.click(tumKategoriler).build().perform();
        MyFunc.Bekle(2);

        WebElement beyazEsya = driver.findElement(By.id("category-197"));
        aksiyonlar.moveToElement(beyazEsya).build().perform();
        MyFunc.Bekle(2);

        WebElement kombiler = driver.findElement(By.xpath("(//*[@id='Kombiler']//ul/a)[1]"));
        aksiyonlar.click(kombiler).build().perform();
        MyFunc.Bekle(2);

        Assert.assertTrue("URL de kombi kelimesi bulunamadı", driver.getCurrentUrl().contains("kombi"));

        BekleKapat();
    }
}
