package Steps;

import Pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorSteps extends CalculatorPage{

private CalculatorPage calculatorPage = new CalculatorPage(chromeDriver);

    public CalculatorSteps(ChromeDriver chromeDriver) {
        super(chromeDriver);
    }

    //check if correct number and click corresponding button
    public void enter_number(int number) {
        if_number_less_than_0(number);
        if_more_than_1_digits(number);
        System.out.println("Number is clicked: " + number);
    }

    //check if correct operation and click corresponding button
    public void enter_operation(String operation) {
        check_operation(operation);
        System.out.println("Operation is entered: " + operation);

    }

    //clear data from calc page
    public void clear_calc_page() {
        delete_button();
        clear_button();
        System.out.println("Data is cleared from bord");

    }

    //check how much digits in number
    private void if_more_than_1_digits(int number) {
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            int digit = Integer.parseInt(Integer.toString(number).substring(i, i + 1));
            calculatorPage.enter_number(digit);
        }
    }

    //check if number correct - not less than 0
    private void if_number_less_than_0(int number){
    Assertions.assertFalse(number < 0,"Number is incorrect or less than null: " + number);
    }

//    check if operation is correct: + - * /
    private void check_operation(String operation) {
        switch (operation) {
            case "+":
                calculatorPage.click_plus();
                break;
            case "-":
                calculatorPage.click_minus();
                break;
            case "*":
                calculatorPage.click_multiply();
                break;
            case "/":
                calculatorPage.click_divide();
                break;
            default:
                Assertions.assertEquals(1, 0, "Clicked button is not the next: +, -, *, /. Entered data: "
                        + operation); //I know, it's bad idea, but I don't know how to check if only + - * /. I'd tried via regex, but it didn't work
                break;
        }
    }
}
