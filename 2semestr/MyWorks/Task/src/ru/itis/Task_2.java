package ru.itis;

import java.util.Scanner;

public class Task_2 {


    public static int compare(char a[], char b[]){
        int i = 0;
        while (a[i] == b[i] && ((i+1) != a.length || (i+1) != b.length)){
            i++;
        }
        if ((i+1) == a.length & (i+1) == b.length) {
            return 0;
        }
        if (a[i] > b[i]) {
            return 1;
        }
        else {
            return -1;
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char[] char_a = a.toCharArray();
        char[] char_b = b.toCharArray();

        int compare = compare(char_a, char_b);

        System.out.println(compare);
    }
}

