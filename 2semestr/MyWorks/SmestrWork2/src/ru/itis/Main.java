package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void out(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
    }
    public static void compSort(int[] array) {
        long nanoTimeBefore = System.nanoTime();
        int count = 0;
        int gap = array.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < array.length) {
                if (array[i] > array[i + gap]) {
                    count++;
                    int t = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
        long nanoTimeAfter = System.nanoTime();
        out(array);
        System.out.println("Заняло времени: " + (nanoTimeAfter - nanoTimeBefore) + " наносекунд");
        System.out.println("Количество итераций: " + count);
    }

    public static int[] toArray(int count) throws Exception  {
        BufferedReader reader = new BufferedReader(
                new FileReader("TEXT.txt"));

        int[][] array = new int[50][];

        for(int i = 0; i < array.length; i++ ){
            String[] arrayString = reader.readLine().split(" ");
            int length = Integer.parseInt(arrayString[0]);
            array[i] = new int[length];
            for(int j = 0; j < length; j++) {
                int number = Integer.parseInt(arrayString[j + 1]);
                array[i][j] = number;
            }
        }
        return array[count];
    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер массива");
        int count = scanner.nextInt();
        int[] array = toArray(count);
        out(array);
        compSort(array);
    }


}
