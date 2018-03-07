

import java.util.Scanner;

public class Exercise_9_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                x = scanner.nextInt(),
                a = scanner.nextInt(),
                m = 0;

        double
                s = 1,
                t = 1,
                e = 0.001;

        while (Math.abs(t) > e) {
            t *= (double)a*(a - m) / m;
            s += t;
            m++;
        }
        System.out.println(s);
        System.out.println(m);
    }
}
