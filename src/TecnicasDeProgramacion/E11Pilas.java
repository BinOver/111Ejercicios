
package TecnicasDeProgramacion;

import java.util.Stack;

public class E11Pilas {
    public static void main (String arg[]){
        
        Stack <Integer> pila = new Stack<Integer>();
        Stack <Integer> pilaRev = new Stack<Integer>();
        
        for (int i=3; i>0; i--){
            pila.push(i);
        }
        
        while (!pila.empty()){
            pilaRev.push(pila.pop());
        }
        
        while (!pilaRev.empty()){
            System.out.println(pilaRev.pop());
        }
    }
}