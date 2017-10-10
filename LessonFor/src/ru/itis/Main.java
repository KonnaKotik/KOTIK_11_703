package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x = scanner.nextInt();
        int k = 0, p = 1, t = x, one = 1;


        double s=0;

        while(k <= n) {
            s += t*p;
            n++;
            k++;
            p = -p;
            t *= (double) x*x*(k - 2) / k*(2*k + 1);
        }
        //нужна общая формула получения следующего слагаемого из предыдущего
        System.out.println(s);

    }
}
