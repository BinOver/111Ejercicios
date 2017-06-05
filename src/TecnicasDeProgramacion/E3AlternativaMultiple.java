
package TecnicasDeProgramacion;
import java.util.Scanner;

public class E3AlternativaMultiple {
    
    public static void main(String arg[]){
        int alumnos, bancos;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Ingresa cantidad de bancos: ");
        bancos = entradaTeclado.nextInt();
        
        System.out.print("Ingrese cantidad de Alumnos: ");
        alumnos = entradaTeclado.nextInt();
        
        if(bancos < alumnos){
            System.out.println("Se necesitan " + (alumnos - bancos) + " bancos.");
        }else{
            System.out.println("Bancos suficientes");
        }
        
    }
    
}
