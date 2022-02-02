package control;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        String character = "g";
        switch (character) {
            case "á" :
                System.out.println("a");
                break;
            case "é" :
                System.out.println("e");
                break;
            case "ó" :
            case "ő" :
            case "ö" :
                System.out.println("o");
                break;
            default :
                System.out.println(character);

        }

        Scanner scanner = new Scanner(System.in);//Scannerrel bekérjük az adatokat
        String exit = "exit";                    //Változó létrehozása
        while(!exit.equals("x")) {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            exit= scanner.nextLine();
        }
    }


}
