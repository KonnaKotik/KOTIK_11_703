package ru.itis;//-

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
            t *= Math.sin(i) / Math.cos(i);//как-то вы странно формируете тело цикла. При i = n получаем sin(n) и cos(n),
            //а i становится равным n+1 и подсчитанное t в S не попадает.
            i++;
        }
        System.out.println(s);

    }
}
