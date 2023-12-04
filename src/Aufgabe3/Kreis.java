package Aufgabe3;

public class Kreis extends Figur{
    public Kreis(int radius, String farbe){
        super(radius, 0, farbe);
    }
    public Kreis(int radius){
        super(radius, 0);
    }

    @Override
    public int getFlaeche() {
        return (int)(Math.pow(this.getMas1(), 2) * Math.PI);
    }

    @Override
    public int getUmfang() {
        return (int)(this.getMas1() * 2 * Math.PI);
    }

    @Override
    public String toString() {
        return ("Kreis{" +
                "Radius=" + this.getMas1() +
                ", Farbe='" + this.getFarbe() + "'" +
                ", Umfang=" + this.getUmfang()+
                ", Fläche=" + this.getFlaeche() + "}");
    }
}
