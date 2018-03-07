package Array.October_24_2017;//-

import java.util.Random;
import java.util.Scanner;

public class ExerciseM_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int n = scanner.nextInt();
        int [] a = new int[n];
        int k = 0;

        for ( int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
         int min = a[0];
        System.out.println(" ");

        for (int i = 1; i < n; i++ ) {
            if (a[i] == min) k++;
            if (a[i] < min) {
                min = a[i];
                k = 0;
            }

        }
        System.out.println(k + 1);  //неверно считает
        System.out.println(min);

        }
}
