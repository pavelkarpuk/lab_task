package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SearchSystemHomePage;

public class SearchSystemTest extends BaseTest {

    @Test
    public void searchSystemOpenTest() {

        String expectedURL = provider.getProperty("testdata.searchsystem.url", String.class);
        String actualURL = new SearchSystemHomePage(driver)
                .openPage()
                .getURL();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
