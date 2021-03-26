package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] numbers = new double[3];
        double counter_notas=0;
        int count=0;
        for(int counter=0;counter<3;counter++){
            System.out.print((counter+1)+". Digite el numero: ");
            numbers[counter]= Double.parseDouble(entrada.next());
            counter_notas=numbers[counter] + counter_notas;
            count=count+counter;
        }
        System.out.println("su numero de calificaciones son: "+count);
        System.out.println("Su promedio calificacion del corte es " + (counter_notas / numbers.length));
        for( double counter:numbers){
            System.out.println(counter);
        }
    }
    }

