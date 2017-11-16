package calculator;

import java.util.Scanner;
import calcActions.Additional;
import calcActions.Subtraction;
import calcActions.Multiplication;
import calcActions.Division;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.util.Arrays;

public class CalcInit {
    public void calcRun() {
        String action = dataInputing();
        actionHandler(action);
    }
    
    private static void actionHandler(String actionNum) {
        Scanner scanner = new Scanner(System.in);
        
        if(actionNum.equals("5")) {
            System.out.println("By!");
        } else if (actionNum.equals("4")) {
            System.out.println("Enter numbers through space");
            String numsAmount = scanner.next();
            
        }
    }
    
    /**
     * 
     * @returns number of action
     */
    private static String dataInputing() {
        Scanner scanner = new Scanner(System.in);
        String action = "";
        
        System.out.println("Choose one of next actions:");
        System.out.println("1 - multiply; 2 - substraction; 3 - division; 4 - additional; 5 - exit;");
        
        boolean rightAction = false;

        while (!rightAction) {
            action = scanner.next();
            
            if(checkAction(action)) {
                rightAction = true;
            } else {
                System.out.println("That's incorrect action! Please try again.");
            }
        }
        
        return action;
    }
    
    /**
     * 
     * @param actionNum - number of action
     * @return boolean, if number of action is correctness - true, if its not - false
     */
    private static boolean checkAction(String actionNum) {
        String[] actions = {"1", "2", "3", "4", "5"};
        boolean result = false;
        
        if (Arrays.asList(actions).contains(actionNum)) {
            result = true;
        }
        
        return result;
    }
    
    
}
