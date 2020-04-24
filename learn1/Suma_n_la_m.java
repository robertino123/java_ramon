package learn1;

import java.util.Scanner;

public class Suma_n_la_m {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Introdu primul numar:");
			int startno=scan.nextInt();
			System.out.println("Introdu ultimul numar : ");
			int endno=scan.nextInt();
			scan.close();
			int sum=0;
			
			for (int i= startno; i<=endno; i++) {
				sum += i;
			}
			
			System.out.println("Suma de la "+startno+" la "+endno+" este : " + sum);
		}
	}

}
