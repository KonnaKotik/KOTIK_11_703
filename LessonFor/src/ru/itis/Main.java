package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int
            n = scanner.nextInt(),
            x = scanner.nextInt(),
            k = 0, p = 1, t = x;

        long one = 1;

        double s=0;

        while(k <= n) {
<<<<<<< HEAD
            s += (double)p*t/  (one*(2*k + 1));
            one = one*(k + 1);
=======
            s += (double)p * Math.pow(x, 2*k + 1) /  (one*(2*k + 1));//плохо получаем степень
            one = one*(k + 1);  //здесь будет переполнение очень быстро
>>>>>>> 7145f9c75acf287b5edb2360be4021c7bff3118e
            p = -p;
            t *= x*x;
            k++;
        }
        //нужна общая формула получения следующего слагаемого из предыдущего
        System.out.println(s);

    }
}
