package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;//, p_limit_0
        int p_total = 0;

        System.out.println(("digite la cantidad de calificaciones"));
        int array_size = keyboard.nextInt();
        int[] p_array_or_vector = new int[array_size];


        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            System.out.println("Por favor digite su calificacion del corte " + (counter + 1));
            p_array_or_vector[counter] = keyboard.nextInt();
            p_total = p_total + p_array_or_vector[counter];
        }

        System.out.println("El promedio es: " + (p_total / p_array_or_vector.length));

        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            System.out.println("El resumen de sus calificaciones es: ");
            System.out.println("Su calificacion del corte " + (counter) + " es: " + p_array_or_vector[counter]);
            p_total = p_total + p_array_or_vector[counter];
        }

        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            if (counter == 0) {
                System.out.println("El valor de la nota es: " + (p_array_or_vector[counter] * 0.1));
            }
            if (counter == 1) {
                System.out.println("El valor de la nota es: " + (p_array_or_vector[counter] * 0.3));
            }
            if (counter  >= 2) {
                System.out.println("The value of grade is: " + (p_array_or_vector[counter] * (0.6 / (p_array_or_vector.length - 2))));
            }
            System.out.println("Su calificacion del corte " + (counter + 1) + " es: " + p_array_or_vector[counter]);
            p_total = p_total + p_array_or_vector[counter];
        }

    }
}
