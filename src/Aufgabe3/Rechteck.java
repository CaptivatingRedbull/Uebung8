package Aufgabe3;

public class Rechteck extends Figur{
    public Rechteck(int laenge, int breite, String farbe){
        super(laenge, breite, farbe);
    }

    public Rechteck(int laenge, int breite){
        super(laenge, breite);
    }

    @Override
    public String toString() {
        return ("Rechteck{" +
                "Länge=" + this.getMas1() +
                ", Breite=" + this.getMas2() +
                ", Farbe='" + this.getFarbe() + "'" +
                ", Umfang=" + this.getUmfang()+
                ", Fläche=" + this.getFlaeche() + "}");
    }
}
