package ru.itis;

import java.util.Scanner;

public class Exercise12d {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int
                x = scanner.nextInt(),
                p = 1,
                n = 0;

        double
                t = 1,
                e = 0.0001,
                s = 0;

        while (Math.abs(t) > e) {
            s += p*t;
            n++;
            t = t*x*x / ((2*n - 1)*2*n);
            p = -p;
        }
        System.out.println(s);
    }
}
