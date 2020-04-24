package learn1;

public class Metode2 {

	public static void main(String[] args) {
		
		int rez = putere(2,4);
		
		System.out.println(rez);
		System.out.println(numaruldecifre(1234));
		System.out.println(inversarenr(2345));
		System.out.println(numarcuvinte("“Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus est odio, auctor eget massaquis,                               rhoncus porttitor est. Nunc eleifend malesuada mattis. Praesent sed lacinia urna. Integer non                           tincidunt justo. Duis nunc sapien, mattis sagittis felis vulputate, pharetra porta ante. Aliquamtortor                             ligula, pulvinar vitae ligula eu, efficitur tincidunt eros. Curabitur vitae lectus quis est elementum                             egestas. Vestibulum pulvinar nulla arcu, eu dignissim ante ornare vitae. Donec porta purus enim, a                               venenatis nisl luctus non. Curabitur porta fermentum elit sed rutrum. Ut vitae gravida velit, sed                               dictum eros. Pellentesque vel varius nisl. Fusce eget convallis urna.”  "));
	}

	public static int putere(int x, int putere) {
		int rezultat = (int)Math.pow(x, putere);
		
		return rezultat;
	}
	
	public static int numaruldecifre(int numar) {
		int count = 0;
		
		while(numar!=0) {
			numar = numar/10;
			count++;
		}
		
		return count;
	}
	
	public static int inversarenr(int numar) {
		int reverse = 0  ;
		while (numar != 0 ) {
			reverse = reverse * 10;
			reverse = reverse + numar%10 ;
			numar = numar/10;
		}
		return reverse; 
	}
	
	public static int numarcuvinte(String text) {
		int count = 0 ; 
		for (int i =0; i<text.length()-1;i++) {
			if(text.charAt(i)==' ' && text.charAt(i+1)!= ' ') {
				count++;
			}
		}
		return count;
		
	}
}
