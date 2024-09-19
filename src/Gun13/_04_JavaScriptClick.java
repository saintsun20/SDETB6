package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _04_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement takeTest = driver.findElement(By.xpath("//div[text()='Take Testing Quiz']"));
        //takeTest.click(); // sayfa önünden mouse click

        js.executeScript("arguments[0].click;", takeTest); // js click : sayfanın içinden click

        BekleKapat();

    }
}
