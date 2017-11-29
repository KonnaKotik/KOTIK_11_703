package October_17_2017;//+

import java.util.Scanner;

public class Exercise_24_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = 2, p = -1, n = 1;
        double x = scanner.nextDouble(), b0 = 1, c0 = 0, b1, c1, b, c, e = 0.0001, t, s;

        b1 = Math.cos(x);
        c1 = Math.sin(x);
        b = b0*b1 - c0*c1;
        c = c0*b1 + b0*c1;
        t = b1;
        s = t;

        while (  Math.abs(t)>= e) {
            if (k % 2 == 1) {
                s += p * t;
                t = b / k;
            }
            c0 = c;
            b0 = b;
            b = b0*b1 - c0*c1;
            c = c0*b1 + b0*c1;
            k++;
            p = -p;
        }
        System.out.println(s);
    }
}
