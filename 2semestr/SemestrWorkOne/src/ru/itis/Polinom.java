package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Polinom {

    private LinkedList<Monom> list;

    public Polinom(String filename) throws IOException {

        list = new LinkedList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        int countMonom = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countMonom; i++) {
            String[] monomData = reader.readLine().split(" ");
            Monom m = new Monom(Integer.parseInt(monomData[0]), Integer.parseInt(monomData[1]));
            list.add(m);
        }

        sort(list);

    }

    public String monomToString(Monom monom) {
        StringBuilder builder = new StringBuilder();

        if (monom.coef == 0) return null;

        if (monom.deg == 0) return String.valueOf(monom.coef);

        builder.append(monom.coef).append(monom.deg == 1 ? "x" : "x^" + monom.deg);
        return builder.toString();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            Monom current = list.get(i);
            String monom = monomToString(current);
            builder.append(monom == null ? "" : monom + " + ");
        }
        builder.delete(builder.length() - 3, builder.length() - 1);
        return builder.toString();
    }

    public void insert(int coef, int deg) {
        Monom newMonom = new Monom(coef, deg);
        list.add(newMonom);
        sort(list);
        combine();
    }

    public List<Monom> monoms() {
        return list;
    }

    public void combine() {
        for (int i = 0; i < list.size() - 1; i++) {
            Monom monom = list.get(i);
            Monom monomNext = list.get(i + 1);
            if (monom.deg == monomNext.deg) {
                monom.coef += monomNext.coef;
                list.remove(i+1);
                i = i - 1;
            }
        }
    }

    public void delete(int deg) {
        combine();
        for (int i = 0; i < list.size() - 1; i++) {
            Monom currentList = list.get(i);
            if (currentList.deg == deg) {
                list.remove(i);
            }
        }

    }

    public void sum(Polinom p) {
        list.addAll(p.monoms());
        sort(list);
        combine();
    }

    public void derivate() {
        for (int i = 0; i < list.size(); i++) {
            Monom current = list.get(i);
            if (current.deg == 0) {
                current.coef = 0;
            } else {
                current.coef *= current.deg;
                current.deg--;
            }

        }

    }

    public int value(int x) {
        int result = 0;

        for(int i = list.size() - 1; i >=0; i--){
            Monom current = list.get(i);
            result = (result + current.coef ) * x;
        }
        return result;

    }

    public void deleteOdd() {
        for (int i = 0; i < list.size();) {
            Monom current = list.get(i);
            if(current.coef % 2 != 0) {
                list.remove(i);
            }
            else{
                i++;
            }
        }
    }

    public void sort(LinkedList list) {
        for(int i = list.size() - 1; i >= 0; i-- ){
            for(int j = 0; j < i; j++){
                Monom current1 = this.list.get(j);
                Monom current2 = this.list.get(j+1);
                if (current1.deg < current2.deg ) {
                    int tDeg = current1.deg;
                    int tCoef = current1.coef;
                    current1.deg = current2.deg;
                    current2.deg = tDeg;
                    current1.coef = current2.coef;
                    current2.coef = tCoef;
                }
            }
        }
    }



}
