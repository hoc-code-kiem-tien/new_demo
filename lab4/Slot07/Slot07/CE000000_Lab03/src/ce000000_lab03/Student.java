/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_lab03;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class Student {
    private String id;
    private String fullName;
    private double math;
    private double literature;
    
    public Student(String iId, String iFullName, double iMath, double iLiterature){
        id = iId;
        fullName = iFullName;
        math = iMath;
        literature = iLiterature;
    }
    public String getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public double getMath(){
        return math;
    }
    public double getLiterature(){
        return literature;
    }
    public void setId(String iId){
        id = iId;
    }
    public void setFullNam(String iFullName){
        fullName = iFullName;
    }
    public void setMath(double iMath){
        math = iMath;
    }
    public void setLiterature(double iLiterature){
        literature = iLiterature;
    }
    
    public double getGPA(){
        return (math + getLiterature()) / 2;
    }
    
    public void getInfo(){
        System.out.printf("|%-7s|%-25s|%6.1f|%6.1f|%5.1f|\n",
                id, getFullName(), getMath(), getLiterature(), getGPA());
    }
}
