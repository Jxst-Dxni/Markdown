public class KonstanteMitInterface implements Physik {

   public static void main(String[] arges) {


    //Kraftberechnung
    //Eingabe
    double kraft;          //kg* m/s² = N
    double masse=15;       //Einheit kg

    //VERARBEITUNG F=m*a
    kraft = masse * ERDFALLBESCHLEUNIGUNG;

    //Ausgabe
    System.out.println("Kraft:"+kraft+"N");
    System.out.println(LADUNG_ELEKTRONIK+" C");



   } 

    
}