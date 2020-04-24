package learn1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String cuvant , inversat = "";
			System.out.println("Introdu un cuvant : ");
			cuvant = scan.nextLine();
			
			int lungime = cuvant.length();
			
			for (int i = lungime-1 ; i>=0; i--) {
				inversat = inversat + cuvant.charAt(i);
				
				
			}
			if (cuvant.equals(inversat)) {
				System.out.println(cuvant + " este palindrom");
			} else {
				System.out.println(cuvant + " nu este palindrom");
			}
		}
	}
		
		
	}

