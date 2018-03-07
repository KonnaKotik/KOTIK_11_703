package October_18_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseM2_11_b {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        Random r = new Random();
        int n = scanner.nextInt(), t;
        int [] x = new int[n];
        int [] y = new int[n];
        int [] z = new int[n];

        for ( int i = 0; i < n; i++) {
            x[i] = r.nextInt(20);
            System.out.print(x[i] + " ");
        }

        System.out.println(' ');

        for ( int i = 0; i < (n -1) ; i++){
            y[i] = x[i+1];
        }
        y[n-1] = x[0];
        for ( int i = 0; i < n; i++){
            System.out.print(y[i] + " ");
        }

        System.out.println(' ');

        for ( int i = 1; i < n; i++) {
            z[i] = x[i-1];
        }

        z[0] = x[n-1];

        for ( int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
