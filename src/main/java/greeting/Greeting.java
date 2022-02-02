package greeting;
//A Greeting osztályban a public String greetingToJoe(String name) metódusban adj vissza Hello Joe értéket, ha a paraméterül átadott név Joe, és üres Stringet, ha nem az!
public class Greeting {

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }

    }
//Példányosítás, hogy visszakapjunk értékeket
public static void main(String[] args) {
    Greeting g = new Greeting(); //Példányosítás
    String s = g.greetingToJoe("Béla"); //Metódus meghívása Béla névvel

    System.out.println(s);

    String str = g.greetingToJoe("Joe"); //Metódus meghívása Joe névvel

    System.out.println(str);
}

}
