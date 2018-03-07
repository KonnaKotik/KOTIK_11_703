package HomeWorkFor13_12_2017.String;

import java.util.Scanner;

public class Task_232 {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        String string = scanner.nextLine();

        for(int i = 0; i < string.length(); i++) {
            char chi = string.charAt(i);
            for(int j = i+1; j < string.length(); j++) {
                char chj = string.charAt(j);
                if (chi == chj) {
                    System.out.print(chj + " ");
                }
            }
        }



    }
}
