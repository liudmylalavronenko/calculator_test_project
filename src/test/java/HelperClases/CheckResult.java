package HelperClases;

import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckResult {

    //Variables
    private int result_PC; //need as var to compare results which check in culc and here

    private String line_from_file;
    private String pc_line;

    // read downloaded file, check if calc result the same as PC result
    public void compare_PC_and_calc_results(int first, int second, String operation, String path_to_file) throws IOException {
        do_operation(first,second,operation);
        read_file(path_to_file);
        compare_results();
    }


    //PC result of operation with digits
   private void do_operation(int first, int second, String operation){
       switch (operation) {
           case "+":  result_PC = first + second;
               break;
           case "-":  result_PC = first - second;
               break;
           case "*":  result_PC = first * second;
               break;
           case "/":  result_PC = first / second;
               break;
       }
      pc_line = first + operation + second + "=" + result_PC;
   }
    //read file and save line to string
    private void read_file(String path_to_file) throws FileNotFoundException {
        File file = new File(path_to_file);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            line_from_file = sc.nextLine();
//            System.out.println("There is next line in the file: " + line_from_file);
        }
    }

    //compare PC and calc results
    private void compare_results() {
        Assertions.assertEquals(pc_line, line_from_file, "Entered and calculated data is the NOT the same as " +
               "expected - " + pc_line + ": incorrect - " + line_from_file);
        System.out.println("Entered and calculated data is the same as expected - " + pc_line + " : " + line_from_file);
    }
}
