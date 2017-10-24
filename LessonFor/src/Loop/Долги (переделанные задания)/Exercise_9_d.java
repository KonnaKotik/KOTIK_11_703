package Homework;//-

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
            t *= 1.0 / ((2*m +1)*9.0); //нельзя накапливать степень
            s += t;
            m++;
        }
        System.out.println(s);
    }
}
