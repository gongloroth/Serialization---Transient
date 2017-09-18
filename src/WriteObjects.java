
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oiyo
 */
public class WriteObjects {
    
    public static void main(String[] args) {
        
        Person[] people = {new Person(0,"John"),new Person(1,"Jack"),new Person(2,"Jacob")};
        
        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));
        
        Person.setCount(25);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text.ser"))){
            
            System.out.println("Writing objects...");
            out.writeObject(peopleList);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
