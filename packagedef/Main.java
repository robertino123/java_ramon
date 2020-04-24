package packagedef;

public class Main {

	

	public static void main(String[] args) {
		Person A = new Person();
		Person B = new Person(20,"Andrei");
		System.out.println("This person is " + A.nume + " which has " + A.getAge() + " years old");
		System.out.println("This person is " + B.nume + " which has " + B.varsta + " years old");
	
	
		A.setAge(23);
		System.out.println(A);
	}
	
	
	
}
