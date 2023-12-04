package Aufgabe1;

public class KfzVerwaltung {
    public static void main(String[] args) {
        Lkw lkw = new Lkw("LLFB69", 500, 10000);
        Pkw pkw = new Pkw("LLBD42", 200, 5);
        lkw.print();
        pkw.print();
    }

}
