package Aufgabe1;

public class Lkw extends Kfz{
    private int zulaessigesGesamtGewicht;
    Lkw(String kennzeichen, int leistung, int zulaessigesGesamtGewicht){
        super(kennzeichen, leistung);
        this.zulaessigesGesamtGewicht = zulaessigesGesamtGewicht;
    }

    public void print() {
        System.out.println("LKW");
        System.out.println("Leistung: " + this.getLeistung());
        System.out.println("Kennzeichen: " + this.getKennzeichen());
        System.out.println("Zulässiges gesamt Gewicht: " + zulaessigesGesamtGewicht);
    }
}
