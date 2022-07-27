/*
Program to Swap Two Numbers
 */
import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Swapping {
    public static void main(String args[])
    {
       int x=4,y=5,t;
       
       t = x;  
       x = y;  
       y = t; 
      FileWriter myWriter;
        try {
            myWriter = new FileWriter("vaishi.txt");
            
           
             myWriter.write("hii i am nikhil ");
             myWriter.write("\nAfter swapping: X= "+x +"  Y= " + y);        
             myWriter.close();
        }
      catch (IOException ex) {
            Logger.getLogger(Swapping.class.getName()).log(Level.SEVERE, null, ex);
}
       System.out.println("After swapping: X= "+x +"  Y= " + y);  
       System.out.println("");  
    }
}
