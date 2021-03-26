package usta.fis;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int v_total_numbers=0;
	p_show_info_program();
	Scanner keyboard = new Scanner(System.in);

	System.out.println("please enter the first number");
	int v_number_one= keyboard.nextInt();
	System.out.println("please enter the the second number");
	int v_number_two= keyboard.nextInt();
	System.out.println("please write 1 to add 2 to subtract 3 to multiply and four to divide");
    int v_operation= keyboard.nextInt();
    p_operate_numbers(v_number_one,v_number_two,v_operation,v_total_numbers);
    }

    public static void p_operate_numbers( int v_number_one, int v_number_two, int V_operation, int V_total_numbers);
       Scanner keyboard = new Scanner(System.in);
    switch (v_operation){
        case 1 -> V_total_number = v_number_one + v_number_two;
        case 2 -> V_total_number = v_number_one - v_number_two;
        case 3 -> V_total_number = v_number_one * v_number_two;
        case 4 -> V_total_number = v_number_one / v_number_two;
        {
            while (v_number_two == 0) {
                System.err.println("Err the number entered are incorrect please type it again");
                v_number_two = keyboard.nextInt();
            }
            default -> System.err.println("Err please, insert again the number");
        }
        System.out.println("the result is: "+V_total_number+".");
        }




    }
}

