package ru.itis;

import java.util.Scanner;

public class Exexrcise12b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                x = scanner.nextInt(),
                n = 0,
                p = 1;

        double
                e = 0.0001,
                t = x,
                s = 0;
        while (Math.abs(t) > e) {
            s += p*t;
            n++;
            t *= (double)x*x / (2*n*(2*n + 1));
            p = -p;
        }
        System.out.println(s);

        }
}
