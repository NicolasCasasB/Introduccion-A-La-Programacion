package usta.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                int[] numero = new int[5];
                int calculo = 0;
                int[] capicua = new int[5];
                int cifra, i;
                Scanner in = new Scanner(System.in);

                for ( i = 0; i < 5; i++) {
                    System.out.print("Introduce un número >= 10: ");
                    numero[i] = in.nextInt();
                }
//lo damos la vuelta al número
                for ( i = 0; i<calculo ;i++) {
                    calculo= numero[i];
                    while (calculo != 0) {
                        cifra = calculo % 10;
                        capicua[i] = capicua[i] * 10 + cifra;
                        calculo = calculo / 10;
                    }
                }
                for ( i = 0; i < calculo; i++) {
                    if (numero[i] != capicua[i]) {
                        System.out.println(numero[i]+" No es capicua");
                    } else {
                        System.out.println(numero[i]+" Es capicua");
                    }
                }
            }
        }