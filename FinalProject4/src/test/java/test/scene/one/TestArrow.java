package test.scene.one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pages.MainPageScooter;
import test.scene.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArrow extends BaseTest {
    private MainPageScooter mainPageScooter;

    @Before
    public void setUp()
    {
        mainPageScooter = new MainPageScooter(driver);
        // открываем страницу перед каждым тестом здесь
        driver.get(host);
    }

    @Test
    public void testClickArrowGetText() {
        mainPageScooter.acceptCookies();
        for (int i =0; i<8;i++)
        {
            mainPageScooter.getArrow(i);
            mainPageScooter.getTextElement(i);
            assertTrue(mainPageScooter.getTextElement(i).isEnabled());
        }
    }

}
