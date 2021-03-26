package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] notes;
        int size = 0;
        int i = 0;
        int grade = 0;
        int AverageResult;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please type the size for single array ");
        size = keyboard.nextInt();
        notes = new int[size];

        System.out.println("Please type the grades that you know the average");

        while (i < notes.length) {
            System.out.println("Please type the " + (i + 1) + " grade: ");
            grade = keyboard.nextInt();
            notes[i] = grade;
            i++;
        }
        AverageResult = Average(notes);
        System.out.println("your average grades are " + AverageResult);



    }
    public static float Average(int [] notes){
        int counter = 0, sum = 0 ;
        float average = 0;

        while (counter< notes.length{
            sum =sum +notes[counter];
            counter++;
        }
        average= sum/notes.length;
        return  average;
    }
}
