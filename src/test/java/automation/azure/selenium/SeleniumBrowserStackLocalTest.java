package automation.azure.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBrowserStackLocalTest extends SeleniumBrowserStackRemoteTest {

    @Test
    public void test() throws Exception {
        driver.get("http://bs-local.com:45691/check");
        Assert.assertTrue(driver.getPageSource().contains("Up and running"));
    }
}
