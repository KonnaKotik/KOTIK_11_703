package ru.itis;

import java.util.Scanner; // Задание № 10(б)

public class Maintwo {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                x = scanner.nextInt(),
                k = 0, p = 1;


        double s = 0,t = x;

        while (k <= n) {
            s += p*t;
            k++;
            t *= (double) x*x*x*x*(4*k - 3)/ ((2*k - 1)*2*k*(4*k + 1));
            p = -p;
        }
        System.out.println(s);

        }
}
