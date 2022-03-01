/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univ;

/**
 *
 * @author Santosh
 */
public class Lecturer extends Person {
//    private int idNumber;
//    private String name;
    private String department;
    private double salary;
    
    public Lecturer (int id, String n, String dep, double s) {
//        idNumber = id;
//        name = n;
        super(id, n);
        department = dep;
        salary = s;
    }
    
//    public int getIdNo() {
//        return idNumber;
//    }
//    
//    public String getName(){
//        return name;
//    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return (idNumber + " " + name  + " " + department + " £" + salary);
    }
}
