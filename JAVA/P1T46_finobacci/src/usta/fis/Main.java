package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int serie = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite un numero mayor que 1");
        serie = keyboard.nextInt();
        int fibo1[] = new int[100];
        fibo1 = serie_fibo(serie);
        System.out.println("la serie finobacci para el numero " + serie + " es:");
        for (int i = 0; i < serie; i++) {
            System.out.print(fibo1[i]);
        }
    }

    public static int[] serie_fibo(int limit) {
        int[] fibo1 = new int[100];

        fibo1[0] = 0;
        fibo1[1] = 1;


        for (int i = 2; i <= fibo1[i - 2]; i++) {
            System.out.print(fibo1 + " ");
            fibo1[i + 1] = fibo1[i + 1] + fibo1[1];
            fibo1[i + 1] = fibo1[i + 1] - fibo1[1];
        }
        return fibo1;


    }
}