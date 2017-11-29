package October_18_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseM2_11_a {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Random r = new Random();
        int n = scanner.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];

        for ( int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }

        System.out.println(' ');

        for ( int i = 0; i < n; i++){
            b[i] = a[n-1-i];
            System.out.print(b[i] + " ");
        }

    }
}
