package librarymanager;

public class Partner extends Person{
    //Variable de clase  
    public static int i = 1;
    
    //Variable de instancia
    private String idpartner;
    private boolean defaulter;
    
    
    public Partner(String name, String lastname, String dni, String address){
        super(name, lastname, dni, address);
        this.setIdPartner();
        this.defaulter = false;
    }
    
    //Metodos Getters
    public String getIdPartner(){
        return this.idpartner;
    }
    
    public boolean getDefaulter(){
        return this.defaulter;
    }
    
    //Metodos Setters
    public void setIdPartner(){
        String a = Integer.toString(i);
        this.idpartner = "LM-VM-" + a;
        Partner.i++;
    }
    
    public void setDefaulter(){
        this.defaulter = !this.defaulter;
    }
    //Metodo de busqueda
    public Partner search(String dni){
        if(this.getDni().equals(dni))
            return this;   
        else{
            return null;
        }
    }
    @Override
    public void listar(){}
    
}
