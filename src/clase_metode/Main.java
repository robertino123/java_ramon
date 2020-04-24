
package clase_metode;

public class Main {

    
    public static void main(String[] args) {
        Produs produs1 = new Produs("Laptop", 999.99, 12);
        Produs produs2 = new Produs("PC", 1200.99, 65);
        Produs produs3 = new Produs("TV", 1700.99, 75);
        Magazin magazin = new Magazin("Altex",produs1,produs2,produs3);
        
        System.out.println(magazin);
        
        System.out.println("Suma totalurilor produselor din magazin : " + magazin.getTotalMagazin());
        
        Punct punct = new Punct();
        Punct punct1 = new Punct(5, 2);
        Punct punct2 = new Punct(4, 6);
        
        System.out.println("Distanta de la punct1 :  " + punct1 + " la punct2 dat :  [2, 5] este : " + punct1.distance(7, 8));
        System.out.println("Distanta de la punct1 : "+punct1+ "la punct2 :"+punct2+" este = "+punct1.distance(punct2));
        
        System.out.println(punct);
        punct.setY(5);
        System.out.println(punct.getX() +"  " + punct);
        
        
    }
    
}
