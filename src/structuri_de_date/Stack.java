package structuri_de_date;

import java.util.Random;

public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Stack(){
    top = -1;
    }
    
    boolean isEmpty(){
    return (top < 0);
    }
    
    boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("Stiva este plina ! ");
            return false ;
        }
        else {
            a[++top] = x;  
            System.out.println(x + " a fost adaugat in stiva");
            return true;
        }
    } 
    int pop(){
        if(top < 0){
            System.out.println("Stiva este goala");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(isEmpty() == false){
            return a[top];
        }
        return -9999;
    }
    public static void main(String[] args){
    Stack s = new Stack();
    
    Random rand = new Random();
    
    for(int i = 0; i<100; i++){
        s.push(rand.nextInt(100));
    }
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    
}
