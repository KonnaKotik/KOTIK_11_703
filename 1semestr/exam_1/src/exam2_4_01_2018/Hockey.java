package exam2_4_01_2018;

public class Hockey extends Ice implements Competition{

    @Override
    public void competition(int n){
        System.out.println("I scored " + n + " points");
    }

}
