package Gun14;

/*

 */
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _01_RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {

        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        Robot robot = new Robot();

        driver.switchTo().window(driver.getWindowHandle()); // MAC ler için

        //Yeni pencere açma işlemi Ctrl+T
        robot.keyPress(KeyEvent.VK_CONTROL); // ctrl bas, şu an artık basılı durumda
        robot.keyPress((KeyEvent.VK_T)); // ctrl basılı idi, T harfine bastım
        robot.keyRelease(KeyEvent.VK_T); // T tuşunu bırak
        robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL tuşunu bırak
        MyFunc.Bekle(2);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // şu an hala 1. sayfada

        Set<String> idler = driver.getWindowHandles();
        Iterator gosterge = idler.iterator();
        String birinciPencereID = gosterge.next().toString();
        String ikinciPencereID = gosterge.next().toString();

        driver.switchTo().window(ikinciPencereID); // 2. pencereye yani taba geçtim.
        MyFunc.Bekle(2);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.get("https://www.facebook.com");

        BekleKapat();
    }


}
