
package TecnicasDeProgramacion;

import java.util.Scanner;
        
public class E1Secuencial {
    
    public static void main (String args[]){
        
        int primerNumero, segundoNumero;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        primerNumero = entradaTeclado.nextInt();
        
        System.out.print("Ingrese segundo numero: ");
        segundoNumero = entradaTeclado.nextInt();
        
        System.out.println("La suma de los numeros es: " + primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
        
    }
}
