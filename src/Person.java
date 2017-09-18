
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oiyo
 */
//new line of code

public class Person implements Serializable {
    
    private transient int id;
    private String name;
    
    private static int count;  //static fields cannot be serialized

    public Person(){
        System.out.println("Default constructor.");
    }
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Two-argument constructor.");
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}' + " Count is: " + count;
    }

    

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
    
    
    
    
}
