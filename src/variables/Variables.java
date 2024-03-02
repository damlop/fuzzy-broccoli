
package variables;

import java.io.*;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Variables {
    
     
    public static void main(String[] args) {
       String buffer;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hola.txt"));
            writer.write("Hola mundo.");
            writer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Variables.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            BufferedReader reader = new BufferedReader(new FileReader("hola.txt"));
            buffer = reader.readLine();
            System.out.println(buffer);
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Variables.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }


    
}
