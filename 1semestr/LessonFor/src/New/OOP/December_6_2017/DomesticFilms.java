package New.OOP.December_6_2017;

public class DomesticFilms implements Film{


    @Override
    public void typeOfFilm() {
        System.out.println("This is domestic film");
    }

    public void rating(int score){
        System.out.println("rating " + score + " / 10");
    }

    public void production() {
        System.out.println("production: Russia");
    }

    public void year(int year) {
        System.out.println(year + " - release year");
    }

    public void output(String name){
        System.out.println(name);
    }
}
