

package TecnicasDeProgramacion;

import java.util.Scanner;

public class E6RepetitivaMientras {
    
    public static void main (String args[]){
        
        int multiplo, hasta, cont=1;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese numero a multiplicar: ");
        multiplo = entradaTeclado.nextInt();
        
        System.out.print("Ingrese valor hasta: ");
        hasta = entradaTeclado.nextInt();
        
        while (cont<=hasta){
            System.out.println(multiplo + " * " + cont + " = " + (multiplo*cont));
            cont++;
        }   
    } 
}
