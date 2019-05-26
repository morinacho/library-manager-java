package librarymanager;
import java.io.Serializable;

public abstract class Person implements Serializable, Comparable{
    //Variables de instancia
    private String name,
                   lastname,
                   dni,
                   address;
	
    //Contructor
    public Person(String name, String lastname, String dni, String address){
	this.name    = name;
	this.lastname  = lastname;
        this.dni       = dni;
        this.address = address;
        
    }
    
    public Person(String name, String lastname){
        this.name   = name;
        this.lastname = lastname;
    }
	
    //Metodos Getters
    public String getName(){
        return this.name;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getAddress(){
        return this.address;
    }

    //Metodos Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    //Metodo Ordenar Alfabeticamente
    @Override
    public String toString() {
        return this.lastname + " " + this.name;
    }
    
    @Override
    public int compareTo(Object o) {
	Person persona = (Person) o;
        
	if(this.lastname.compareToIgnoreCase(persona.lastname) == 0){
            return this.name.compareToIgnoreCase(persona.name);
        } 
    	else{
            return this.lastname.compareToIgnoreCase(persona.lastname);
        }
    }
    //Listar
    public abstract void listar();
}