package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(xpath = "//body/div[1]/button") //maybe possible to replace xpath CHECK
    private WebElement cookie_button;

    //Webdriver
    protected ChromeDriver chromeDriver;

     //Constructor
    BasePage(ChromeDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }
    //checking if page correct
    public void check_if_correctPage(String checkWhatPage, String ShowIfIncorrectPage) {
        Assertions.assertEquals(checkWhatPage, chromeDriver.getTitle(), ShowIfIncorrectPage); //check if correct page
        System.out.println("Opened page is correct");
    }

    //Click "Accept" button for cookie
    public void cookie_accept(){
        if(cookie_button.isDisplayed()){
            cookie_button.click();
            System.out.println("Cookie is accepted");
        }
    }

}
