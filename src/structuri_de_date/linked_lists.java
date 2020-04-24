package structuri_de_date;
import java.util.*;

public class linked_lists {
    
    public static void main(String[] args){
    
    LinkedList<Integer> list = new LinkedList<Integer>();
    
    LinkedList<Integer> listcopy = new LinkedList<Integer>();
    
    list.addFirst(1);
    list.add(4);
    list.add(9);
    list.add(16);
    list.add(25);
    list.add(36);
    list.add(49);
    list.add(64);
    list.add(81);
    list.addLast(100);
    
        System.out.println("Lista contine " + list.size() + " elemente : " + list);

    for(int i = 0 ; i < list.size(); i++){
        
        if (list.get(i)%2 == 0){
            listcopy.add(list.get(i));
            
        }
        }
        System.out.println("Lista formata cu elementele pare :  "+listcopy); 
    
    
    LinkedList<String> prieteni = new LinkedList<String>();
        prieteni.add("Andrei");
        prieteni.add("Bogdan");
        prieteni.add("Ana");
        prieteni.add("Andreea");
        prieteni.add("Marius");
        prieteni.add("Andrei");
        prieteni.add("Bogdan");
        prieteni.add("Ana");
        prieteni.add("Andreea");
        prieteni.add("Marius");
        System.out.println("Lista prieteni :"  + prieteni);
        Collections.reverse(prieteni);
        System.out.println("Lista prietenilor inversata: " + prieteni);
        Collections.sort(prieteni);
        System.out.println("Lista prietenilor sortata  : " +prieteni);
        System.out.println("Nume"+"\t\t"+"Aparitii");
        Set<String> unic = new HashSet<String>(prieteni);
        for(String key : unic){
            
            System.out.println(key + ":"+"\t\t"+ Collections.frequency(prieteni, key) );
        }
                
        
                
                
                }
    }
