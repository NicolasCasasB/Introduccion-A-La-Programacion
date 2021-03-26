package usta.fis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numero = new int[5];
        int calculo = 0;
        int[] capicua = new int[5];
        int cifra, i;
        Scanner in = new Scanner(System.in);


        int Number, cantidad, capicua = 0, cifra;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please type 10 values to the array");

        for ( i = 0; i < 5; i++) {
            System.out.print("Introduce un número >= 10: ");
            Number[i] = in.nextInt();
        } while (Number < 10);


        //le damos la vuelta al número
        cantidad = Number;
        while (cantidad != 0) {
            cifra = cantidad % 10;
            capicua = capicua * 10 + cifra;
            cantidad = cantidad / 10;
        }

            if (Number == capicua) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        }
    }




