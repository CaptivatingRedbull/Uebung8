package Aufgabe1;

public class Pkw extends Kfz{
    private int sitzplaetze;
    Pkw(String kennzeichen, int leistung, int sitzplaetze){
        super(kennzeichen, leistung);
        this.sitzplaetze = sitzplaetze;
    }
    public void print() {
        System.out.println("PKW");
        System.out.println("Leistung: " + this.getLeistung());
        System.out.println("Kennzeichen: " + this.getKennzeichen());
        System.out.println("Sitzplätze: " + sitzplaetze);

    }
}
