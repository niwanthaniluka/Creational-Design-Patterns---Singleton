package Static_Block_Initialization;

public class Printer {

    private static Printer instance;

    static {
        try {

            instance = new Printer();

        } catch (Exception e) {
            System.out.println("Exception occurred in creating singleton instance: " + e.getMessage());
        }
    }


    private Printer() {
        System.out.println("Printer object created");
    }

    //Access point
    public static Printer getInstance() {
        return instance;
    }

}
