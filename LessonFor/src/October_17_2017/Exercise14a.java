package October_17_2017;

import java.util.Scanner;

public class Exercise14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = -1, k = 1;
        double t = 1, s = 0, e = 0.0001, x = scanner.nextDouble();

        while ( t >= e) {
            s += p*t*Math.sin(t*x)*Math.sin(t*x);
            k++;
            t *= 1.0 / k;
            p = -p;
        }
        System.out.println(s);

    }
}
