
package TecnicasDeProgramacion;

import java.util.Random;

public class E9ArregloBooleano {
    
    public static void main(String args[]){
        
        boolean[] sala  = new boolean[20] ;
        Random ranGen = new Random();
        
        for (int i=0; i<sala.length; i++){
            sala[i] = ranGen.nextBoolean();
        }
        
       for (int i=0; i<sala.length; i++){
            if (sala[i]){
                System.out.println("Asiento " + (i+1) + " se encuentra Ocupado");
            }else{
                System.out.println("Asiento " + (i+1) + " se encuentra Desocupado");
            }
       }
        
    }
    
}
