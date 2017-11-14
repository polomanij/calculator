package calculator;

import calcActions.Additional;
import calcActions.Subtraction;
import calcActions.Multiplication;
import calcActions.Division;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Additional.add(1, 3, 3, 5));
        System.out.println(Subtraction.sub(10, 1, 2));
        System.out.println(Multiplication.multiply(2, 2));
        System.out.println(Division.div(10, 2, 2));
    }
}
