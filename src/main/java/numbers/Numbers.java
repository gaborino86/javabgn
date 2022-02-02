package numbers;
//A Numbers osztályban a public void printEvenNumbers(int number) metódusban írd ki a konzolra a páros számokat a paraméterül átadott számmal bezárólag!
public class Numbers {
    public void printEvenNumbers(int number) {
        for ( int i = 0; i <= number; i++) {
//Ha páros a szám
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.printEvenNumbers(14);
    }
}
