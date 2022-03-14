package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {

    private WebDriver driver;
    private final String URL = "http://192.168.0.104:4444";

    @BeforeMethod
    public void browserSetup() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL(URL), new ChromeOptions());
    }

    @Test
    public void googleOpenTest() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
