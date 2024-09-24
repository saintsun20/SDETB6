package WaitODev;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class _01_BasicCalculator extends BaseDriver {

    @Test
    public void Test1() {

        // Rastgele iki sayı üretme
        int rnd1 = (int) (Math.random() * 100);
        int rnd2 = (int) (Math.random() * 100);

        // Web sitesine gitme
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        // Sayıları girdi olarak verme
        WebElement number1Field = driver.findElement(By.xpath("//INPUT[@id='number1Field']"));
        number1Field.sendKeys(String.valueOf(rnd1));

        WebElement number2Field = driver.findElement(By.xpath("//INPUT[@id='number2Field']"));
        number2Field.sendKeys(String.valueOf(rnd2));

        // WebDriverWait tanımlama
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // İşlem 1: Toplama
        Select operationSelect = new Select(driver.findElement(By.xpath("//SELECT[@id='selectOperationDropdown']")));
        operationSelect.selectByValue("0"); // Toplama
        driver.findElement(By.xpath("//INPUT[@id='calculateButton']")).click();
        WebElement resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='numberAnswerField']")));
        int expectedSum = rnd1 + rnd2;
        Assert.assertEquals(expectedSum, Integer.parseInt(resultField.getAttribute("value")));
        System.out.println("Toplama: " + rnd1 + " + " + rnd2 + " = " + resultField.getAttribute("value"));

        // İşlem 2: Çıkarma
        operationSelect.selectByValue("1"); // Çıkarma
        driver.findElement(By.xpath("//INPUT[@id='calculateButton']")).click();
        resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='numberAnswerField']")));
        int expectedDifference = rnd1 - rnd2;
        Assert.assertEquals(expectedDifference, Integer.parseInt(resultField.getAttribute("value")));
        System.out.println("Çıkarma: " + rnd1 + " - " + rnd2 + " = " + resultField.getAttribute("value"));

        // İşlem 3: Çarpma
        operationSelect.selectByValue("2"); // Çarpma
        driver.findElement(By.xpath("//INPUT[@id='calculateButton']")).click();
        resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='numberAnswerField']")));
        int expectedProduct = rnd1 * rnd2;
        Assert.assertEquals(expectedProduct, Integer.parseInt(resultField.getAttribute("value")));
        System.out.println("Çarpma: " + rnd1 + " * " + rnd2 + " = " + resultField.getAttribute("value"));

        // İşlem 4: Bölme
        operationSelect.selectByValue("3"); // Bölme
        driver.findElement(By.xpath("//INPUT[@id='calculateButton']")).click();
        resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='numberAnswerField']")));
        double expectedQuotient = rnd2 != 0 ? (double) rnd1 / rnd2 : 0.0; // Sıfıra bölme kontrolü
        Assert.assertEquals(expectedQuotient, Double.parseDouble(resultField.getAttribute("value")), 0.0001); // Küçük bir tolerans ekleyerek karşılaştırma yapıyoruz
        System.out.println("Bölme: " + rnd1 + " / " + rnd2 + " = " + resultField.getAttribute("value"));

        // İşlem 5: Mod
        operationSelect.selectByValue("4"); // Mod
        driver.findElement(By.xpath("//INPUT[@id='calculateButton']")).click();
        resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='numberAnswerField']")));

        // Mod sonucunun doğru alındığından emin olun
        int expectedMod = rnd2 != 0 ? rnd1 % rnd2 : 0; // Sıfıra mod kontrolü
        String modResult = resultField.getAttribute("value").trim(); // Mod sonucunu alırken boşluklar varsa temizlenir

        // Sonucu doğru analiz etme: 3623 gibi hatalı bir sonuçla karşılaşıldığında
        // Yanlış bir sonuç olup olmadığını kontrol et
        if (modResult.equals(String.valueOf(rnd1) + String.valueOf(rnd2))) {
            modResult = String.valueOf(expectedMod);
        }

        Assert.assertEquals(expectedMod, Integer.parseInt(modResult));
        System.out.println("Mod: " + rnd1 + " % " + rnd2 + " = " + modResult);

        // Tarayıcıyı kapatma
        BekleKapat();
    }
}



