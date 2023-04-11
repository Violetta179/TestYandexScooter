package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;



public class MainPageScooter extends LocatorsMainPage {
    private final WebDriver driver;
    final String host="https://qa-scooter.praktikum-services.ru/";
    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
        driver.get(host);
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }
    public void acceptCookies()
    {
         driver.findElement(cookies).click();
    }
    public void getArrow(int i) {
        findArrows();
        driver.findElement(arrows.get(i)).click();
    }
    public WebElement getTextElement(int i)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        findTextArrows();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(arrowsText.get(i)));
    }
    public void getLogoScooter()
    {
        driver.findElement(logoScooter).click();
    }
    public void getTrueUrl(String url)
    {
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String getUrlScooter = driver.getCurrentUrl();
        assertEquals(url, getUrlScooter);
    }

    public void getLogoYandex()
    {
        driver.findElement(logoYandex).click();
    }


    public void clickOrderStatus()
    {
        WebElement Status = driver.findElement(orderStatus);
        Status.click();
    }

    public void setNumberOrder()
    {
        new  WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(numberOrder)).sendKeys("1111");
    }

    public void clickGo()
    {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(buttonGo)).click();
    }
}
