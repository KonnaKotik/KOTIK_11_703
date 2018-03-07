import java.util.Scanner;

public class TAsk_012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                p = 1;

        double
                s = 0,
                t = 0;

        for(int i = 1; i <= n; i++) {
            t =  1.0 / ((2*i-1)*(2*i-1));
            s += (double) p*t;
            p *= -1;

        }

        System.out.println(s);
    }
}
