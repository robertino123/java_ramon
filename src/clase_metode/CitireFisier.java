package clase_metode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jdk.jfr.events.FileWriteEvent;

public class CitireFisier {
    
     public static void main(String[] args) throws IOException{
     
       String currentDir = System.getProperty("user.dir");
         System.out.println("Working dir : " + currentDir);
         
         FileReader in = null ; 
         FileWriter out = null ;
         
         try {
             in = new FileReader("input.txt");
             out = new FileWriter("output.txt");
             
             String dateFisier = new String(); 
             int c ; 
             char tmp; 
             while((c = in.read()) != -1 ){
             tmp = (char) c ;
             
             dateFisier += String.valueOf(tmp);
             
             }
             dateFisier += "NOI DATE LA SFARSIT"; 
             out.write(dateFisier);
         } catch (FileNotFoundException e) {
             System.err.println(e.getMessage());
         } finally {
             if (in != null) {
             in.close();
             }
             if (out != null){
             out.close();
             }
         }
         
     }
           
}
