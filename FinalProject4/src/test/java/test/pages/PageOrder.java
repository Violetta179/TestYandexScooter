package test.pages;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PageOrder extends LocatorsPageOrder {
    private final WebDriver driver;
    final String host="https://qa-scooter.praktikum-services.ru/";
    public PageOrder(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.get(host);
    }
    public void acceptCookies()
    {
        driver.findElement(cookies).click();
    }
    public void getOrder() {
         driver.findElement(orderButton).click();
    }
    public void setName(String name)
    {
        driver.findElement(inputName).sendKeys(name);
    }

    public void setSurname(String surname)
    {
        driver.findElement(inputSurname).sendKeys(surname);
    }

    public void setAddress(String address)
    {
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void setMetro()
    {
        driver.findElement(inputMetro).sendKeys(Keys.DOWN, Keys.ENTER);
    }

    public void setPhoneNumber(String numberPhone)
    {
        driver.findElement(inputPhone).sendKeys(numberPhone);
    }
    public void setNextButton()
    {
        driver.findElement(buttonNext).click();
    }
    public void setArrivalDate(String arrival)
    {
        driver.findElement(inputArrival).sendKeys(arrival+ Keys.ENTER);
    }

    public void setRentalPeriod()
    {
        driver.findElement(inputFieldPeriod).click();
        driver.findElement(inputChoosePeriod).click();
    }

    public void setScooterColor()
    {
        driver.findElement(inputColor).click();
    }

    public void setCommentCourier(String Comment)
    {
         driver.findElement(inputComment).sendKeys(Comment);
    }

    public void setFinalOrder()
    {
        driver.findElement(buttonFinalOrder).click();
    }

    public void clickYesButton()
    {
        driver.findElement(buttonYes).click();
    }
    public void orderVerification()
    {
        WebElement orderMessage = driver.findElement(message);
        String order = orderMessage.getText();
        String orderResult = "Заказ оформлен";
        MatcherAssert.assertThat(order,startsWith(orderResult));
    }
    public void getMessageErrorFormOne()
    {
        driver.findElement(orderButton).click();
        driver.findElement(buttonNext).click();
        assertTrue(driver.findElement(errorName).isDisplayed());
        assertTrue(driver.findElement(errorSurname).isDisplayed());
        assertTrue(driver.findElement(errorAddress).isDisplayed());
        assertTrue(driver.findElement(errorMetro).isDisplayed());
        assertTrue(driver.findElement(errorPhone).isDisplayed());
    }

    public void getMessageErrorFormTwo()
    {
        driver.findElement(buttonFinalOrder).click();
        assertTrue(driver.findElement(errorArrival).isDisplayed());
        assertTrue(driver.findElement(errorPeriod).isDisplayed());
        assertTrue(driver.findElement(errorColor).isDisplayed());
    }
}
