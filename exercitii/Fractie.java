package exercitii;

public class Fractie {
	double numarator;
	double numitor;
	
	
	Fractie (double numarator, double numitor){
		this.numarator = numarator ;
		this.numitor = numitor ; 
	}
	
	Fractie() {
		numarator = 20.0;
		numitor = 34.5;
	}
	
	public double suma2fractii(Fractie otherfract) {
		double a = this.numarator;
		double b = this.numitor;
		double c = otherfract.numarator;
		double d = otherfract.numitor;
		
		return ((a*d)+(c*b))/(b*d);	
	}
	
	public String toString() {
		return this.numarator +"/"+ this.numitor;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Fractie)) {
			return false ;
		}
		Fractie otherfract = (Fractie) o ;
		return this.numarator*otherfract.numitor == otherfract.numarator * this.numitor;
	}
}

