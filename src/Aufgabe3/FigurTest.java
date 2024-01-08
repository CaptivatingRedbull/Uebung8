package Aufgabe3;

public class FigurTest {
    public static void main(String[] args) {
        Figur[] figuren = new Figur[5];
        for(int i = 0; i < figuren.length; i++){
            figuren[i] = switch ((int) (Math.random()*3)){
                case 1 -> new Kreis(random20());
                case 2 -> new Rechteck(random20(), random20());
                default -> new Quadrat(random20(), randomFarbe());
            };
        }
        for(int i = 0; i < figuren.length; i++)
            System.out.println("Figur " + (i+1) + ": " + figuren[i].toString());

    }
    public static int random20(){   //Zahl zwischen 1 und 20
        return ((int) (Math.random()*20));
    }

    public static String randomFarbe(){
        return switch ((int) (Math.random() * 5)) {
            case 1 -> "Rot";
            case 2 -> "Gelb";
            case 3 -> "Blau";
            case 4 -> "Schwarz";
            case 5 -> "Gruen";
            default -> "Weiss";
        };
    }
}
