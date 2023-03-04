package com.company;

import java.util.Random;

public class Matrix {
    static int SIZE = 8;
    static int[][] colors = new int[SIZE][SIZE];
    static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        random();
        print(colors);
        System.out.println();
        for (int i = 0; i < 2; i++) {
            rotated();
            System.out.println();
        }
       // System.out.println();


    }

    static public void random() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    static public void print(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    static public void rotated() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - 1 - j][i];
            }
        }
        colors = rotatedColors; ;
            print(rotatedColors);
    }
}