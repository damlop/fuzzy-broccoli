
package variables;

import java.util.Scanner;

public class entrada_de_datos {
      
    
    public static void main(String[] args) {

    // entrada de datos
    Scanner teclado = new Scanner(System.in);
    // cramos variables
    int edad;
    String nombre;
    float altura;
    // creamos linea para cargar los datos a las variables
    System.out.println("input age");
    edad = teclado.nextInt();
    
    System.out.println("input nombre");
    nombre = teclado.next();
    
    System.out.println("input heigh");
    altura = teclado.nextFloat();
    // creamos la linea para mostrar la variable ingresada
    System.out.println("age =" + edad);
    System.out.println("name =" + nombre);
    System.out.println("heigh =" + altura);
    
}
}
