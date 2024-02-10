/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_teacher;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class Teacher {
    private String name;
    private double salary;

    public Teacher() {
    }
    public Teacher(String iName, double iSalary){
        name = iName;
        salary = iSalary;
    }
    public String getName(){
        return name.toUpperCase();
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double iSalary){
        salary = iSalary;
    }

    @Override
    public String toString() {
        return name + " " + getSalary();
    }

    
    
}
