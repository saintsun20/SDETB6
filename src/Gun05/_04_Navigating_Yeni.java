package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;

public class _04_Navigating_Yeni extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // siteye git,aç
        MyFunc.Bekle(2);

        WebElement link = driver.findElement(By.id("alerttest"));
        link.click();
        MyFunc.Bekle(2);

        driver.navigate().back();
        MyFunc.Bekle(2);

        driver.navigate().forward();

//        if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"))
//            System.out.println("Test Passed");
//        else
//            System.out.println("Test Fail");

        Assert.assertTrue("Beklenen sayfaya ulaşılamadı",driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"));
        //Ben true bekliyorum, değilse göster, yoksa test passed

        BekleKapat();
    }
}
