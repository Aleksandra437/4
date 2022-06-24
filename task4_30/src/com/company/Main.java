package com.company;//30. Реализовать метод пузырьковой сортировки в варианте,
//когда в метод передается два массива: первый массив – массив с объектами,
//которые необходимо отсортировать, а второй массив – массив целых чисел,
//согласно которым необходимо отсортировать первый массив. Сигнатура метода должна быть:
//public static <T> void sort(T[] data, int[] orderValues)
//Сортировка должна работать следующим образом:
//{ "green", "blue", "red" }, { 5, 8, 1 } –> { "red", "green", "blue" }, { 1, 5, 8 }
//Очевидно, что все сравнения надо выполнять над числами из второго массива,
//а любые обмены делать одновременно в двух массивах.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите количесво элементов в массивах = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1;
        arr1 = new int[n];
        System.out.println("Введите элементы массива с числами: ");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = s.nextInt();
        }
        String[] arr2;
        arr2 = new String[n];
        System.out.println("Введите элементы массива со словами: ");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = s.next();
        }
        Vivod(arr1, arr2);
        sort(arr2, arr1);
        Vivod(arr1, arr2);
    }

    public static <T> void sort(T[] data, int[] orderValues){
        int size = orderValues.length;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (orderValues[j - 1] > orderValues[j]) {
                    int temp = orderValues[j - 1];
                    orderValues[j - 1] = orderValues[j];
                    orderValues[j] = temp;
                    T temp2 = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp2;
                }
            }
        }
    }
    public static void Vivod(int arr1[], String arr2[]){
        System.out.print("{");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]);
            if (i + 1 != arr1.length){
                System.out.print(", ");
            }
        }
        System.out.print("}, {");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
            if (i + 1 != arr2.length){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
