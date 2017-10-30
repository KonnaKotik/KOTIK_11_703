package Array.Контрольна_работа_25_10_2017;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double
                x = scanner.nextDouble(), // -1 <= x <= 1;
                e = 0.8,
                s = 1, t = 1;
        int
                k = 1, p = 1;

        while (Math.abs(s) > e) {
            t *= (double)2*k*(2*k - 1)*(3 - 2*k) / ((1 - 2*k)*4*k*k)*x;
            s += p*t;
            k++;
            p = -p;
        }
        System.out.println(s);
    }
}
