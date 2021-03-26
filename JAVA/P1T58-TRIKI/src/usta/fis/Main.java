package usta.fis;


import javax.swing.*;

public class Main {
    private static Main Triqui;

    public static void main(String[] params) {
        char[][] matrix;
        Triqui = new Main();
        int opcion, filax, columnax, filao, columnao;
        String option;
        option = JOptionPane.showInputDialog("Bienvenido a juego triqui, " +
                "\n si digitas la opcion 1 es para 3x3, si digitas la opcion 2 es para 5x5");
        opcion = Integer.parseInt(option);


        if (opcion == 1) {

            option = JOptionPane.showInputDialog("por favor ingresar la fila para X ");
            filax = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la columna para X ");
            columnax = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la fila para o  ");
            filao = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la fila para o  ");
            columnao = Integer.parseInt(option);


        }
        if (opcion == 2) {

            option = JOptionPane.showInputDialog("por favor ingresar la fila para X ");
            filax = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la columna para X ");
            columnax = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la fila para o  ");
            filao = Integer.parseInt(option);

            option = JOptionPane.showInputDialog("por favor ingresar la fila para o  ");
            columnao = Integer.parseInt(option);


        }
    }
}

