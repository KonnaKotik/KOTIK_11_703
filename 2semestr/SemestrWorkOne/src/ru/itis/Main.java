package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception{
        Polinom polinom = new Polinom("polinom.txt");
        Polinom polinomTwo = new Polinom("polinomTwo.txt");
        System.out.println(polinom.toString()); // 2x^5 + 4x^3 + 45x^3 + 7x^2 + 77x + 32
        polinom.combine();
        System.out.println(polinom.toString()); // 2x^5 + 49x^3 + 7x^2 + 77x + 32
        polinom.insert(22, 2);
        System.out.println(polinom.toString()); // 2x^5 + 49x^3 + 29x^2 + 77x + 32
        polinomTwo.combine();
        System.out.println(polinomTwo.toString()); // 4x^7 + 2x^5 + 52x^3 + 4x^2 + 76x + 32
        polinom.sum(polinomTwo);
        System.out.println(polinom.toString()); // 4x^7 + 4x^5 + 101x^3 + 33x^2 + 153x + 64
        polinom.derivate();
        System.out.println(polinom.toString()); // 28x^6 + 20x^4 + 303x^2 + 66x + 153
        polinom.deleteOdd();
        System.out.println(polinom.toString()); // 28x^6 + 20x^4 + 66x
        polinom.delete(4);
        System.out.println(polinom.toString());  // 28x^6 + 66x
        System.out.println(polinom.value(1)); // 94

    }
}
