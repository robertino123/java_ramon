package structuri_de_date;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Coada {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        
        Random rand = new Random();
        
        for (int i = 0; i < 5; i++){
            q.add(rand.nextInt(100));
        }
        
        System.out.println("Elementele cozii: " +q);
        
        int elementSters = q.remove();
        System.out.println("Elementul eliminat: " +elementSters);
        
        System.out.println(q);
        
        int head = q.peek();
        System.out.println("Primul element din coada: " + head);
        
        int size = q.size();
        System.out.println("Dimensiunea cozii : " + size);
        
        
        
        
        
        
        
    }
    
    
}
