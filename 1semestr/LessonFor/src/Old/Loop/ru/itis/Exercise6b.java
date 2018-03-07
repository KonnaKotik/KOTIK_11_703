package ru.itis;

public class Exercise6b {
    public static void main(String[] args) {
        int
                p = 1,
                n = 0;

        double
                g = 0,
                t = 1,
                e = 0.0001;

        while (Math.abs(t) > e) {
            g += p*t;
            n++;
            t = 1.0 /((2*n + 1)*(2*n + 1));
            p = -p;
        }
        System.out.println(g);
    }

}
