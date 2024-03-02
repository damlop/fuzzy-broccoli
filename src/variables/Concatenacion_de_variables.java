
package variables;

import java.util.Scanner;


public class Concatenacion_de_variables {
    public static void main(String[] args) {
    
    Scanner f = new Scanner(System.in);
 
 System.out.print("nombre: ");
 String nombre = f.next();
 System.out.print("apellido: ");
 String apellido = f.next();
 System.out.println("kimi no namae wa " + nombre + " " + apellido +" desu");
 nombre += " " + apellido;
        System.out.println(nombre);
        
        
        int m = 45; 
        int m2 = 5;
        
        m += m2;
        
        System.out.println(m + m2 * 4);
        
        m /= m2;
        
        System.out.println(m);
        
    }        
}
