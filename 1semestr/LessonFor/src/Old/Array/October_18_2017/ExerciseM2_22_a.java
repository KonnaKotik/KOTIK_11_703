package October_18_2017;

import java.util.Scanner;
import java.util.Random;
public class ExerciseM2_22_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int n = scanner.nextInt(), s1 = 0;
        int [] a = new int[n];

        for ( int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100 - 10);
            if (a[i] > 0) {
                s1 += a[i];
            }
        }
        System.out.println(s1);
    }
}
