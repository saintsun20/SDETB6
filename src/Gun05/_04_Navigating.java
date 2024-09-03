package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {
    public static void main(String[] args) {
        //driver.get("https://testpages.herokuapp.com/styled/index.html"); // siteye git,aç
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // siteye git,aç
        System.out.println("driver.getTitle = " + driver.getTitle()); // Şu andaki Title
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl()); // Şu andaki url, adres
        MyFunc.Bekle(2);

        WebElement link = driver.findElement(By.id("alerttest"));
        link.click(); // yeni sayfaya gidildi
        System.out.println("driver.getTitle = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().back(); // Önceki sayfaya dön, tarayıcıda geriye basılmış gibi
        System.out.println("driver.getTitle = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().forward(); // tarayıcıda ileri sayfaya git
        System.out.println("driver.getTitle = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        BekleKapat();
    }
}
