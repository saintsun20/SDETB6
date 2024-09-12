package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_DragAndDropBy extends BaseDriver {

    @Test
    public void Test1(){

        //  //div[@id='slider-range']//span[1]
        //  (//*[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]
        //  [id='slider-rang']> :nth-child(3)

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));

        // dragAndDropBy(WebElement,X , Y) x: yatay yönde, y: dikey yönde
        // + değer girdiğimizde sağa doğru, - değer girdiğimizde sola doğru kaydırıyor
        Action aksiyon = aksiyonlar.dragAndDropBy(solSurgu, 100,0).build();
        aksiyon.perform();

        BekleKapat();
        //TODO : sol sürgüyü $200 noktasına, sağ sürgüyü $400 kaydırınız.
        // Not bir WebElementin genişliğini nasıl alırsın? int genislik = cubuk.getSize().width
    }
}
