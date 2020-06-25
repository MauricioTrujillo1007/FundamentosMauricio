import java.util.Scanner;

public class Calificaciones{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String calificacion;
        double mb=10.0, b=8.7, s=6.0, na=5.0;
        double contador=0;
        double suma=0;
    
        System.out.println("Vaya colocando sus calificaciones una por una, si quiere terminar escriba FIN");
        System.out.print("Coloque su calificacion: ");
        calificacion = sc.nextLine();

        while (! calificacion.equals("FIN")){
          switch (calificacion){
            case "MB" : suma += mb ;
            break;

            case "B" : suma += b;
            break;

            case "S" : suma += s;
            break;

            case "NA" : suma += na;
            break;

            default : System.out.println("Esa calificacion no existe");
            break;
          }
           contador ++;

           System.out.print("Coloque su calificacion: ");
           calificacion = sc.nextLine();
        }
        System.out.println("Su promedio es: " +suma/contador);
    }
}