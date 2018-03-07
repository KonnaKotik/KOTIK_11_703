package Homework_18_10;//+


public class Exercise_30_a {
    public static void main(String[] args) {

        double
                e = 0.00001,
                x0 = 1.1,
                x1, f1, f;

        f = x0*x0*x0*x0*x0 - x0 - 0.0002;
        f1 = 5*x0*x0*x0*x0 - 1;
        x1 = x0 - f / f1;

        while (Math.abs(x1 - x0) >= e) {
            x0 = x1;
            f = x0*x0*x0*x0*x0 - x0 - 0.0002;
            f1 = 5*x0*x0*x0*x0 - 1;
            x1 = x0 - f / f1;
        }

        System.out.println(f);


    }
}
