
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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
public class ReadObjects {
    
    public static void main(String[] args) {
        
    ArrayList<Person> peopleList = new ArrayList<>();
        
    try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("text.ser"))) {
        System.out.println("Reading objects...");
        
        peopleList = (ArrayList<Person>) in.readObject();
        System.out.println(peopleList);
        
        System.out.println(peopleList.get(2));
    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
