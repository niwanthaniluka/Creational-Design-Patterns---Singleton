package Bill.Pugh.Singleton;

public class Printer {

    private Printer() {
        System.out.println("Bill Pugh Singleton is Printer created");
    }

    private static class Helper {
        private static final Printer instance = new Printer();
    }

    public static Printer getInstance() {
        return Helper.instance;
    }

}
