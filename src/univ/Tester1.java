/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univ;

/**
 *
 * @author Santosh
 */
public class Tester1 {
    public static void main(String[] args){
        Student s1 = new Student(20074376, "Sai Santosh Raju Prathigadapa", "Advanced Computer Science"); //  
        s1.setInternational();
        System.out.println(s1.toString());
        
        Lecturer l1 = new Lecturer(501, "Hui Cheng", "Computer Science", 1000);
        System.out.println(l1.toString());
        
        Person p1 = s1;
        System.out.println(p1.toString());
    }
}
