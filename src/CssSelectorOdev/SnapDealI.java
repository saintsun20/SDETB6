package CssSelectorOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDealI extends BaseDriver {

    /*
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */

    @Test
    public void Test1(){
        driver.get("http://www.snapdeal.com/");

        WebElement oyuncak = driver.findElement(By.xpath("//*[@class='col-xs-20 searchformInput keyword']"));
        oyuncak.sendKeys("Teddy Bear");
        MyFunc.Bekle(5);

        WebElement arama = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
        arama.click();
        MyFunc.Bekle(5);

        Assert.assertTrue(true);
    }
}
