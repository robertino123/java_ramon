package learn1;

import java.util.Scanner;

public class piatra_foarfece_hartie {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int decizie = 0 ;
			
			
			
			while (decizie == 0) {

			final int PIATRA = 1 , FOARFECA = 2 , HARTIE = 3 ;
			
			int jucator1 ;
			int jucator2 ; 
			
			System.out.println("Alegeti un numar dupa cum urmeaza : 1- piatra  2 - foarfeca 3 - hartie ");
			System.out.println("PLAYER 1 : piatra(1), foarfeca(2), hartie(3) ?");
			jucator1 = scan.nextInt();
			System.out.println("PLAYER 2 : piatra(1), foarfeca(2), hartie(3) ? ");
			jucator2 = scan.nextInt();
			
			if(jucator1==jucator2) {
				System.out.println("Egalitate ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
				decizie = scan.nextInt();
				if (decizie == 3 ) {
					System.exit(0);
				}
				
				
			} else { 
				switch(jucator1) {
				case PIATRA:
					if (jucator2 == FOARFECA) {
						System.out.println("PLAYER 1 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					} else {
						System.out.println("PLAYER 2 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					}
					break ;
				case FOARFECA:
					if (jucator2 == HARTIE) {
						System.out.println("PLAYER 1 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					} else {
						System.out.println("PLAYER 2 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					}
					break ;
				case HARTIE:
					if (jucator2 == PIATRA) {
						System.out.println("PLAYER 1 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3)");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					} else {
						System.out.println("PLAYER 2 a castigat ! Doriti sa reincepeti ? (da(0) sau nu(3) ");
						decizie = scan.nextInt();
						if (decizie == 3 ) {
							System.exit(0);}
					}
					break ;
				}
			}
			}
		} 
		
		
		
		
		
		
	}
}
