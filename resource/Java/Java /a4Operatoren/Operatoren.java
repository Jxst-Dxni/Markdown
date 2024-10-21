package Java .a4Operatoren;

public class Operatoren {
    

public static void main(String[] args) {
    //Eingabe
    double z1 =5;
    double z2 =3;
    int a = 3;
    int b = 2;
    //VERARBEITUNG
    double sum = z1+z2; //Plusoperator
    double dif = z1-z2; //Minusoperator
    double mul = z1*z2; //Multiplikationsoperator
    double div = z1/z2; //Divisionsoperator
    double modulo = z1 % z2; //Rest einer Division
    int zweiR = a>>2; //Bitshift um 2 Stellen nach rechts


    //Ausgabe
    System.out.println(z1+"+"+z2+"="+sum);
    System.out.println(z1+"-"+z2+"="+dif);
    System.out.println(z1+"*"+z2+"="+mul);
    System.out.println(z1+"/"+z2+"="+div);


}


    
}
