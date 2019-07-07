package edu.epam.line_programs.task3;

//  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//  (((sin(x) + cos(y)) / (cos(x) - sin(y))) * (tan(x * y)))

import java.util.InputMismatchException;
import java.util.Scanner;

public class EqualValue {

        public static void main(String[] args) {

            double equalVal;
            double[] param = new double[2];
            char[] value = {'X', 'Y'};

            Scanner input = new Scanner(System.in);

            try {

                for (int counter = 0; counter < param.length; counter ++) {

                    System.out.println("For equation \"value = (((sin(x) + cos(y)) / (cos(x) - sin(y))) * (tan(x * y)))\", " +
                            "please, enter numeral value " + value[counter] + ": ");
                    param[counter] = input.nextDouble();
                }

                equalVal = (((Math.sin(param[0]) + Math.cos(param[1])) /
                        (Math.cos(param[0]) - Math.sin(param[1]))) *
                        (Math.tan(param[0] * param[1])));

                System.out.println("Function value is " + equalVal);

            } catch (InputMismatchException e) {

                System.out.println("Genius, enter NUMERAL value! Try again.");

            } catch (ArithmeticException e2) {

                System.out.println("Divide by zero detected. Awfully!");
            }
        }
}
