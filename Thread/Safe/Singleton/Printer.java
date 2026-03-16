package Thread.Safe.Singleton;

public class Printer {

    private static Printer instance;

    private Printer() {
        System.out.println("Thread Safe Singleton is Printer Created");
    }

    public static synchronized Printer getInstance() {

        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

}
