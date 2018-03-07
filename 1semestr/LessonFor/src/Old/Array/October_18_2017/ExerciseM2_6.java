package October_18_2017;

import java.util.Scanner;

public class ExerciseM2_6 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        int [] z = new int[n];

        for ( int i = 0; i < n; i++) {
            x[i] = (int) Math.round(Math.random() * 100 - 30);
            System.out.print(x[i] + " ");
        }
        System.out.println(' ');
        for ( int i = 1; i < n; i++) {
            if (x[i]*x[i-1] < 0) {
                y[i] = 1;
            }
            else y[i] = 0;
            System.out.print( y[i] + " ");
        }
        System.out.println(' ');
        for ( int i = 1; i < n; i++) {
            if (x[i-1] > x[i]) {
                z[i] = 1;
            }
            else z[i] = 0;
            System.out.print( z[i] + " ");
        }
    }
}
