package HomeWorkFor13_12_2017.String;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_234 {

    public static int twoToTen(String string) {

        int
                n = parseInt(string),
                toten = 0;

        for (int i = 0; i < string.length(); i++ ) {
           toten += (n % 10)*Math.pow(2,i);
           n /= 10;
        }

       return toten;
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        String string = scanner.nextLine();


        int
                i = 0;

        while(i < string.length()) {
            char ch = string.charAt(i);
            if (ch != '0' && ch != '1') {
                System.out.println("Повторите ввод числа");
                string = scanner.nextLine();
                i = 0;
            }
            i++;
        }

        System.out.println(twoToTen(string));

    }
}
