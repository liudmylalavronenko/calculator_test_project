package Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    //Create a Chrome driver
    static ChromeDriver chromeDriver;

    //pre-conditions to all tests
    @BeforeAll
    static void before_all_test() {
        System.setProperty("webdriver.chrome.driver", "F:\\Programs\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        //Maximize Window
        chromeDriver.manage().window().maximize();
    }

    //post-conditions for all tests
    @AfterAll
    static void after_all_test () {
        chromeDriver.quit();
    }
}
