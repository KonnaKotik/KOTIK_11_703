package ru.itis;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InitializeException {
        String input = "x125:=123;x2:=5;x3:=x2+x125;a1:=x3;";
        Compiler compiler = new Compiler();
        compiler.analyse(input);
        ArrayList<Variable> arrayList =(ArrayList<Variable>) compiler.process(input);
        for(Variable v: arrayList){
            System.out.print(v.toString());
        }
    }
}
