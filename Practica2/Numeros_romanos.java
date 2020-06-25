import java.util.Scanner;

public class Numeros_romanos{
    public static String convertirANumerosRomanos(int numero) {
        int i, miles, centenas, decenas, unidades;
        String romano = "";
        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        for (i = 1; i <= miles; i++) {
            romano = romano + "M";
     }
     if (centenas == 9) {
        romano = romano + "CM";
    } else if (centenas >= 5) {
               romano = romano + "D";
               for (i = 6; i <= centenas; i++) {
                    romano = romano + "C";
               }
    } else if (centenas == 4) {
               romano = romano + "CD";
    } else {
               for (i = 1; i <= centenas; i++) {
                    romano = romano + "C";
           }
    }
    if (decenas == 9) {
        romano = romano + "XC";
    } else if (decenas >= 5) {
               romano = romano + "L";
               for (i = 6; i <= decenas; i++) {
                    romano = romano + "X";
               }
    } else if (decenas == 4) {
               romano = romano + "XL";
    } else {
               for (i = 1; i <= decenas; i++) {
                    romano = romano + "X";
               }
    }
    if (unidades == 9) {
        romano = romano + "IX";
    } else if (unidades >= 5) {
               romano = romano + "V";
               for (i = 6; i <= unidades; i++) {                                                           
                    romano = romano + "I";
               }
    } else if (unidades == 4) {
               romano = romano + "IV";
    } else {
               for (i = 1; i <= unidades; i++) {
                    romano = romano + "I";
               }
    }
    return romano;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero;

        do {
            System.out.print("Introduce un número entre 1 y 999: ");
            Numero = sc.nextInt();
     } while (Numero < 1 || Numero > 999);
     System.out.println(Numero + " en numeros romanos -> " + convertirANumerosRomanos(Numero));                            
 
    }
}