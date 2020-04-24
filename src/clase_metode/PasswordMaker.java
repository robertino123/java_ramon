package clase_metode;


public class PasswordMaker {
    
       
    final int MAGIC_NUMBER = 3;
    final String MAGIC_LETTERS = "";
     String firstName;
     String lastName;
     int age; 
    
    PasswordMaker (String firstName, String lastName , int age){
    this.firstName = firstName;
    this.lastName = lastName ; 
    this.age = age ;
    
    }

    public PasswordMaker() {
        firstName = "Robertino";
        lastName = "Popa";
        age = 25 ;
    }
    
    public String toString(){
    return "Componentele parolei :" + "\n" + "Nume: "+firstName+"|  Prenume: "+lastName+"|  Varsta: "+age ;
    }
    ///ultimele 3 litere din fName 
    ///sir random de lungime magicno gen cu randomstr si 
    //un alfabet obt din 10 ca obt rand din 
    // magic str
    
    //sirul format prin conversiala string a numarului
    //age +lung lname 
public String getPassword(){
    
    String last3fromfName = this.firstName.substring(firstName.length()-3);
    int sir = this.age+this.lastName.length();
    String val = String.valueOf(sir);
    
    return last3fromfName + val ;
    
}
public static void main (String[] args){
    
        PasswordMaker parola = new PasswordMaker();
        System.out.println(parola.getPassword());
}

}