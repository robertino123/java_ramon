package clase_metode;

public class Magazin {
    String nume ;
    Produs produs1 = new Produs();
    Produs produs2 = new Produs();
    Produs produs3 = new Produs();
    
    Magazin(String nume, Produs produs1, Produs produs2, Produs produs3){
    this.nume = nume;
    this.produs1 = produs1;
    this.produs2 = produs2;
    this.produs3 = produs3;
    }
    
    public double getTotalMagazin(){
        double produs = produs1.getTotalProdus(produs1)+produs2.getTotalProdus(produs2)+produs3.getTotalProdus(produs3) ;
        return produs;
    }
    
    public String toString(){
    return "Nume magazin : " + this.nume + "\n" +
            "Produse : "+ "\n" + this.produs1 + " ; "+"\n"+ this.produs2 + " ; "+"\n"+ produs3 + " ;";
    }
    
    
}
