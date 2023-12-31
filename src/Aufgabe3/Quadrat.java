package Aufgabe3;

public class Quadrat extends Figur{
    public Quadrat(int kantenlaenge){
        super(kantenlaenge, kantenlaenge);
    }
    public Quadrat(int kantenlaenge, String farbe){
        super(kantenlaenge, kantenlaenge, farbe);
    }

    @Override
    public String toString() {
        return ("Quadrat{" +
                "Kantenlänge=" + this.getMas1() +
                ", Farbe='" + this.getFarbe() + "'" +
                ", Umfang=" + this.getUmfang()+
                ", Fläche=" + this.getFlaeche() + "}");
    }
}
