package packagedef;

public class Person {
	int varsta;
	String nume;
	String prenume;
	String sex;
	private int age ; 
	private String fname;
	private String lname;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	Person() {
		varsta = 20;
		nume = "Unknown";
		prenume = "Annonymous";
		sex = null;
		
	}
	
	Person(int varsta, String nume) {
		this.varsta = varsta;
		this.nume = nume;
		this.sex = null;
	}
	
	Person(int varsta, String nume, String prenume, String sex){
		this.varsta = varsta; 
		this.nume = nume;
		this.prenume = prenume;
		this.sex = sex ; 
	}
	
	public void sayHello() {
		System.out.println("Hello, from Person ! ");
	}
	
	public String toString() {
		return "This person's name is : " + this.fname + "and is" + this.age + " years old " ;
	}
}
