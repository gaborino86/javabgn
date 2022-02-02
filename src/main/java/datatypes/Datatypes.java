package datatypes;

import product.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Datatypes {

    public static void main(String[] args) {
        int number = 12;
        int another = (int) 12.8;
        double otherNumber= 3.4;
        boolean a = true;
        boolean b = false;
        char c = 'a';

        String text = "alma";
        String word = "";
        String apple = 1 + "db" + " " + "Jonathán " + text + "" +" finom";
//        System.out.println(apple);

        boolean boo = text.equals("alma");
        System.out.println(boo);

        boolean bool = text.equals("körte");
        System.out.println(bool);

//        System.out.println("alma ".length());
//        System.out.println("alma".indexOf("lm"));
//        System.out.println("alma".indexOf("x"));
//2-es karaktertől írja ki
//        System.out.println("almakörte ".substring(2));
//2-3-4-5 karaktereket írja ki
//        System.out.println("almakörte ".substring(2, 6));
//Sortörés
//        System.out.println("alma\nkörte");

//Dátum
        LocalDate date = LocalDate.of(2022,1,31);
        System.out.println(date);
        LocalTime time = LocalTime.of(15,50);
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.of(2022,01,31,15,51);
        System.out.println(datetime);




        Product product = new Product("Kifli", 25);
        Scanner scanner = new Scanner(System.in);

        Product anotherProduct = null;
        anotherProduct = product;

//        System.out.println(number==another);


    }
}
