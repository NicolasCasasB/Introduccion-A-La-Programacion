package usta.fis;
//AUTHOR:Nicolas Casas Bello
//DATE:2021-march-16
//DESCRIPTION:this software show variable than input by keyboard

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("SoftInputNumber");
        System.out.println("Maker: Nicolas Casas");
        System.out.println("----------------------------");
        Scanner keyboard = new Scanner(System.in);

        int V_number1, V_number2, V_sum;
        System.out.println("input the firsts number");
        V_number1= keyboard.nextInt();
        System.out.println("input the Second number");
        V_number2= keyboard.nextInt();
        V_sum=V_number1+V_number2;
        System.out.println("the total sum is " + V_sum);
    }
}
