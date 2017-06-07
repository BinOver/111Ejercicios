
package TecnicasDeProgramacion;

import java.util.Scanner;

public class E04AlternativaDoble {
    
    public static void main (String args[]){
        
        int monto;
        String tipo;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese tipo de pago: ");
        tipo = entradaTeclado.next();
        
        System.out.print("Ingrese monto: ");
        monto = entradaTeclado.nextInt();
        
        if (tipo.toLowerCase().equals("contado")){
            System.out.println("El total con descuento es: " + (monto - (monto*0.10)));
        }else{
            System.out.println("El pago no posee descuento ");
        }
        
        
    }
    
}
