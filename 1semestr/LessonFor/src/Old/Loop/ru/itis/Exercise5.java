package ru.itis;


public class Exercise5 {

    public static void main(String[] args) {
        int
                n = 2,
                p = 1;

        double
                e = 0.0001,
                s = 1,
                pi = 3.1415926;

        while (Math.abs(s - pi / 4) > e) {
            p = -p;
            s += p*1.0 / (2*n - 1);
            n++;

        }
        System.out.println(n-1);
    }
    }
