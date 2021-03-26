package usta.fis;

public class Main {

    public static void main(String[] args) {
        int asiento[][] = new int[4][];

        asiento[0] = new int[4];
        asiento[1] = new int[4];
        asiento[2] = new int[4];
        asiento[3] = new int[4];

        for (int i = 0; i < 4; i++) {
            for (inft j = 0; j < asiento[i].length; j++)

                asiento[i][j] = i*j;


        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < asiento[i].length; j++)

                System.out.print(asiento[i][j] + "  ");
            System.out.println("\n ");

            for (int i = 0; i < Integer.parseInt(rows); i++) {
                for (int j = 0; j <Integer.parseInt(columns); j++) {
                    if (i%2==0) {
                        System.out.println(matrix[i][j] = "D");
                    }
                    if(i%2!=0) {
                        System.out.println(matrix[i][j] = "X");
                    }
                }
            }

        }
    }
}
