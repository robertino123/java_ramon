
package structuri_de_date;

import java.util.HashMap;
import java.util.Map;


public class HashPrieteni {
    public static void main(String[] args){
        HashMap<String, Integer> prieteni = new HashMap();
        prieteni.put("Andrei", 23);
        prieteni.put("Ion", 15);
        prieteni.put("Marian", 45);
        prieteni.put("Marius", 22);
        prieteni.put("Ionel", 19);
        
        for(Map.Entry<String, Integer> entry : prieteni.entrySet()){
           
            
            
            System.out.println("El este " + entry.getKey() + ". Saluta-l pe " + entry.getKey() + ". Are "+entry.getValue()+" ani si este tot mai fericit pe zi ce trece .");

       }
        
        
    }
    
    
}
