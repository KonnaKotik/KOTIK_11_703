package ru.itis;

import java.util.Scanner;

public class Maintwo {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                x = scanner.nextInt(),
                k = 0, p = 1, one = 1;

        double s=0;

        while (k <= n) {
            s += (double) p * Math.pow(x, 4*k + 1)  / (one*(4*k+1));
            k++;
            one = one*2*k*(2*k - 1);
            p = -p;

        }
        System.out.println(s);

        }
}
