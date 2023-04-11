package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class PageTrack extends LocatorsPageTrack {
    private final WebDriver driver;
    final String host="https://qa-scooter.praktikum-services.ru/";


    public PageTrack(WebDriver driver) {
        this.driver = driver;
        driver.get(host);
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }
    public void getNoOrder()
    {
        WebElement img = driver.findElement(noOrder);
        assertTrue(img.isEnabled());
    }
}
