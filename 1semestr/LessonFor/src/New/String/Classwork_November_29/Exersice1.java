package New.String.Classwork_November_29;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exersice1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       /* String zeros = "\u0000\u0000";
        String hello = "Hello";
        String specialChars = "\r\n\t\"\\";
        String unicodeEscapes = "\u0101\u0234\u03ff";
        System.out.println(zeros);
        System.out.println(hello);
        System.out.println(specialChars);
        System.out.println(unicodeEscapes);

        System.out.println(" ");

        char[] charArray = {'a', 'b', 'c'};
        String string = new String(charArray);
        System.out.println(string);
        System.out.println(" ");

        String s1 = "xyz";
        String s2 = "xyz";
        String s3 = new String("xyz"); //????
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2)); // 1153

        String helloWorld = "hello" + " World!";
        System.out.println(helloWorld);

            String s = new String("ssssss");
        System.out.println(s);
        s.concat("-aaa");
        String a = s.concat("-aaa");
        System.out.println(s);
        System.out.println(a);

        String s = "lesson three ";
        for (int i = 1; i <= s.length(); i++){
            System.out.println(s.charAt(s.length()-i));
        }*/

        String s = scanner.nextLine();

        try {
            Scanner sc = new Scanner(new File("file.txt"));
            while (sc.hasNext()) {
                String p = sc.next();
                System.out.println(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

