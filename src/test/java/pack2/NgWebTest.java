package pack2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgWebTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test(priority = 2)
    public void testMethodOne() {
        Assert.assertTrue(true);
    }


    @Test(priority = 1)
    public void startWebdriver() {
        driver.get("http://www.google.pl");
    }


    @Test (priority = 4)
    public void verifyTitle(){
     String epxTitle = "Google";
       Assert.assertEquals(epxTitle,driver.getTitle());
    }











}
