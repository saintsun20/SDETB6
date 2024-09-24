package WaitODev;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_Heroku extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();

        WebElement deleteButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));

        Assert.assertTrue("Delete butonu görünür değil!",deleteButton.isDisplayed());

        deleteButton.click();

        Assert.assertTrue("Delete butonu hala görünüyor!", wait.until(ExpectedConditions.invisibilityOf(deleteButton)));

        BekleKapat();
    }
}
