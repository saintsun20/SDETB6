package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz

    @Test
    public void Test1(){

        driver.get("https://www.facebook.com/");
        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Yeni hesap oluştur']"));
        createNewAccount.click();
        MyFunc.Bekle(2);

        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.click();
        name.sendKeys("Aziz");
        MyFunc.Bekle(2);

        WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
        surname.click();
        surname.sendKeys("GÜNEŞ");
        MyFunc.Bekle(2);

        WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mail.click();
        mail.sendKeys("abcde123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.click();
        password.sendKeys("Abcd1231.");
        MyFunc.Bekle(2);

        WebElement gun = driver.findElement(By.id("day"));
        gun.click();
        Select secilenGun = new Select(gun);
        secilenGun.selectByValue("22");
        MyFunc.Bekle(2);

        WebElement ay = driver.findElement(By.id("month"));
        ay.click();
        Select secilenAy = new Select(ay);
        secilenAy.selectByValue("11");
        MyFunc.Bekle(2);

        WebElement yil = driver.findElement(By.id("year"));
        yil.click();
        Select secilenYil = new Select(yil);
        secilenYil.selectByValue("1982");
        MyFunc.Bekle(2);

        WebElement cinsiyet = driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
        cinsiyet.click();
        MyFunc.Bekle(2);

        WebElement kaydol = driver.findElement(By.xpath("//button[@name='websubmit']"));
        kaydol.click();
        MyFunc.Bekle(2);





    }

}
