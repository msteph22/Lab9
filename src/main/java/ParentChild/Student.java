/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParentChild;

/**
 *
 * @author stephensmac
 */
public class Student {
    private double studentID;
    private String firstName;
    private String lastName;
    
    public Student(int studentID, String firstName, String lastName ) {
        this.studentID = studentID; 
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(Student stud) {

    }

}
