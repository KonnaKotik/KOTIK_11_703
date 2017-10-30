package SemestrWork;

import java.util.Scanner;

public class SW_Exercise_1_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double
                a = scanner.nextDouble(),
                x = scanner.nextDouble(),
                f;

        if (a >= 0) f = x*Math.cos(a - x + 1.0);
        else f = 2.0*Math.cos(a + x);

        System.out.println(f);


    }
}
