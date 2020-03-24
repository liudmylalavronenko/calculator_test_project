package Tests;

import HelperClases.CheckResult;
import Pages.CalculatorPage;
import Steps.CalculatorSteps;
import org.junit.jupiter.api.Test;

public class SimpleOperationsTest extends BaseTest{

    //Pages initialisations
    private CalculatorPage calculatorPage = new CalculatorPage(chromeDriver);
    private CalculatorSteps calculatorSteps = new CalculatorSteps(chromeDriver);
    private CheckResult checkResult = new CheckResult();


    @Test //check simple operations with two numbers
    public void check_calc_plus () throws Exception {
        calculatorPage.go_to_calc_page(); //navigate to calculator page
        calculatorPage.check_if_correctPage("Online scientific calculator with tape - CALCULATORIA.com","Page is wrong!!!");
        calculatorPage.cookie_accept(); //accept cookie
        calculatorSteps.enter_number(25); //enter first digit
        calculatorSteps.enter_operation("+"); //click an action button
        calculatorSteps.enter_number(3); //enter second digit
        calculatorPage.calculate(); //total result - click "="
        calculatorPage.download_file(); //download file to compare result                             ENTER BELOW - YOUR PATH TO FILE
        checkResult.compare_PC_and_calc_results(25, 3, "+", "PATH\\paska_kalkula.txt"); //Check if entered numbers, action and result are correct
        calculatorSteps.clear_calc_page();
    }

//    @Test //check simple operations with two numbers
//    public void check_calc_minus () throws Exception {
//        calculatorPage.go_to_calc_page(); //navigate to calculator page
//        calculatorPage.check_if_correctPage("Online scientific calculator with tape - CALCULATORIA.com","Page is wrong!!!");
//        calculatorPage.cookie_accept(); //accept cookie
//        calculatorSteps.enter_number(223); //enter first digit
//        calculatorSteps.enter_operation("-"); //click an action button
//        calculatorSteps.enter_number(52); //enter second digit
//        calculatorPage.calculate(); //total result - click "="
//        calculatorPage.download_file(); //download file to compare result
//        checkResult.compare_PC_and_calc_results(25, 3, "*"); //Check if entered numbers, action and result are correct
//    }
//
//    @Test //check simple operations with two numbers
//    public void check_calc_multiply () throws Exception {
//        calculatorPage.go_to_calc_page(); //navigate to calculator page
//        calculatorPage.check_if_correctPage("Online scientific calculator with tape - CALCULATORIA.com","Page is wrong!!!");
//        calculatorPage.cookie_accept(); //accept cookie
//        calculatorSteps.enter_number(25); //enter first digit
//        calculatorSteps.enter_operation("*"); //click an action button
//        calculatorSteps.enter_number(3); //enter second digit
//        calculatorPage.calculate(); //total result - click "="
//        calculatorPage.download_file(); //download file to compare result
//        checkResult.compare_PC_and_calc_results(25, 3, "*"); //Check if entered numbers, action and result are correct
//    }
//
//    @Test //check simple operations with two numbers
//    public void check_calc_divide () throws Exception {
//        calculatorPage.go_to_calc_page(); //navigate to calculator page
//        calculatorPage.check_if_correctPage("Online scientific calculator with tape - CALCULATORIA.com","Page is wrong!!!");
//        calculatorPage.cookie_accept(); //accept cookie
//        calculatorSteps.enter_number(40); //enter first digit
//        calculatorSteps.enter_operation("/"); //click an action button
//        calculatorSteps.enter_number(40); //enter second digit
//        calculatorPage.calculate(); //total result - click "="
//        calculatorPage.download_file(); //download file to compare result
//        checkResult.compare_PC_and_calc_results(25, 3, "*"); //Check if entered numbers, action and result are correct
//    }
}

