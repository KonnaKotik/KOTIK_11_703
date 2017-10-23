package Homework_18_10;//+

import java.util.Scanner;

public class Exercise_20_e {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int
                k = 3,
                n = scanner.nextInt(),
                a = scanner.nextInt(),
                b = scanner.nextInt(),
                c = scanner.nextInt(),
                d = scanner.nextInt(),
                e = scanner.nextInt(),
                f = scanner.nextInt(),
                g = scanner.nextInt(),
                h = scanner.nextInt();

        double ys, yss,ysss, xs, xss, xsss, x, y;

        xsss = ysss = a;
        xss = yss = b;
        xs = ys = c;
        for ( int i = 1; i <= n; i++ ) {
            x = d*xs + e*yss + f*xsss;
            y = g*xs + h*yss;
            xsss = xss;
            xss = xs;
            xs = x;
            ysss = yss;
            yss = ys;
            ys = y;

        }
        System.out.println(xs);
        System.out.println(ys);
    }
}
