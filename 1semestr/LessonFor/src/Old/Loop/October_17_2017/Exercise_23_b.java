package October_17_2017;//+

import java.util.Scanner;

public class Exercise_23_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                a = scanner.nextInt(),
                b = scanner.nextInt(),
                p = 1;

        double
                x = scanner.nextDouble(),
                v0, v1, v, s, t;

        v0 = v1 = a;
        v = v1 + v0;
        t = 1.0 / 4 ;
        s = p*v0*Math.cos(x*v0)*Math.cos(x*v0) - p*v1*Math.cos(v1*x)*Math.cos(v1*x) / 2;

        while ( v <= b) {
            s += p*v*t*Math.cos(v*x)*Math.cos(v*x) ;
            t /= 2.0;
            v0 = v1;
            v1 = v;
            v = v1 + v0;
            p = -p;
        }
        System.out.println(s);
    }
}
