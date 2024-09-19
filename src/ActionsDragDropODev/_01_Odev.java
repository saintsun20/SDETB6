package ActionsDragDropODev;

//          http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//          buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile
//          bütün şehirleri doğru ülkere dağıtınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Odev extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions aksiyonlar = new Actions(driver);
        MyFunc.Bekle(2);

        WebElement oslo=driver.findElement(By.xpath("//div[@id='a3']"));
        WebElement norway= driver.findElement(By.xpath("//div[@id='q1']"));

        aksiyonlar.dragAndDrop(oslo,norway).build().perform();
        //aksiyonlar.clickAndHold(oslo).build().perform(); // osloyu eline al
        //aksiyonlar.moveToElement(norway).release().build().perform(); // norway in üzerine git ve bırak

        MyFunc.Bekle(2);
    }

}
