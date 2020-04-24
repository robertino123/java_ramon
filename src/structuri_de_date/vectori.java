
package structuri_de_date;

import java.util.Scanner;


public class vectori {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduceti nr de elemente : ");
        
        int n = scan.nextInt();
        int mult = 1 ; 
        int sum = 0;
        int index = 0;
        int[] vector = new int[n];
        System.out.println("Vectorul este : ");
        for (int i = 0; i < vector.length; i++){
            System.out.print("V["+i+"] = ");
            vector[i] = scan.nextInt();
            
            while(index < vector.length ){
                sum += vector[i];
                index++;
            }
             
            
            
        }
        System.out.println("Suma elementelor  = " + sum);
        System.out.println("Media aritmetica a elementelor = " + sum/(vector.length));
        System.out.println("Inmultirea elementelor  = " + mult);
    }
}
