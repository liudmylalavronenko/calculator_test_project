package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends BasePage {

    //Constructor
    public CalculatorPage(ChromeDriver chromeDriver) {
        super(chromeDriver);
        PageFactory.initElements(chromeDriver, this);
    }

    //Page Web Elements
    //number zero
    @FindBy(id = "btn96")
    private WebElement zero;

    //number one
    @FindBy(id = "btn97")
    private WebElement one;

    //number two
    @FindBy(id = "btn98")
    private WebElement two;

    //number three
    @FindBy(id = "btn99")
    private WebElement three;

    //number four
    @FindBy(id = "btn100")
    private WebElement four;

    //number five
    @FindBy(id = "btn101")
    private WebElement five;

    //number six
    @FindBy(id = "btn102")
    private WebElement six;

    //number seven
    @FindBy(id = "btn103")
    private WebElement seven;

    //number eight
    @FindBy(id = "btn104")
    private WebElement eight;

    //number nine
    @FindBy(id = "btn105")
    private WebElement nine;

    //operation "+"
    @FindBy(linkText = "+")
    private WebElement plus;

    //operation "-"
    @FindBy(id = "btn109")
    private WebElement minus;

    //operation "*"
    @FindBy(id = "btn106")
    private WebElement multiply;

    //operation "/"
    @FindBy(id = "btn111")
    private WebElement divide;

    //total "="
    @FindBy(id = "btn13")
    private WebElement total;

    //save button
    @FindBy(xpath = "//div[2]/div[3]/img") //maybe possible to replace xpath CHECK
    private WebElement save;

    //delete button
    @FindBy(xpath = "//div[4]/img")
    private WebElement delete;

    //clear button
    @FindBy(id = "btn27")
    private WebElement clear;

    //Page Methods

    //Open CalculatorPage
    public void go_to_calc_page(){
        String calculatorURL = "http://www.calculatoria.com";
        chromeDriver.get(calculatorURL);
        System.out.println("Page is opened: " + calculatorURL);
    }

    //Click a number
    public void enter_number(int number) {
         switch (number){
            case 0: zero.click();
                break;
            case 1: one.click();
                break;
            case 2: two.click();
                break;
            case 3: three.click();
                break;
            case 4: four.click();
                break;
            case 5: five.click();
                break;
            case 6: six.click();
                break;
            case 7: seven.click();
                break;
            case 8: eight.click();
                break;
            case 9: nine.click();
                break;
        }
    }

    //Choose an action (click)
    public void click_plus() {
        plus.click();
    }
    public void click_minus() {
        minus.click();
    }
    public void click_multiply() {
        multiply.click();
    }
    public void click_divide() {
        divide.click();
    }


    //Click on total button "="
    public void calculate() {
        total.click();
        System.out.println("Total button is clicked");
    }


    //Click "download" button
    public void download_file(){
        save.click();
        System.out.println("Result is downloaded to txt file");
    }
    //Click "delete" button
    public void delete_button(){
       delete.click();
       System.out.println("Result is deleted from board");
    }

    //Click "clear" button
    public void clear_button(){
        clear.click();
        System.out.println("Result is deleted from calculator");
    }

}
