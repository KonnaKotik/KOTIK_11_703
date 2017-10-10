package ru.itis;

import java.util.Scanner;

public class Mainthree {
        public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);

            int
                    n = scanner.nextInt(),
                    x = scanner.nextInt(),
                    k = 1,

            double s=0, t = x*x/2;

            while (k <= n) {
                s += t;
                k++;
                t *= (double) x*x*(2*k - 2) / 2*k;
            }
            System.out.println(s);

            }
}
