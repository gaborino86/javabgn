package product;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Product {
//Változók
    private String name;
    private int price;
//Értékeket adunk nekik
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
//Lekérjük őket
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
//Növeljük
    public void increasePrice(int amount) {
        this.price = this.price + amount;
    }
//Csökkentjük
    public void decreasePrice(int amount) {
        this.price = this.price - amount;
    }
//    psvm
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Szia! Adj meg egy terméket!");
        String name = scanner.nextLine();
//        System.out.println("Az általam megadott termék neve: " + name);

        System.out.println("Szia! Adj meg egy értéket!");
        int price =scanner.nextInt();
        scanner.nextLine();
//        System.out.println("Az általam megadott termék neve: " + price);

        Product product = new Product(name, price);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.increasePrice( 15);
        System.out.println(product.getPrice());

        product.decreasePrice(12);
        System.out.println(product.getPrice());

    }
}
