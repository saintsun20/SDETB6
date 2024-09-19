package Gun12;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_Soru extends BaseDriver {

//    Senaryo:
//    https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html
//    Sayfasına gidiniz.
//    1-Sayfada PlaceHolder yazısını elementin gettextinden yazdırınız
//    2-Ekrandaki checkBox çekleyiniz.
//    3-Sayfadaki First row yazısını elementtin Gettext i ile yazdırınız
//    4-Sayfadaki IFrame Above  yazısını elementin Gettext i ile yazdırınız


    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        WebElement anaSayfaLbl = driver.findElement(By.xpath("//div[text()='Placeholder']"));
        System.out.println("anaSayfaLbl.getText() = " + anaSayfaLbl.getText());

        WebElement Iframe = driver.findElement(By.xpath("//iframe"));
        new Actions(driver).scrollToElement(Iframe).build().perform();

        driver.switchTo().frame("nested_scrolling_frame");
        WebElement chkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        chkBox.click();

        WebElement iFrameLbl1 = driver.findElement(By.xpath("//*[text()='First row']"));
        System.out.println("iFrameLbl1.getText() = " + iFrameLbl1.getText());

        driver.switchTo().defaultContent();

        WebElement footerText = driver.findElement(By.xpath("//footer[text()='IFrame Above']")); // By.tagname("footer")
        System.out.println("footerText.getText() = " + footerText.getText());

        Assert.assertTrue("Beklenen mesaj bulunamadı", footerText.getText().equals("IFrame Above"));

        BekleKapat();

    }




}
