package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Заполните элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
            System.out.println("Среднее арифметическое: " + average);
        }
        for (double num : array) {
            System.out.println(num * average);
        }
    }
}
