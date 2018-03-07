package October11;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                a = scanner.nextInt(),
                m = 1;

        double
                x = scanner.nextDouble(),
                s = 1,
                t = a*x,
                e = 0.001;

        while (Math.abs(t) > e) {
            s += t;
            m++;
            t *= (double)(a - m)*x / (double)m;

        }
        System.out.println(s);
        System.out.println(m);
    }
}
