/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univ;

/**
 *
 * @author sp21acg
 */
public class Person {
    
    public int idNumber;
    public String name;
    
    public Person(int id, String name)
    {
        this.idNumber = id;
        this.name = name;
    }
    
    public String toString()
    {
        return (this.idNumber + " " + this.name);
    }
    
      /**
    * returns student name as a String
    * @return value returned is student name as a String
    */ 
    public String getName ()
    {
        return name;                                
    }
    
    /**
    * returns student id as an int
    * @return value returned is student id as an int
    */                                                       
    public int getIdNo ()                           
    {
        return idNumber;                           
    }   
}
