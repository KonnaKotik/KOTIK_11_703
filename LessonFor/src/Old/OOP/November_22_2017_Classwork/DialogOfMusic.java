package OOP.November_22_2017_Classwork;

public class DialogOfMusic {
     int
             coust,
             number;

     String
             name,
             sing;

     public DialogOfMusic(){
         this.coust = 0;
         this.name = " ";
         this.number = 0;
         this.sing = " ";
     }

     public DialogOfMusic(int coust, String name, String sing){
         this.coust = coust;
         this.name = name;
         this.sing = sing;
     }

     public void setCoust(int coust) {
         this.coust = coust;
     }

}
