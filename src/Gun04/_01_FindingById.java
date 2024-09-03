package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        //Senaryo:
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "ismet" yazdırınız
        // 3-  soyad kutucuğuna "temur" yazdırınız

        // id=first_8
        WebDriver tarayici =  new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu = tarayici.findElement(By.id("first_8")); // id si first_8 olan elementi bul
        isimKutusu.sendKeys("Aziz"); // WebElement e verilen yazıyı yaz
        MyFunc.Bekle(2);

        // soyismi yazınız
        WebElement soyIsimKutusu = tarayici.findElement(By.id("last_8")); // id si last_8 olan elementi bul
        soyIsimKutusu.sendKeys("Güneş"); // WebElement e verilen yazıyı yaz


        MyFunc.Bekle(5);
        tarayici.quit();
    }
}
