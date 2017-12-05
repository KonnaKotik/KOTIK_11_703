package New.SrezWork_5_December_2017;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double
                x0 = scanner.nextDouble(),
                x,
                e = 0.001;

        int n = 1;

        x = 1 / (x0*x0*x0*x0 - 3*x0*x0 + Math.log10(x0)) + Math.sqrt((x0*x0*x0*x0 - 3*x0*x0 + Math.log10(x0)) / 2);

        while(Math.abs(x - x0) > e) {
            x0 = x;
            x = 1 / (x0*x0*x0*x0 - 3*x0*x0 + Math.log10(x0)) + Math.sqrt((x0*x0*x0*x0 - 3*x0*x0 + Math.log10(x0)) / 2);
            n++;
        }

        System.out.println(n + " - наименьшее");



    }
}
