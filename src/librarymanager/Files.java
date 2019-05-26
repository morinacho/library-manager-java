package librarymanager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Files implements Serializable{
    // Variables de instancia
    private File file;
    
    /*
    * Crear un archivo
    * Se pasa por parametro el nombre del archivo y se crea con la extencion 
    * "name".obj en la carpeta file del proyecto
    */
    public Files(String name){
        try{
            file = new File("files/" + name + ".obj");
            file.setReadable(true);
            file.setWritable(true);
        }
        catch(Exception ex){
            System.out.println("Error al crear el archivo: " + name + ex);
        }
    }
    
    /*
    * Escribir el archivo
    * Se recibe por parametro el objeto que se quiere guardar en el archivo
    * se escribe el archivo y se cierra 
    */
    public void writeFile(Object object) throws FileNotFoundException{
        try (FileOutputStream fileOutput = new FileOutputStream(this.file)){
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            
            objectOutput.writeObject(object);
            objectOutput.close();
        }
        catch(Exception ex){
            System.out.println("Error al escribir archivo\n Codigo de error: " + ex);
        }
    }
    
    /*
    * Leer un archivo
    * Se recibe por parametro el nombre del archivo que se quiere leer
    */
    public List readFile(String name) throws IOException{
        if ("partners".equals(name)) {
            List <Partner> socio = null;
            
            try{
                  FileInputStream fileInput     = new FileInputStream(this.file);
                  ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                  
                  socio = (ArrayList<Partner>) objectInput.readObject();
                  fileInput.close();
                  objectInput.close();
                  
            }
            catch (FileNotFoundException | ClassNotFoundException ex) {
                    Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
              return socio;  
        }
        else if ("books".equals(name)) {
            List <Book> book = null;
            
            try{
                  FileInputStream fileInput     = new FileInputStream(this.file);
                  ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                  
                  book = (ArrayList<Book>) objectInput.readObject();
                  fileInput.close();
                  objectInput.close();
                  
            }
            catch (FileNotFoundException | ClassNotFoundException ex) {
                    Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
              return book;  
        }
        else if ("loans".equals(name)) {
            List <Loan> prestamo = null;
            
            try{
                  FileInputStream fileInput     = new FileInputStream(this.file);
                  ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                  
                  prestamo = (ArrayList<Loan>) objectInput.readObject();
                  fileInput.close();
                  objectInput.close();
                  
            }
            catch (FileNotFoundException | ClassNotFoundException ex) {
                    Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
              return prestamo;  
        }
        else{
            return null;
        }
    }    
}