package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement btnClick = driver.findElement(By.xpath("// button[text()='Click Me']"));
        // btnClick.click();

        // 1.Yöntem
        Actions aksiyonlar=new Actions(driver); // web sayfası aksiyonlara açıldı.

        Action aksiyon=aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerine click için git orda bekle.aksiyonu HAZIRLA.

        MyFunc.Bekle(2);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.

        // Kısa Hali
        //aksiyonlar.moveToElement(btnClick).click().build().perform();

        // Daha Kısa Hali
        //new Actions(driver).moveToElement(btnClick).click().build().perform();

        // En Kısa Hali
        //new Actions(driver).click(btnClick).build().perform();

        BekleKapat();
    }
}
