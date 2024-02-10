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
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("00001", "Nguyen Thi Tu Anh", 8, 7);
        list.add(s1);
        list.add(new Student("00002", "Pham Van Cuong", 2, 5));
        list.add(new Student("00003", "Tran Van Hung", 8, 5));
        list.add(new Student("00004", "Huynh Thanh Tu", 6, 9));
        int op;
        do{
            System.out.println("---STUDENT MANAGEMENT---");
            System.out.println("1. Adds new student.");
            System.out.println("2. Shows all students.");
            System.out.println("3. Quit.");
            System.out.print("Please select a function: ");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    String str;
                    do{
                        System.out.println("---ADDS NEW STUDENT---");
                        System.out.print("Please enter student infomation: ");
                        str = sc.nextLine();
                    }while(str.isEmpty());
                    //str = 000005@Dang Van Lam@9@10
                    String w[] = str.split("@");
                    String id = w[0];
                    String fullName = w[1];
                    double math = Double.parseDouble(w[2]);
                    double literature = Double.parseDouble(w[3]);
                    list.add(new Student(id, fullName, math, literature));
                    System.out.println("Added successful!");
                    break;
                case 2:
                    System.out.println("---SHOWS ALL STUDENT---");
                    System.out.println("+-----+---------------------------------+------+------+-----+");
                    System.out.println("|No.  |ID     |FullName                 |Math  |Lit   |GPA  |");
                    int no = 1;
                    for (Student sv : list) {
                        System.out.println("+-----+---------------------------------+------+------+-----+");
                        System.out.printf("|%5d", no++);
                        sv.getInfo();
                    }
                    System.out.println("+-----+---------------------------------+------+------+-----+");
                    //Buoc 1: maxGPA
                    double maxGPA = list.get(0).getGPA();
                    for (Student sv : list) {
                        if(sv.getGPA() > maxGPA){
                            maxGPA = sv.getGPA();
                        }
                    }
                    //maxGPA = 7.5
                    //Buoc 2:
                    int i = 1;
                    for (Student sv : list) {
                        if(sv.getGPA() == maxGPA){
                            System.out.println(i + ". " + sv.getFullName() + "(GPA: " + sv.getGPA() + ")");
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!!");
                    break;
                default:
                    System.out.println("The function of application must be from 1 to 3!");
            }
        }while(op != 3);
    }
    
}
