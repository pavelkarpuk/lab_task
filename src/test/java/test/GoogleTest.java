package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleHomePage;

public class GoogleTest extends BaseTest {

    @Test
    public void googleOpenTest() {
        String expectedURL = "https://www.google.com/";
        String actualURL = new GoogleHomePage(driver).
                openPage().
                getURL();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
