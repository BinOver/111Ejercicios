
package TecnicasDeProgramacion;

import java.util.Scanner;

public class E10DosArreglos {
    public static void main (String args []){
        
        String[] aula = new String[3];
        int[] bancos = new int[3];
        int alumnos;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        aula[0] = "Azul";
        aula[1] = "Verde";
        aula[2] = "Amarillo";
        
        bancos[0] = 40;
        bancos[1] = 35;
        bancos[2] = 30;
        
        do{
        System.out.print("Ingrese la cantidad de alumnos: ");
        alumnos = entradaTeclado.nextInt();
        }while(alumnos<0 || alumnos>40);
        
        if (alumnos<=bancos[2]){
            System.out.println("El aula asignada es: " + aula[2]);
        }else if(alumnos<=bancos[1]) {
            System.out.println("El aula asignada es: " + aula[1]);
        }else{
            System.out.println("El aula asignada es: " + aula[0]);
        }
        
    }
}
