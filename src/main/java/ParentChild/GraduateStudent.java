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
public class GraduateStudent extends Student{
    private String type;
    public GraduateStudent (String type, int studentID, String firstName, String lastName){
        super (studentID, firstName, lastName);
        this.type = type;       
    }
    
}
