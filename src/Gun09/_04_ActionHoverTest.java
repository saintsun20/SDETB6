package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.hepsiburada.com/");

        Actions aksiyonlar=new Actions(driver);


        WebElement element= driver.findElement(By.xpath("//span[text()='Moda']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.


        // new Actions(driver).moveToElement(elemen).build().perform();

        BekleKapat();
    }
}
