package Homework_18_10;//+

import java.util.Scanner;

public class Exercise_32_b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double
                a = scanner.nextDouble(),
                x0 = a, x1, f,
                e = 0.0001;

        f = 1 + 9*Math.sin(x0) / 2;
        x1 = f;

        while (Math.abs(x1 - x0) >= e) {
            x0 = x1;
            f = 1 + 9*Math.sin(x0) / 2;
            x1 = f;

        }
        System.out.println(f);
    }
}
