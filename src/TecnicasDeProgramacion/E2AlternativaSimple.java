package TecnicasDeProgramacion;

import java.util.Scanner;

public class E2AlternativaSimple {
    
    public static void main (String args[]){
        
        String password;
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        do{
        System.out.print("Ingrese contraseña: ");
        password = entradaTeclado.next();
        }while (!(password.matches("[a-zA-Z0-9]*")));
        
        if (password=="Correctpassword"){
            System.out.println("Password Correcto");
        }else{
            System.out.println("Password Incorrecto");
        }
    }
}
