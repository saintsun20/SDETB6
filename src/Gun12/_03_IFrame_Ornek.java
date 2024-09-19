package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_IFrame_Ornek extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame(0);  // dışdaki frame in içine girildi
        driver.switchTo().frame(0);  // içerdeki frame geçildi.

        WebElement lblYazi=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println("lblYazi.getText() = " + lblYazi.getText());

        driver.switchTo().parentFrame();  // bir geri gelmiş olurum, dışardaki frame in içindeyim.
        System.out.println(driver.getPageSource()); // bulunduğum sayfanın html kodlarını yazdır

        driver.switchTo().parentFrame(); // anasayfaya gittim
        //driver.switchTo().defaultContent();// anayasayfaya gitmenin diğer yolu

        WebElement anaSayfaBaslik=driver.findElement(By.xpath("//h1[text()='Nested Frames']"));
        System.out.println("anaSayfaBaslik.getText() = " + anaSayfaBaslik.getText());

        BekleKapat();
    }

}
