package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by karolubu on 03.03.16.
 */


public class TimeWait {



    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }



    WebDriver driver = new FirefoxDriver();

    @Test(priority = 2)
    public void testMethodOne() {
        Assert.assertTrue(true);
    }

    @Test(priority = 10)
    public void startWebdriver() {
        driver.get("http://www.google.pl");

    }
    @Test(priority = 15)
    public void zelent() {


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://miroslawzelent.pl");
  WebElement logo = driver.findElement(By.xpath("//img[@class='the-logo']"));
        driver.close();

        String rnd = randomString(6);
        System.out.println("XXXXXXXXXXX  "+rnd+"  XXXXXXXXXXXXXXXXXXXXXX");
    }



}
