package ru.itis;

import java.util.Scanner;

public class Exercise_10_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double
                x = scanner.nextDouble(),
                s = 0,
                t = x;

        int
                n = scanner.nextInt(),
                k = 1;

        while (k <= 2*n) {
            s += t;
            k++;
            t *= x*(k - 1) / k;
        }
        System.out.println(s);

    }
}
