package October11;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble(), y0, y1, e = 0.0001;
        int n = 1;

        if (x >= 1) y0 = x /3;
        else y0 = x;

        y1 = y0 - 1.0 / 3 * (y0 - x / (y0*y0));

        while (Math.abs(y1 - y0) > e) {
            y0 = y1;
            y1 = y0 - 1.0 / 3 * (y0 - x / (y0 * y0));
            n++;
        }
        System.out.println(y1);
    }

}
