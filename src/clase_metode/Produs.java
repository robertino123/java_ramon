
package clase_metode;

public class Produs {
    
    String nume;
    double pret;
    int cantitate;
    
    Produs(String nume, double pret, int cantitate){
    this.nume = nume ;
    this.pret = pret;
    this.cantitate = cantitate;
    }
    
    Produs(){
    nume = "Laptop";
    pret = 1143.99;
    cantitate = 3;
    }
    
    public String toString(){
    return "Produs : " + this.nume + ". Pret : " + this.pret +" lei. Cantitate : " + this.cantitate;
    }
    
    public double getTotalProdus(Produs produs){
    double produss = this.cantitate*this.pret;
        return produss;
    }
}
