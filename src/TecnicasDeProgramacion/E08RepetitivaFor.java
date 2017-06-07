
package TecnicasDeProgramacion;

import java.util.Scanner;
        
public class E08RepetitivaFor {

    public static void main (String args[]){
        
        float numero, total=0;
        Scanner entradaTeclado = new Scanner(System.in);
        
        for (int i=1;i<=4;i++){
            System.out.print("Ingrese numero " + i + ": ");
            numero = entradaTeclado.nextFloat();
            total= total +numero;
        }
        System.out.println("El promedio de los numero es: " + total/4);
    }
    
}
