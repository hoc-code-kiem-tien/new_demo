/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_lab03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class CE000000_Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList listStudent = new StudentList();
        
        int op;
        do{
            System.out.println("---STUDENT MANAGEMENT V1.0---");
            System.out.println("1. Adds new student.");
            System.out.println("2. Shows all students.");
            System.out.println("3. Search student.");
            System.out.println("4. Quit.");
            System.out.print("Please select a function: ");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    listStudent.addNewStudent();
                    break;
                case 2:
                    listStudent.showAll();
                    listStudent.getStudentsMaxGPA();
                    break;
                case 3:
                    listStudent.searchStudent();
                    break;
                case 4:
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                    break;
                default:
                    System.out.println("The function of application must be from 1 to 3!");
            }
        }while(op != 4);
    }
    
}
