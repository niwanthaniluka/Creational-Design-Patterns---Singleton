package SingletonEager;

public class Printer {

    private static final Printer instance = new Printer();
    //final නිසා මෙම instance එක පසුව වෙනස් කළ නොහැක.


    //defualt Constructor
    private Printer() {
        System.out.println("Printer object created");
    }

    //Global access point
    public static Printer getInstance() {
        return instance;
    }
}

