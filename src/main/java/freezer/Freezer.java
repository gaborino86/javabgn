package freezer;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> fridge = new ArrayList<>();
        //Elemek hozzáadása
        fridge.add("Tej");
        fridge.add("Tejföl");
        fridge.add("Sajt");
        fridge.add("Margarin");
        fridge.add("Joghurt");
        System.out.println(fridge);

        fridge.remove(2);
        fridge.remove(3);
        System.out.println(fridge);
    }


}
