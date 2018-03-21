package ru.itis;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMapImp<>();
        map.put("Marsel", "Sidikov");
        map.put("Dasha", "Shagieva");
        map.put("Anita", "Kurova");
        map.put("Irina", "Skripka");
        map.put("Arina", "Kotik");
        map.put("Arina", "Kim");
        map.put("Dasha", "Best");
        map.put("Arina", "Won");

        System.out.println(map.get("Marsel"));
        System.out.println(map.get("Anita"));
        System.out.println(map.get("Irina"));
        System.out.println(map.get("Arina"));
        System.out.println(map.get("Dasha"));

        int i = 0;

    }
}
