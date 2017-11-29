package October_17_2017;

import java.util.Scanner;

public class Exercise_23_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                a = scanner.nextInt(),
                b = scanner.nextInt();

        double
                x = scanner.nextDouble(),
                v0, v1, v, s;

        v0 = v1 = a;
        v = v1 + v0;
        s = Math.log10(v0*x) + Math.log10(v1*x);
        while ( v <= b) {
            s += Math.log10(v*x);
            v0 = v1;
            v1 = v;
            v = v1 + v0;

        }
        System.out.println(s);
    }
}
