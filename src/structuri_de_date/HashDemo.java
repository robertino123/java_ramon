
package structuri_de_date;

import java.util.HashMap;
import java.util.Map;


public class HashDemo {
    public static void main(String[] args){
        HashMap<String, Double> dictionar = new HashMap();
        
        dictionar.put("Ana", 3434.34);
        dictionar.put("Alex", 123.22);
        dictionar.put("Dan",1378.00);
        dictionar.put("Ion", 99.22);
        dictionar.put("Claudiu", -19.08);
        
       for(Map.Entry<String, Double> entry : dictionar.entrySet()){
           System.out.println(entry.getKey() + ": ");
           System.out.println(entry.getValue());
       } 
       
       double valoareCont = dictionar.get("Ion").doubleValue();
       dictionar.put("Ion", valoareCont + 1000);
        System.out.println("Noul cont al lui Ion : " + dictionar.get("Ion"));
       
        
        
        
        
        
        
    }
}
