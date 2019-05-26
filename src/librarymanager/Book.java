package librarymanager;

import java.io.Serializable;

public class Book implements Serializable {
    //Variables de instancia
    // idbook hace referencia al numero topografico del libro 
    private String title, isbn, editorial, author, idbook;
    private int total;
    private boolean status;
    
    //Contructores
    public Book(String title, String author, String editorial){
        this.title     = title;
        this.editorial = editorial;
        this.author    = author;
        this.status    = true;
        
    }
    public Book(String title, String isbn, int total, String author, String editorial){
        this.title     = title;
        this.total     = total; 
        this.isbn      = isbn;
        this.author    = author;
        this.editorial = editorial;
        this.status    = true;
        this.setIdBook();
    }
    
    //Metodos Getters
    public String getTitle(){
        return this.title;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public int getTotal(){
        return this.total;
    }
    
    public boolean getStatus(){
        return this.status ;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getEditorial(){
        return this.editorial;
    }
    
    public String getIdBook(){
        return this.idbook;
    }
    // Metodos Setters
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
    
    public void setStatus(){
        this.status  = !this.status;
    }
    
    public void setAutor(String author){
        this.author = author;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public void setIdBook(){
        this.idbook = this.author.substring(0, 1) + this.editorial.substring(0, 1) + this.isbn.substring(5,8) + (int) ((Math.random()*(999-100))+100);
    }
    
    //Busqueda de libre ( completar)
    public Book search(String idbook){
        if(this.idbook.equals(idbook)){
            return this;
        }
        return null;
    }   
}