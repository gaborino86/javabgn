package controlstatements;

public class ControlStatements {

    public int getNumber(int number) {
        if (number > 3) {
            return number;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        ControlStatements control = new ControlStatements();
        int result = control.getNumber(35);

        System.out.println(result);

        int x = 4;

        if (x > 2){
            System.out.println("Nagyobb kettőnél");
        } else {
            System.out.println("Kisebb, vagy egyenlő, mint 2");
        }

        for (int i = 0; i <3; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                System.out.println("x");
            }
 //           System.out.println("A");
        }

        for (int i =x; x>2; x--) {
            System.out.println("A");
        }
//WHILE
        int count = 1;
        while (count < 5) {
            System.out.println("Az");
            count++;
        }
//SWITCH
        switch (3) {
            case 1 :
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
