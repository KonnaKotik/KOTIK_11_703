package October_17_2017;

import java.util.Scanner;

public class Exercise_14_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), k = 1; // a>1
        double x = scanner.nextDouble(), e = 0.0001, t, s = 0;

        t = 1.0 / a;

        while (t >= e) {
            s += t*Math.log10(x*t);
            k++;
            t /= a;
        }
        System.out.println(s);
    }
}
