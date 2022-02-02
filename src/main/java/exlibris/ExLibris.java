package exlibris;

public class ExLibris {

    private String nameOfOwner;

    public ExLibris(String name) {
        this.nameOfOwner = name;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public static void main(String[] args) {
        ExLibris stamp = new ExLibris("Kiss József");

        System.out.println(stamp.getNameOfOwner());
    }
}
