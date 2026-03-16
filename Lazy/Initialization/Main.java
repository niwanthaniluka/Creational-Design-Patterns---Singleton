package Lazy.Initialization;

public class Main {

    public static void main(String[] args) {

        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
    }
}

