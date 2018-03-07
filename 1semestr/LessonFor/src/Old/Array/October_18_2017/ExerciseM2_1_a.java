package October_18_2017;

import java.util.Scanner;
import java.util.Random;

public class ExerciseM2_1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), s = 0;
        int [] a = new int[n];
        int [] b = new int[n];

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(30);
            b[i] = r.nextInt(20);
            s += a[i]*b[i];
        }
        System.out.println(s);
    }
}
