/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univ;

/**
 *
 * @author Santosh
 */
public class Person {
    public int idNumber;
    public String name;
    
    public Person(int id, String n){
        idNumber = id;
        name = n;
    }
    
    public int getIdNo ()                           
    {
        return idNumber;                           
    } 
    
    public String getName ()
    {
        return name;                                
    }
    
    public String toString(){
        return (idNumber + " " + name);
    }
}
