package ru.itis;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        int
                x = scanner.nextInt(),
                n = 1;

        double
                e = 0.0001,
                t = x,
                s = 1;

        while (Math.abs(t) > e) {
            s += t;
            n++;
            t = t* x / n ;

        }
        System.out.println(s);
    }
}
