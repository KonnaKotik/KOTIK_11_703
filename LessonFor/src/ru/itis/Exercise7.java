package ru.itis;

public class Exercise7 {
    public static void main(String[] args) {
        int
                n = 1;
        double
                s = 4/3,
                pi = 3.1415936,
                e = 0.00001;
        while ( Math.abs(s - pi / 2) > e) {
            n++;
            s *= (double)4*n*n / (4*n*n - 1);

        }
        System.out.println(n - 1);

    }
}
