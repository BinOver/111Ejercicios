
package TecnicasDeProgramacion;

import java.util.Scanner;

public class E7RepetitivaDoWhile {
    
    public static void main(String args[]){
        int multiplo, hasta, cont=1;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese multiplo: ");
        multiplo = entradaTeclado.nextInt();
        
        System.out.print("Ingrese Hasta: ");
        hasta = entradaTeclado.nextInt();
        
        do{
            System.out.println(multiplo + " * " + cont + " = " + multiplo*cont);
            cont++;
        }while(cont <= hasta);
    }
    
}
