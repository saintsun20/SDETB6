package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

//        Test Senaryosu
//        1- https://www.ebay.co.uk/  sayfasına gidiniz
//        2- Kategorilerden Baby seçeneğini seçiniz.
//        3- Arama butonuna tıklatınız.
//        4- Sonuçları çıktığı ekranda sol başlık
//            kısmında Baby kelimesinin geçtiğini doğrulayınız

    @Test
    public void Tast1(){

        driver.get("https://www.ebay.co.uk/");

        WebElement webSelect = driver.findElement(By.id("gh-cat"));
        Select javaSelect = new Select(webSelect);
        javaSelect.selectByValue("2984");
        MyFunc.Bekle(2);


        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();
        MyFunc.Bekle(2);


        WebElement headerText = driver.findElement(By.className("b-pageheader__text"));

        Assert.assertTrue("Aranılan kelime bulunamadı", headerText.getText().contains("Baby"));

        BekleKapat();
    }
}
