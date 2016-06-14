package pack2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NgWebTest {
    WebDriver driver = new FirefoxDriver();

    @Test(priority = 0)
    public void startWebdriver() {
        driver.get("http://www.google.pl");
        driver.close();
    }

//
//    @Test (priority = 4)
//    public void verifyTitle(){
//     String epxTitle = "Google";
//       Assert.assertEquals(epxTitle,driver.getTitle());
//
//    }

    @Test(priority = 2)
    public void testMethodOne() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void testMethodTwo() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"testMethodTwo"})
    public void testMethodThree() {
        Assert.assertTrue(true);
    }


}
