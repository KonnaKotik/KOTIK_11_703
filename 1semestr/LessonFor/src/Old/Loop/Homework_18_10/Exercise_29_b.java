package Homework_18_10;//+

public class Exercise_29_b {
    public static void main (String[] args) {
        int n = 1;

        double e = 0.0001, x0 = 0, x1;

        x1 = Math.cos(x0);

        while (Math.abs(x1-x0) > e) {
            x0 = x1;
            x1 = Math.cos(x0);
            n++;
        }
        System.out.println(n);
    }
}
