package Java.a2Variablen;

public class Brueckenhoehe {

    public static void main(String[] args) {
        
        //EINGABE 
        //Variablen deklarieren
        double weg;
        double gemesseneZeit=1.5;

        //Konstante

        final double    ERDFALLBESCHLEUNIGUNG=9.81;

        


        //VERARBEITEN
        weg=1.0/2 * ERDFALLBESCHLEUNIGUNG * gemesseneZeit * gemesseneZeit;

        //AUSGABE
        System.out.println("Erfallbeschleunigung:\t"+ERDFALLBESCHLEUNIGUNG+"m/s²)");
        System.out.println("Gemessene Zeit:\t\t"+gemesseneZeit+"s");
        System.out.println("Höhe der Brücke:\t"+weg+"m");
    }
    }
