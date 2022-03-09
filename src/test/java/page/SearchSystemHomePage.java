package page;

import org.openqa.selenium.WebDriver;

public class SearchSystemHomePage extends AbstractPage {

    public SearchSystemHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SearchSystemHomePage openPage() {
        driver.get(provider.getProperty("testdata.searchsystem.url", String.class));
        return this;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
