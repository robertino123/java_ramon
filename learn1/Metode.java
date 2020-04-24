package learn1;

public class Metode {

	public static void main(String[] args) {
		double rez = functie3parametri(4.00, 8.00, 10.00);
		System.out.println(rez);
	}
	
	public static double functie3parametri(double a,double b,double c) {
		double sum = a + b + c ;
				
		if (sum%2 == 0) {
			return 1;
		} else {
			return 0;
		}

	}
}
