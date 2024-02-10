/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_teacher;

import java.util.Scanner;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class CE000000_Teacher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (String s : str) {
            String w[] = s.split("-");
            String name = w[1];
            double salary = Double.parseDouble(w[2]);
            Teacher t = new Teacher(name, salary);
            if(w[0].equalsIgnoreCase("1")){
                System.out.println(t.getName());
            }else if(w[0].equalsIgnoreCase("2")){
                double newSalary = Double.parseDouble(w[3]);
                t.setSalary(newSalary);
                System.out.println(t.getSalary());
            }else if(w[0].equalsIgnoreCase("3")){
                System.out.println(t.toString());
            }
        }
    }
    
}
