package exercitii;

public class Maintest {

	public static void main(String[] args) {
		Fractie fractie = new Fractie(6,2);
		Fractie fractie2 = new Fractie(3,7);
		
		Numar numar = new Numar();
		
		
		
		System.out.println(fractie + " " + fractie2);
		
		double rez = fractie.suma2fractii(fractie2);
		
		
		System.out.println("Suma fractiei : " + fractie +  " adunata cu fractia : "+fractie2 + " este = " + rez);
		
		
		
		System.out.println("Suma : " + numar.suma(2, 5, 6));
	}
}
