/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_pheptoan;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class PhepToan {
    private int a;
    private int b;
    private String info;
    
    public PhepToan(int iA, int iB){
        a = iA;
        b = iB;
    }
    
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public String getInfo(){
        return info;
    }
    public void setA(int iA){
        a = iA;
    }
    public void setB(int iB){
        b = iB;
    }
    public void setInfo(String iInfo){
        info = iInfo;
    }
    public void add(){
        info = a + "+" + b + "=" + (a+b);
    }
    public void sub(){
        String iInfo = a + "-" + b + "=" + (a-b);
        setInfo(iInfo);
    }
    public void mul(){
        setInfo(a + "*" + b + "=" + (a*b));
    }
    public void div(){
        setInfo(a + "/" + b + "=" + (a/b));
    }
}
