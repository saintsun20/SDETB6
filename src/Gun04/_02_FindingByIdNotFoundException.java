package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {
            WebElement isimKutusu = driver.findElement(By.id("Hatalı Locator"));
        }
        catch (Exception ex) {
            System.out.println("Bu Locator da bir element bulunamadı" + ex.getMessage());
        }

        MyFunc.Bekle(5);
        driver.quit();
    }
}
