package test.pages;

import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;


public class LocatorsMainPage {
    //button "yes, everyone is used to it"-accepting cookies
    protected By cookies = By.id("rcc-confirm-button");

    //button "Order"
    protected By orderButton =  By.xpath("//div[contains(@class, 'Header')]//button[text() = 'Заказать']");
    //logo "Scooter"
    protected By logoScooter = By.xpath("//a[contains(@class, 'Header_LogoScooter')]");
    //logo "Yandex"
    protected By logoYandex = By.xpath("//a[contains(@class, 'Header_LogoYandex')]");

    //button "Order status"
    protected By orderStatus= By.xpath("//div[contains(@class, 'Header')]//button[text() = 'Статус заказа']");
    //text field for entering the order number
    protected By numberOrder = By.xpath("//input[@placeholder='Введите номер заказа']");
    //button "Go!"
    protected By buttonGo = By.xpath("//div[contains(@class, 'Header')]//button[text() = 'Go!']");

    //buttons arrows
    protected List<By> arrows = new ArrayList<>();
    //the text that appears after clicking the arrows
    protected List<By> arrowsText = new ArrayList<>();

    protected void findArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrows.add(By.xpath("//div[@id=\"accordion__heading-"+i+"\"]"));
        }
    }

    protected void findTextArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrowsText.add(By.xpath("//div[@id=\"accordion__panel-"+i+"\"]"));
        }

    }


}
