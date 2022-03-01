/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univ;

/**
 *
 * @author Santosh
 */
public class Tester2 {
    public static void main(String[] args) {
        Person p1 = new Person(01, "Sai Santosh Raju Prathigadapa");
        Student s1 = new Student(20074376, "Sai Santosh Raju Prathigadapa", "Advanced Computer Science");
        s1.setInternational();
        Lecturer l1 = new Lecturer(501, "Hui Cheng", "Computer Science", 1000);
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(l1.toString());

    }
}
