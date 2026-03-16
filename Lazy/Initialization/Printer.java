package Lazy.Initialization;

public class Printer {

    private static Printer instance;

    private Printer() {
        System.out.println("Lazy Initialization is Printer Created");
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }

        return instance;
    }

}
