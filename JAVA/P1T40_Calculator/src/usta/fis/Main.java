package usta.fis;
//AUTHOR: Nicolas Casas Bello
//DATE: 15-04-2021
//DESCRIPTION: this software calculete the sum o o rest between two numbers

import java.util.Scanner;

public class Main {


	private static int V_number1;
	private static int V_number2;

	public static void main(String[] args) {
	int V_number1=0, V_number2=0, V_operation=0;
	Scanner keyboard =new Scanner(System.in);
	System.out.println("if you want addition, write the number 1");
	System.out.println("if you want subtraction, write the number 2");
	System.out.println("if you want multiplication, write the number 3");
	System.out.println("if you want division, write the number 4");
	V_operation = keyboard.nextInt();
	while (V_operation < 1 || V_operation > 4) {
		System.err.println("ERR: the options entered are not correct, please try again");
		V_operation = keyboard.nextInt();
	}
	if (V_operation == 1) {
		p_sum();
	}
	if (V_operation == 2){
		p_subtration();
	}
	if (V_operation == 3){
		p_multiplication();
	}
	if (V_operation == 4){
		p_division();
	}

    }

    public static void p_sum(){
		Scanner keyboard =new Scanner(System.in);
		System.out.print("enter the number 1");
				V_number1 = keyboard.nextInt();
		System.out.print("enter the number 2");
		        V_number2 = keyboard.nextInt();
		void V_result_sum = (V_number1 + V_number2);

	}

	public static void p_subtration() {
		System.out.print("the result of the subtraction is: ");
		System.out.println(V_number1 - V_number2);
	}

	public static void p_multiplication() {
		System.out.print("the result of the multiplication is: ");
		System.out.println(V_number1 * V_number2);
	}

	public static void p_division() {
		System.out.print("the result of the division is: ");
		System.out.println(V_number1 / V_number2);
	}

}
