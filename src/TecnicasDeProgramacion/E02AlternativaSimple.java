package TecnicasDeProgramacion;

import java.util.Scanner;

public class E02AlternativaSimple {
    
    public static void main (String args[]){
        
        String password,p="CorrectPassword";
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        do{
        System.out.print("Ingrese contraseña: ");
        password = entradaTeclado.next();
        }while (!(password.matches("[a-zA-Z]*")));
        
        if (password.equals(p)){
            System.out.println("Password Correcto");
        }else{
            System.out.println("Password Incorrecto");
        }
    }
}
