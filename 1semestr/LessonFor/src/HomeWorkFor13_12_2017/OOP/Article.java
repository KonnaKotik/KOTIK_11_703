package HomeWorkFor13_12_2017.OOP;


import java.util.Scanner;

public class Article extends Publication {

    @Override
    public void publication () {

        Scanner scanner = new Scanner(System.in);

        String auth = scanner.nextLine();

        System.out.println("Автор статьи: " + auth);
    }
}
