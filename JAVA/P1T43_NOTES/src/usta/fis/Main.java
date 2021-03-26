package usta.fis;

import java.util.Scanner

public class Main {



    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int [] p_array_vector=new int [3];
        int counter=0;
        int p_total=0;

        System.out.println("Digite las notas de sus tres cortes");
        p_array_vector[0]=keyboard.nextInt();
        p_array_vector[1]=keyboard.nextInt();
        p_array_vector[2]=keyboard.nextInt();

        for(counter=0;counter < p_array_vector.length;counter++){
            System.out.println("Su calificacion de corte "+(counter+1)+" es: "+p_array_vector[counter]);
        }
    }
}
