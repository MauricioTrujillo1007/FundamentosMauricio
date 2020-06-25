import java.util.Scanner;

public class Deposito{
    public static int despliegaMenu(){
        int r=0;
        Scanner sca = new Scanner(System.in);
        System.out.println("   MENU   ");
          System.out.println("1.-Retiro");
          System.out.println("2.-Deposito");
          System.out.println("3.-Cambio de NIP");
          System.out.println("4.-Consulta de saldo");
          System.out.println("5.-Donar");
          r = sca.nextInt(); 
        return r;
    }
    public static int retiro(){
        Scanner scan = new Scanner(System.in);
         int saldoI=5000;
         int retiro=5000;
         
   
         
         retiro = saldoI - retiro;
   
         return retiro;
         }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
       
       
        double NIP=1234;
        int NIPMa;
        int saldo=5000;
        double saldof;
        double monto;
        int tarjeta=1234567891;
        int tarjetaMa;
        int si =1;
        int salida=0;
        int respuesta=0;
       
        
        
        System.out.println("Inserte el numero de la tarjeta");
        tarjetaMa = sc.nextInt();
        if (tarjeta == tarjetaMa){
            System.out.println("");
            System.out.println("");
         System.out.println("Digite el Nip");
         System.out.println("");
         System.out.println(""); 
          NIPMa = sc.nextInt();
        if (NIP ==NIPMa){
         NIPMa=despliegaMenu();
         System.out.println("Usted eligio la opcion: "+ NIPMa);
         System.out.println("Digite el monto a depositar");
         monto = sc.nextDouble();
         System.out.println("Usted a digitado"+ monto +"¿Esta seguro?");
         
         System.out.println("SI   NO");
         System.out.println("(1)  (2)");
         respuesta = sc.nextInt(); 
         if (respuesta == 1){
         System.out.println("");
         System.out.println("Operacion realizada");
         saldof = saldo + monto;
         
         System.out.println("saldo actual: " + saldof );
         System.out.println("");
         System.out.println("Desea salir");
         System.out.println("SI  NO");
            System.out.println("(1) (2)");
            
            if (salida <= si){
            
            }else{
             System.out.println("Ya no supe que poner :'(");
            }
        
        
         
        }else{
         System.out.println("NIP incorrecto");
         System.out.println("Bloqueando tarjeta, por favor vaya a su sucursala reponer la tarjeta");
        }
        }else {
         System.out.println("Tarjeta incorrecta");
         System.out.println("Bloqueando tarjeta, por favor vaya a su sucursala reponer la tarjeta");
        }
      }
    }
}