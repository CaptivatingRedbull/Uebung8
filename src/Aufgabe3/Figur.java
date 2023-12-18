package Aufgabe3;

public abstract class Figur {
    private int mas1;
    private int mas2;
    private String farbe;
    public Figur(int mas1, int mas2, String farbe){
        this(mas1, mas2);
        this.farbe = farbe;
    }
    public Figur(int mas1, int mas2){
        this.mas1 = mas1;
        this.mas2 = mas2;
        this.farbe = "weiss";
    }

    public int getMas1() {
        return mas1;
    }

    public int getMas2() {
        return mas2;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;this.farbe = farbe;
    }

    public int getFlaeche(){
        return mas1*mas2;
    }
    public int getUmfang(){
        return mas1*2+mas2*2;
    }

    public String toString() {
        return "Figur{" +
                "Mas1=" + mas1 +
                ", Mas2=" + mas2 +
                ", Farbe='" + farbe + "'" +
                ", Umfang=" + getUmfang() +
                ", Flaeche=" + getFlaeche() +
                '}';
    }
}
