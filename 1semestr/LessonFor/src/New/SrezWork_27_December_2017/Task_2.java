package New.SrezWork_27_December_2017;

import java.util.Scanner;

public class Task_2 {
    public static void show(String string, int i) {
        boolean f  =true;
        for (int j = i+1; j < string.length() && f ; j++){
            if (string.charAt(j) != ']' ){
                System.out.print(string.charAt(j) + " ");
            }
            else {
                f = false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        String string = scanner.nextLine();

        boolean f = true;

        for (int i = 0; i < string.length() && f; i++ ) {
            if (string.charAt(i) == '[') {
                show(string, i);
                f = false;
            }
        }

    }
}
