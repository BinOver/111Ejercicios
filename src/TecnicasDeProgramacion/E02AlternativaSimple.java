package TecnicasDeProgramacion;

import java.util.Scanner;

public class E02AlternativaSimple {
    
    public static void main (String args[]){
        
        String password,p="CorrectPassword";
        String usuario,u="Arturo";
        
        Scanner entradaTeclado = new Scanner(System.in);
        
         do{
        System.out.print("Ingrese usuario:  ");
        usuario= entradaTeclado.next();
        }while (!(usuario.matches("[a-zA-Z]*")));
        
        do{
        System.out.print("Ingrese contraseña: ");
        password = entradaTeclado.next();
        }while (!(password.matches("[a-zA-Z]*")));
        
        if (usuario.equals(u) && password.equals(p)){
            System.out.println("Ingreso Concedido");
        }else{
            System.out.println("Ingreso Denegado");
        }
    }
}
