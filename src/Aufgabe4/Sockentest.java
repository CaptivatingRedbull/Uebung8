package Aufgabe4;

public class Sockentest {
    public static void main(String[] args) {
        Socke[] socken = new Socke[20];
        for(int i = 0; i < socken.length; i++){
            socken[i] = new Socke();
        }
        System.out.println("Unsortiert: ");
        for(Socke socke : socken)
            System.out.println(socke) ;
        System.out.println();


        BubbleSort.sort(socken);

        System.out.println("Sortiert: ");
        for (Socke socke : socken) {
            System.out.println(socke);
        }
        System.out.println();
    }
    
}
