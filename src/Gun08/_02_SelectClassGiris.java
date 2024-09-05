package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.amazon.com.tr/");
        MyFunc.Bekle(2);

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // bu element eğer SELECT tag ile başlayan web elementi ise
        // bu Select nesnesine CAST yap ve öyle kullan

        // elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürdü.
        Select javaSelect = new Select(webMenu); // web deki select, SeleniumJava daki Select e CAST ediliyor

        javaSelect.selectByIndex(4); // ister bu şekilde seçebilirsin   : indexle
        MyFunc.Bekle(2);
        javaSelect.selectByValue("search-alias=electronics"); // ister bu şekilde seçebilirsin  : value ile
        MyFunc.Bekle(2);
        javaSelect.selectByVisibleText("Evcil Hayvan Malzemeleri"); // ister bu şekilde seçebilirsin  :  görünen string ile
        MyFunc.Bekle(2);

        System.out.println("javaSelect.getOptions().size() = " + javaSelect.getOptions().size());

        for (WebElement secenek: javaSelect.getOptions())
            System.out.println("secenek.getText() = " + secenek.getText());

        BekleKapat();
    }
}
