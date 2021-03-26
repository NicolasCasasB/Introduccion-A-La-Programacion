package usta.fis;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        char [][] matrix;
        int  value;
        String  rows, input;


        rows = JOptionPane.showInputDialog("por favor ingresa las filas: ");

        matrix = new char [Integer.parseInt(rows)][4];


        //fill matrix
        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < 4; j++) {
                if(i %2==0)
                    matrix[i][j] = 'D';
                else
                    matrix[i][j] = 'X';
            }
        }

        int option = 0;
        do{
            showDataMatrix(matrix);
            option = Integer.valueOf(JOptionPane.showInputDialog("por favor 1 para decir puesto[][] "));
            if(option == 1){
                String row = JOptionPane.showInputDialog("pon la fila ocupada: ");
                String column = JOptionPane.showInputDialog("pon la columna ocupada: ");
                int rowNumber = Integer.valueOf(row);
                int columnNumber = Integer.valueOf(column);
                int validation = validatePassegerPosition(matrix,rowNumber,columnNumber);
                switch (validation){
                    case -1:
                        JOptionPane.showMessageDialog(null, "The position esta ocupada");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "The position no es valida");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "The position no es valido");
                        break;
                    case 2:
                        matrix[rowNumber][columnNumber] = 'O';
                        break;

                }
            }
        }while(option == 1);
        JOptionPane.showMessageDialog(null, "The ocupation of bus is:");
        showDataMatrix(matrix);

    }
    //return -1 if is ocuped, 0 if not is valid position in matrix, 1 if not valid position, 2 if occuped the position
    public static int validatePassegerPosition(char[][] matrix, int row, int column){
        if( row >= matrix.length || column >= matrix[0].length ){
            return 0;
        }
        if(matrix[row][column] == 'O'){
            return -1;
        }
        if(matrix[row][column] == 'X'){
            return 1;
        }
        return 2;
    }

    public static void showDataMatrix(char[][] matrix){
        String matrixInString = "";
        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0; j < matrix[0].length ; j++) {

                matrixInString += matrix[i][j] + " ";
            }
            matrixInString += "\n";
        }
        JOptionPane.showMessageDialog(null,matrixInString);
    }        }