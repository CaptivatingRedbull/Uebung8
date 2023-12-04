package Aufgabe1;

public abstract class Kfz {
    private int leistung;
    private String kennzeichen;
    Kfz(String kennzeichen, int leistung){
        this.kennzeichen = kennzeichen;
        this.leistung = leistung;
    }
    public int getLeistung() {
        return leistung;
    }
    public String getKennzeichen() {
        return kennzeichen;
    }

    abstract public void print();

}
