package page;

import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends AbstractPage {

    private final static String HOMEPAGE_URL = "https://www.google.com/";

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
