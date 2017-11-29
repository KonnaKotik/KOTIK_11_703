package SemestrWork.Sm1; // Вычисление кубического корня: нахождения трех чисел при заданных x1, x2, x3

public class Sm_1_4_3 {
    public static void main(String[] args) {

        int n = 22;
        double[]x = {-0.3, -6, -6.2 },
                u = new double[n];
        double a;
        u[0] = 1;
        // первое число
        a = Math.sqrt(2 + Math.sin(x[0])) + Math.sqrt(2 - Math.cos(x[0]));

        for (int i = 1; i < n; i++) {
            u[i] = (double)2/3*u[i-1] + a/(3*u[i-1]*u[i-1]); // рекурентная схема вычисления кубического корня
        }
        System.out.println(u[n-1]);
        // второе число
        a = Math.sqrt(2 + Math.sin(x[1])) + Math.sqrt(2 - Math.cos(x[1]));

        for (int i = 1; i < n; i++) {
            u[i] = (double)2/3*u[i-1] + a/(3*u[i-1]*u[i-1]);
        }
        System.out.println(u[n-1]);
        // третье число
        a = Math.sqrt(2 + Math.sin(x[2])) + Math.sqrt(2 - Math.cos(x[2]));

        for (int i = 1; i < n; i++) {
            u[i] = (double)2/3*u[i-1] + a/(3*u[i-1]*u[i-1]);
        }
        System.out.println(u[n-1]);
    }
}
