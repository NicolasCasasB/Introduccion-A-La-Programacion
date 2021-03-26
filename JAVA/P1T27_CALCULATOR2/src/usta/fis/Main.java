package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int operationToDo;
        int result;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the arimectic operation 1 to add, 2 to subtract, 3 to multiply, 4 to divide");
        operationToDo = keyboard.nextInt();
        System.out.println("Please type the first number:");
        numberOne = keyboard.nextInt();
        System.out.println("please type the second number:");
        numberTwo = keyboard.nextInt();
        result = operationCalc(numberOne, numberTwo, operationToDo);
        System.out.println("the result is: " + result);

    }

    public static int operationCalc(int number1, int number2, int operation) {

        if (operation == 1) {
            return number1 + number2;
        }
        if (operation == 2) {
            return number1 - number2;
        }
        if (operation == 3) {
            return number1 * number2;
        }
        if (operation == 4 && number2 != 0) {
            return number1 / number2;
        }
        if (operation == 5) {
             int primo=0;
            for (int i = 1; i <= number1 ; i++) {
                if (number1%i==0){
                    primo++;
                }
            }
            if(primo!=2){
                System.out.println("the number is not prime");
            }else {
                System.out.println("the number is prime");
            }
        }

        return 0;


    }
}