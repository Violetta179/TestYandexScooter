package test.scene.additional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.pages.MainPageScooter;
import test.pages.PageOrder;
import test.pages.PageTrack;


public class TestLogoErrorNoOrder  {
    private WebDriver driver;
    private PageOrder pageOrder;
    private MainPageScooter mainPageScooter;
    private PageTrack pageTrack;
    final String urlScooter = "https://qa-scooter.praktikum-services.ru/";
    final String urlYandex = "https://dzen.ru/?yredirect=true";

    @Before
    public void Driver()
    {
        driver = new ChromeDriver();
        pageOrder = new PageOrder(driver);
        mainPageScooter = new MainPageScooter(driver);
        pageTrack = new PageTrack(driver);
    }

    @Test
    public void checkLogoScooterGetMainPage()
    {
        mainPageScooter.getLogoScooter();
        mainPageScooter.getTrueUrl(urlScooter);
    }

    @Test
    public void checkLogoYandexGetMainPageYandex()
    {
        mainPageScooter.getLogoYandex();
        mainPageScooter.getTrueUrl(urlYandex);
    }

    @Test
    public void checkFormOneErrorGetMessageError() { pageOrder.getMessageErrorFormOne();}

    @Test
    public void checkFormTwoErrorGetMessageError()
    {
        mainPageScooter.acceptCookies();
        pageOrder.getOrder();
        pageOrder.setName("Виолетта");
        pageOrder.setSurname("Вашина");
        pageOrder.setAddress("Кабяка");
        pageOrder.setMetro();
        pageOrder.setPhoneNumber("+375295873656");
        pageOrder.setNextButton();
        pageOrder.getMessageErrorFormTwo();
    }

    @Test
    public void checkStatusOrderGetNoOrder()
    {
        mainPageScooter.acceptCookies();
        mainPageScooter.clickOrderStatus();
        mainPageScooter.setNumberOrder();
        mainPageScooter.clickGo();
        pageTrack.getNoOrder();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
