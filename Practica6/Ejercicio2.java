import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String TI;
        int N;
        String TP;
        double PA;
        double CA;
        double TO;
        double TOT;
        String respuesta;

        System.out.println("Bienvenido, ¿Que desea? \n");
        System.out.println("   MENU    \n");
        System.out.println("Hamburgesa sencilla........$20.00");
        System.out.println("Hamburgesa doble...........$25.00");
        System.out.println("Hamburgesa triple..........$28.00");
        TI = sc.nextLine(); 
        System.out.println("\n¿Para comer aqui o para llevar?");
        respuesta = sc.nextLine();
        System.out.println("\n¿Cuantas hamburgesas va a querer?");
        N = sc.nextInt();
        System.out.println("\n¿Su pago seria en efectivo o con tarjeta?");
        TP = sc.next();

        if (TI.equals("Hamburgesa sencilla")){
            PA = 20;
            
            if (respuesta.equals("para comer aqui")){
                System.out.println("\nEntendido en un momentos se lo llevamos a su mesa");
            }
            if (respuesta.equals("para llevar")){
                System.out.println("\nEntendido en un momento se le entregara su orden");
            }
            if (TP.equals("efectivo")){
                TO = N * PA;
                System.out.println("\nEl total a pagar seria: "+TO);
            }
            if (TP.equals("tarjeta")){
                TO = N * PA;
                CA = TO * 0.05;
                TOT = TO + CA;
                System.out.println("\nEl total apagar seria: "+TOT);
            }
            System.out.println("\nEso seria todo, vuelva pronto");
        }
        if (TI.equals("Hamburgesa doble")){
            PA = 25;
            
            if (respuesta.equals("para comer aqui")){
                System.out.println("\nEntendido en un momentos se lo llevamos a su mesa");
            }
            if (respuesta.equals("para llevar")){
                System.out.println("\nEntendido en un momento se le entregara su orden");
            }
            if (TP.equals("efectivo")){
                TO = N * PA;
                System.out.println("\nEl total a pagar seria: "+TO);
            }
            if (TP.equals("tarjeta")){
                TO = N * PA;
                CA = TO * 0.05;
                TOT = TO + CA;
                System.out.println("\nEl total apagar seria: "+TOT);
            }
            System.out.println("\nEso seria todo, vuelva pronto");
        }
        if (TI.equals("Hamburgesa triple")){
            PA = 28;
            
            if (respuesta.equals("para comer aqui")){
                System.out.println("\nEntendido en un momentos se lo llevamos a su mesa");
            }
            if (respuesta.equals("para llevar")){
                System.out.println("\nEntendido en un momento se le entregara su orden");
            }
            if (TP.equals("efectivo")){
                TO = N * PA;
                System.out.println("\nEl total a pagar seria: "+TO);
            }
            if (TP.equals("tarjeta")){
                TO = N * PA;
                CA = TO * 0.05;
                TOT = TO + CA;
                System.out.println("\nEl total apagar seria: "+TOT);
            }
            System.out.println("\nEso seria todo, vuelva pronto");
        }
    }
}