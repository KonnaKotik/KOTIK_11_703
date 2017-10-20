package Homework;

import java.util.Scanner;

public class Exercise_9_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                m = 0;

        double
                s = 0,
                t = 1;

        while (m <= n) {
            s += 1.0 / ((2*m +1)*t);
            t *= 9.0;
            m++;
        }
        System.out.println(s);
    }
}
