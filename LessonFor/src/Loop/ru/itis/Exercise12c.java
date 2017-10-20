package ru.itis;

import java.util.Scanner;

public class Exercise12c {
    public static  void main(String [] args) {

        Scanner scanner  = new Scanner(System.in);

        int
                p = 1,
                n = 1;

        double
                x = scanner.nextDouble(), // -1 < x < 1
                t = x,
                e = 0.0001,
                s = 0;

        while (Math.abs(t) > e) {
            s += p*t;
            n++;
            t *= x*(n -1) / n;
            p = -p;
        }
        System.out.println(s);
    }
}
