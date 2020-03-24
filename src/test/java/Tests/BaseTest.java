package Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BaseTest {

    //Create a Chrome driver
    static ChromeDriver chromeDriver;

    //pre-conditions to all tests
    @BeforeAll
    static void before_all_test() {
        System.setProperty("webdriver.chrome.driver", "PATH\\chromedriver.exe"); //put your path to chromedriver
        chromeDriver = new ChromeDriver();
        //Maximize Window
        //chromeDriver.manage().window().maximize();
    }

    //post-conditions for all tests
    @AfterAll
    static void after_all_test () {
        chromeDriver.quit();
    }

}
