package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru extends BaseDriver {

//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
//        Assert.assertTrue(urunFiyatToplamlam == itemTotal)

    @Test
    public void Test1() {
        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(1);

        WebElement kullAdı = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
        kullAdı.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        sifre.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        giris.click();
        MyFunc.Bekle(2);

        // 1.Ürün Sepete Eklendi
        WebElement sclnUrun1 = driver.findElement(By.xpath("//*[@id='item_4_title_link']"));
        sclnUrun1.click();
        MyFunc.Bekle(2);

        WebElement urunEkle1 = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        urunEkle1.click();
        MyFunc.Bekle(2);

        WebElement geri1 = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        geri1.click();
        MyFunc.Bekle(2);

        // 2.Ürün Sepete Eklendi
        WebElement sclnUrun2 = driver.findElement(By.xpath("//*[@id='item_1_title_link']"));
        sclnUrun2.click();
        MyFunc.Bekle(2);

        //her sayfanın elemanı locator ı aynı olsa bile farklı elemandır ve yeniden bulunmalıdır
        WebElement urunEkle2 = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        urunEkle2.click();
        MyFunc.Bekle(2);

        WebElement sepet = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
        sepet.click();
        MyFunc.Bekle(2);

        WebElement cikis = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']"));
        cikis.click();
        MyFunc.Bekle(2);

        //Kullanıcı bilgileri giriliyor
        WebElement ad = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
        ad.sendKeys("Aziz");
        MyFunc.Bekle(2);

        WebElement soyad = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        soyad.sendKeys("Güneş");
        MyFunc.Bekle(2);

        WebElement postaKod = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
        postaKod.sendKeys("09430");
        MyFunc.Bekle(2);

        WebElement devam = driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
        devam.click();
        MyFunc.Bekle(2);

        // Ürünlerin ücret toplamlarının kontrolü
        List<WebElement> ucretler = driver.findElements(By.xpath("//div[@class='inventory_item_price'"));

        double toplam=0;
        for (WebElement u: ucretler)
        {
            System.out.println(u.getText());
            System.out.println(u.getText().replaceAll("[^0-9,.]","")); // replace("$","");

            toplam = toplam + Double.parseDouble(u.getText().replaceAll("[^0-9,.]",""));
        }

        // alt toplamı double olarak bulalım
        WebElement altToplamElement = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double altToplam = Double.parseDouble((altToplamElement.getText().replaceAll("[^0-9,.]","")));
        System.out.println("altToplam = " + altToplam);

        Assert.assertTrue("Toplamlar Eşit Değil", toplam == altToplam);
    }
}

