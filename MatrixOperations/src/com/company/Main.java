package com.company;


public class Main {

    public static void main(String[] args) {

        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int[][] matrixSum = new int[4][4];
        int[][] matrixSub = new int [4][4];
        int [][] matrixMul = new int [4][4];
        int[][] transpose1 = new int [4][4];
        int[][] transpose2 = new int [4][4];

        System.out.println("First Matrix : ");

        for (int i = 0; i < matrix1.length; i++) {
            System.out.print("[");
                for (int j = 0; j < matrix1.length; j++) {
                    System.out.print((matrix1[i][j] = (int)(Math.random()*30 + 1 ) ) + " "); }
                        System.out.print("]");
                System.out.println(" ");}

        System.out.println("***************************** ");
        System.out.println("Transpose of first matrix : ");

        for (int i = 0 ; i < matrix1.length; i++) {
            System.out.print("[");
                for (int j = 0 ; j < matrix1.length; j++) {
                     transpose1[i][j] = matrix1[j][i];
                        System.out.print(transpose1[i][j] + " "); }
                        System.out.print("]");
                        System.out.println(" ");  }

        System.out.println("***************************** ");
        System.out.println("Second Matrix:");

        for (int i = 0; i < matrix2.length; i++) {
            System.out.print("[");
                for (int j = 0; j < matrix2.length; j++) {
                    System.out.print((matrix2[i][j] = (int)(Math.random()*30 + 1 ) ) + " "); }
                    System.out.print("]");
                    System.out.println(); }

        System.out.println("***************************** ");
        System.out.println("Transpose of second matrix : ");

        for (int i = 0 ; i < matrix2.length; i++) {
            System.out.print("[");
                for (int j = 0 ; j < matrix2.length; j++) {
                     transpose2[i][j] = matrix2[j][i];
                     System.out.print(transpose2[i][j] + " "); }
                     System.out.print("]");
                     System.out.println(" "); }

        System.out.println("***************************** ");
        System.out.println("Summation: ");

        for (int i = 0; i < matrix1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix2.length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixSum[i][j] + " ");}
            System.out.print("]");
            System.out.println();
        }
        System.out.println("***************************** ");

        System.out.println("Subtraction: ");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix2.length; j++) {
                matrixSub[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(matrixSub[i][j] + " ");
            }
            System.out.print("]");
            System.out.println(" ");
        }
        System.out.println("***************************** ");
        System.out.println("Multiplication: ");
        int sum = 0;
            for (int i = 0 ; i < matrixMul.length ; i++) {
            System.out.print("[");
                for (int j = 0 ; j<matrixMul.length ; j++) {
                    for (int k=0 ; k< matrixMul.length ; k++) {
                       sum = matrix1[i][k]*matrix2[k][j] + sum;  }
                        matrixMul [i][j] = sum;
                        sum = 0;

                System.out.print(matrixMul[i][j] + " "); }

            System.out.print("]");
            System.out.println();
        }
    }
}