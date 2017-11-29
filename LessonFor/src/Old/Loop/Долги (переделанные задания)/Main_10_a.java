package ru.itis;

import java.util.Scanner;

public class Main_10_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), k = 0, p = 1;

        double x = scanner.nextDouble(), s = 0, t = x;

        while (k <= n) {
            s += t * p;
            k++;
            p = -p;
            t *= x * x * (k - 2) / (k * (2 * k + 1));
        }
        System.out.println(s);

    }
}
