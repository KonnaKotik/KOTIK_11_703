package October11;

public class Exercise29a {
    public static void main(String[] args) {

        double
                x0 = 0,
                x1,
                e = 0.0001;
        int
                n = 1;

        x1 = (x0 + 1) / (x0 + 2);

        while (Math.abs(x0 - x1) > e) {
            x0 = x1;
            x1 = (x0 + 1) / (x0 + 2);
            n++;
        }
        System.out.println(n);
    }
}
