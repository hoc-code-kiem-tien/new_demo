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
public class StudentList {

    private ArrayList<Student> list;
    Scanner sc = new Scanner(System.in);
    
    public StudentList() {
        list = new ArrayList<>();
        list.add(new Student("00001", "Nguyen Thi Tu Anh", 7, 8));
        list.add(new Student("00002", "Pham Van Cuong", 2, 5));
        list.add(new Student("00003", "Tran Van Hung", 8, 5));
        list.add(new Student("00004", "Huynh Thanh Tu", 6, 8));
    }

    public void showAll() {
        System.out.println("---SHOWS ALL STUDENTS---");
        System.out.println("+-----+-------+-------------------------+------+------+------+");
        System.out.println("| No. |ID     |FullName                 |Math  |Lit   |GPA   |");
        int no = 1;
        for (Student sv : list) {
            System.out.println("+-----+-------+-------------------------+------+------+------+");
            System.out.printf("|%5d", no);
            sv.getInfo();
            no++;
        }
        System.out.println("+-----+-------+-------------------------+------+------+------+");
    }

    public void getStudentsMaxGPA() {
        System.out.println("The best student of this class is/are: ");
        //Buoc 1: tim maxGPA
        double maxGPA = list.get(0).getGPA();
        for (Student sv : list) {
            if (sv.getGPA() > maxGPA) {
                maxGPA = sv.getGPA();
            }
        }
        //maxGPA = 7.5
        int i = 1;
        for (Student sv : list) {
            if (sv.getGPA() == maxGPA) {
                System.out.println(i++ + ". " + sv.getFullName() + "(GPA: " + sv.getGPA() + ")");
            }
        }
    }
    
    public void addNewStudent(){
        String id, fullName;
        double math, literature;
        int pos;
        do{
            id = getString("Enter ID: ");
            pos = searchStudentById(id);
            if(pos != -1){
                System.out.println("This id exsit!");
            }
        }while(pos != -1);
        fullName = getString("Enter fullName: ");
        System.out.print("Enter Math: ");
        math = Double.parseDouble(sc.nextLine());
        System.out.print("Enter literature: ");
        literature = Double.parseDouble(sc.nextLine());
        list.add(new Student(id, fullName, math, literature));
        System.out.println("Added successful!");
    }

    public int searchStudentById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }

    public void searchStudent(){
        String id = getString("Enter id to search: ");
        int pos = searchStudentById(id);
        if(pos == -1){
            System.out.println("Not found!");
        }else{
            list.get(pos).getInfo();
        }
    }
    
    public String getString(String iMsg) {
        String str;
        while(true){
            System.out.print(iMsg);
            str = sc.nextLine();
            if(!str.isEmpty()){
                return str;
            }else{
                System.out.println("Not Empty!");
            }
        }
    }
}
