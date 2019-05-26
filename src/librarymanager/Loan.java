package librarymanager;
import java.io.Serializable;
import java.time.LocalDate;

public class Loan implements Serializable {
    //Variables de instancia
    private Partner partner;
    private Book book;
    private LocalDate loandate, returndate;
    
    //Constructor
    public Loan(Partner partner, Book book){
        this.partner = partner;
        this.book = book;
        this.loandate = LocalDate.now();
        this.returndate = loandate.plusDays(3);

    }
    
    //Metodos Getters
    public LocalDate getReturnDate(){
        return this.returndate;
    }
    public LocalDate getLoanDate(){
        return this.loandate;
    }    
    public Partner getSocio(){
        return this.partner;
    }
    
    public Book getLibro(){
        return this.book;
    }
}