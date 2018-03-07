package HomeWorkFor13_12_2017.OOP;


import java.util.Scanner;

public class Publication {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void publication() {

        Scanner scanner = new Scanner(System.in);

        String
                headline = scanner.nextLine(),
                date = scanner.nextLine(),
                text = scanner.nextLine();

        System.out.println(headline);
        System.out.println(date);
        System.out.println(text);
    }





}
