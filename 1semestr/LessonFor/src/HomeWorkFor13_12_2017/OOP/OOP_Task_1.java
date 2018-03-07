package HomeWorkFor13_12_2017.OOP;

import java.util.Scanner;

public class OOP_Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String
                auth = scanner.nextLine(),
                source = scanner.nextLine(),
                lastDate = scanner.nextLine();

        Article article = new Article();
        article.publication();

        Ad ad = new Ad(lastDate);
        ad.publication();

        News news = new News(source);
        news.publication();

        news.getName();


    }



}
