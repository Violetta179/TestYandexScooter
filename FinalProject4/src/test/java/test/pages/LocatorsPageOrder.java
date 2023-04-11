package test.pages;

import org.openqa.selenium.By;


public class LocatorsPageOrder extends LocatorsMainPage {
    //text field "Name"- enter for name
    protected By inputName = By.xpath("//input[@placeholder='* Имя']");

    //checking for getting the correct name
    protected By errorName = By.xpath("//div[text()='Введите корректное имя']");
    //text field "Surname"-enter for surname
    protected By inputSurname = By.xpath("//input[@placeholder='* Фамилия']");
    //checking for getting the correct name
    protected By errorSurname = By.xpath("//div[text()='Введите корректную фамилию']");
    //text field "Address"-enter for address
    protected By inputAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //checking for getting the correct address
    protected By errorAddress = By.xpath("//div[text()='Введите корректный адрес']");
    //select "Metro Station"
    protected By inputMetro = By.xpath("//input[@placeholder='* Станция метро']");
    //checking for getting the correct station metro
    protected By errorMetro = By.xpath("//div[text()='Выберите станцию']");
    //text field "Number Phone"
    protected By inputPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //checking for getting the correct number phone
    protected By errorPhone = By.xpath("//div[text()='Введите корректный номер']");
    //button "Next"
    protected By buttonNext = By.xpath("//div[contains(@class, 'Order')]//button[text() = 'Далее']");
    //text field "Arrival Date"
    protected By inputArrival = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //checking for getting the correct arrival date
    protected By errorArrival = By.xpath("//div[text()='Введите корректную дату']");
    //select "Rental period"
    protected By inputFieldPeriod = By.xpath("//div[text() = '* Срок аренды']");
    //choose "Rental period"
    protected By inputChoosePeriod = By.xpath("//div[text() = 'сутки']");
    //checking for getting the correct period
    protected By errorPeriod = By.xpath("//div[text()='Введите корректный срок']");
    //label color scooter "black pearl"
    protected By inputColor = By.id("black");
    //message about choose color
    protected By errorColor = By.xpath("//div[text()='Выберите цвет']");
    //text field "comment courier"
    protected By inputComment = By.xpath("//input[@placeholder='Комментарий для курьера']");

    //button for the final order: "Order"
    protected By buttonFinalOrder = By.xpath("//div[contains(@class, 'Order')]//button[text() = 'Заказать']");
    //button "Yes"
    protected By buttonYes = By.xpath("//div[contains(@class, 'Order')]//button[text() = 'Да']");
    //message "the order has been placed"
    protected By message = By.xpath("//div[text()='Заказ оформлен']");


}
