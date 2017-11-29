package ru.itis;//+

import java.util.Scanner;

public class Exercise_11_b {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                k = 0;
        double  s = 0, t = 1;

        while (k <= n) {
            s += t;
            k++;
            t *= Math.cos(k) / Math.sin(k);
        }
        System.out.println(s);

    }
}
