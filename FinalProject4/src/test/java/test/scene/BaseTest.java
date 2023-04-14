package test.scene;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

  protected final String host = "https://qa-scooter.praktikum-services.ru/";

  protected WebDriver driver;

  @BeforeClass
  public static void setUpSystemProperties() {
    // достаточно задать это свойство один раз перед всеми тестами
    // при этом убеждаемся, что драйвер лежит в ресурсах или выходим с ошибкой
    try {
      System.setProperty(
          "webdriver.chrome.driver",
          BaseTest.class.getClassLoader().getResource("chromedriver").getPath()
      );
    } catch (NullPointerException e) {
      System.err.println("Не найден chromedriver в папке resources");
      System.exit(1);
    }

  }

  @Before
  public void setUpDriver() {
    driver = new ChromeDriver();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

}
