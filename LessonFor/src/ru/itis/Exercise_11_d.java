package ru.itis;

import java.util.Scanner;

public class Exercise_11_d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                i = 1;

        double
                s = 1, t = 1;

        while (i <= n) {
            s *= t;
            t *= Math.sin(i) / Math.cos(i);
            i++;
        }
        System.out.println(s);

    }
}
