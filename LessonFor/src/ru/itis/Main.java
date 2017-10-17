package ru.itis;     //Какая задача?

import java.util.Scanner; // Задание № 10(а)

public class Main {

    public static void main(String[] args) {
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
            t *= (double) x*x*(k - 2) / k*(2*k + 1); //что за формула?
        }
        System.out.println(s);

    }
}
