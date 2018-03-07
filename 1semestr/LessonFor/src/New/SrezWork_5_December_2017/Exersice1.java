package New.SrezWork_5_December_2017;

import java.util.Scanner;

public class Exersice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double
                e = 0.0001,
                t = 1,
                s = 0,
                a = scanner.nextDouble(),
                x = scanner.nextDouble(); // |x| < 1;


        int
                k = 1;


        while (Math.abs(t) > e) {
            s += t;
            t *= (a - k+1)*x / k;
            k++;
        }

        System.out.println(s);

    }
}
