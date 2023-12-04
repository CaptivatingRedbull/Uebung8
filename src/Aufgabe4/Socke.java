package Aufgabe4;

public class Socke implements Sortierbar {
    private int groesse;
    private String farbe;

    public Socke() {
        groesse = ((int) (Math.random() * 20));
        farbe = switch ((int) (Math.random() * 5)) {
            case 1 -> "Rot";
            case 2 -> "Gelb";
            case 3 -> "Blau";
            case 4 -> "Schwarz";
            case 5 -> "Gruen";
            default -> "Weiss";
        };
    }

    @Override
    public int getGroesse() {
        return this.groesse;
    }

    @Override
    public int istGroesser(Sortierbar element) {
        if(element.getGroesse() < this.groesse)
            return 1;
        else if(element.getGroesse() == this.groesse)
            return 0;
        else
            return -1;
    }

}
