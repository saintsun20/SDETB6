package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        Robot rbt = new Robot();

        for (int i = 1; i <=14 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

        // Stringi hafızaya kopyalama yöntemi
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\Gunes\\Desktop\\DJI_Mini_4_Pro_User_Manual_TR.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        //Ctrl+C, panoya gitti, panoya kopyalandı

        // Ctrl+V dosya yolunu yapıştırma işlemi
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        } // Check box a geldim

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        } // Submit butonuna geldim

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER); // Submit butonuna bastım

        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(msg.isDisplayed()); // assert

        MyFunc.Bekle(5);

        BekleKapat();
    }
}

