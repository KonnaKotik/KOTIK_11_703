package October11;//+

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int n = 1;

        double x = scanner.nextDouble(), b0 = 1 - x, a0 = x, e = 0.0001;

        while (Math.abs(b0) > e) {
            a0 = a0*(1 + b0 / 2);
            b0 = b0*b0*(3.0 + b0);
            n++;
        }
        System.out.println(a0);
    }
}

