package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.wait;

public class _02_IFrame_Ornek extends BaseDriver {

    @Test
    public void Test1()
    {
        // Bu sayfada frame locatorları sorunlu sayfa selenium ile çözülemedi.
        driver.get("https://demo.automationtesting.in/Frames.html");

        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size() >0)
            consent.get(0).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Iframe with in an Iframe")));
        WebElement btnNestedFrame=driver.findElement(By.linkText("Iframe with in an Iframe"));
        btnNestedFrame.click();

        driver.switchTo().frame(0); // Nasted frame   dışardaki frame
        MyFunc.Bekle(6);
        driver.switchTo().frame(0); // Iframe Demo ya  içerdeki frame

        WebElement txtBox=driver.findElement(By.xpath("//input[@type='text']"));
        txtBox.sendKeys("Merhaba");


        BekleKapat();
    }


}
