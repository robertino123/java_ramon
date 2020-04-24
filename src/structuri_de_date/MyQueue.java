package structuri_de_date;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    /**
     * @return the primul_element
     */
    public int getPrimul_element() {
        return primul_element;
    }

    /**
     * @param primul_element the primul_element to set
     */
    public void setPrimul_element(int primul_element) {
        this.primul_element = primul_element;
    }

    /**
     * @return the ultimul_element
     */
    public int getUltimul_element() {
        return ultimul_element;
    }

    /**
     * @param ultimul_element the ultimul_element to set
     */
    public void setUltimul_element(int ultimul_element) {
        this.ultimul_element = ultimul_element;
    }

    /**
     * @return the total_el_coada
     */
    public int getTotal_el_coada() {
        return total_el_coada;
    }

    /**
     * @param total_el_coada the total_el_coada to set
     */
    public void setTotal_el_coada(int total_el_coada) {
        this.total_el_coada = total_el_coada;
    }
    private  Queue<Integer> MyQueue = new LinkedList<Integer>();
    private final int infinit = 9500;
    private int primul_element;
    private int ultimul_element;
    private int total_el_coada ;

    public MyQueue() {
        this.MyQueue = MyQueue;
        this.primul_element = primul_element;
        this.ultimul_element = ultimul_element;
        this.total_el_coada = total_el_coada;
        
    }
    
    public int getSize(){
        return MyQueue.size() ;
    }
    
    public void enqueue(int valoare){
        MyQueue.add(valoare);
    }
    
    public int dequeue(){
        return MyQueue.remove() ;
    }
    public boolean isEmpoty(){
        if (MyQueue.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Coada : " + MyQueue ; 
    }
    
    
    
    public static void main(String[] args){
        MyQueue coada = new MyQueue();
        
        for(int i = 0 ; i < 50 ; i++){
            coada.enqueue(i);
        }
        
       
            System.out.println(coada);
            System.out.println("Primul element din coada : " + coada.getPrimul_element());
            System.out.println("Numarul de elemente din coada : " + coada.getSize());
            System.out.println("Este coada goala? " + coada.isEmpoty());
            System.out.println("");
    }
    
    
}
