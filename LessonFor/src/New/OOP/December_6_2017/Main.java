package New.OOP.December_6_2017;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Film a = new DomesticFilms();
        Film b = new Comedy();
        DomesticFilms sc = new DomesticFilms();
        Comedy film = new Comedy();

        String name = scanner.nextLine();

        int
                score = scanner.nextInt(),
                year = scanner.nextInt();



        sc.output(name);
        a.typeOfFilm();
        sc.production();

        b.typeOfFilm();
        film.rating(score);
        film.year(year);
        film.function();

    }
}
