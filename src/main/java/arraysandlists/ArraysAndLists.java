package arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {
        //Egész számokat tartalmazó tömb létrehozása és példányosítása
        int[] numbers = new int[5];
        int[] numbers2 = new int[]{4, 7, 1, 9, 3};
        int[] numbers3 = {3, 6, 1}; //Literálva való létrehozás
        //1-es indexnek értéket adunk
        numbers[1] = 10;
        numbers[4] = 34;

        numbers2[3] = 100;

/*
        //Tömbök hossza:
        System.out.println(numbers2.length);
        //2-es index elemét lekérjük:
        System.out.println(numbers3[2]);
        //Egész tömb kiiratása
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers));

        //Szöveges tömbök:
        String[] words = new String[3];
        String[] words2 = new String[]{"alma", "körte", "barack"};
        String[] words3 = {"Zebra", "Zsiráf"}; //Literálva való létrehozás
        //0-s indexnek értékét megváltoztatjuk:
        words3[0] = "oroszlán";

        System.out.println(Arrays.toString(words3));


//       Listák létrehozása és példányosítása
        List<String> words = new ArrayList<>();
        //Elemek hozzáadása
        words.add("alma");
        System.out.println(words);
        //Csomagoló osztályok
        //int -> Integer
        //double -> Double
        //boolean -> Boolean
        //char -> Character
        List<Integer> numbs = new ArrayList<>();
        //Elemek hozzáadása
        numbs.add(1);
        numbs.add(3);
        numbs.add(4);
        System.out.println(numbs);
        //Elemek lekérdezése(1-es index)
        System.out.println(numbs.get(1));
        //Elemek törlése
//        numbs.clear();
        //Csak egy elemet töröl
//        numbs.remove(0);
  */
        List<String> words = new ArrayList<>();
        //Elemek hozzáadása
        words.add("Kiss Béla");
        words.add("alma");
        words.add("zsiráf");
        words.add("PC");
        words.add("szó");
        //Menjen végig a lista elemein, ameddig tart az aktuális lista
        for (int i =0; i <words.size(); i++) {
            if (words.get(i).length() > 5) {
                System.out.println(words.get(i));
            }
        }



    }
}
