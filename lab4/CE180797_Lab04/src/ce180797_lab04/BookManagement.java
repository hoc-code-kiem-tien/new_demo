/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180797_lab04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Nguyen Hoang Dat
 */
public class BookManagement {
    
    // ArrayList với kiểu class Book
    private ArrayList<Book> listEBook;
    Scanner input = new Scanner(System.in);
    
    // Phương thức BookManagement
    public BookManagement() {
        listEBook = new ArrayList<>();
    }
    
    // Phương thức để thêm sách vào thư viện
    public void entryData() {
        String ID, name, author;
        int year, size;
        int pos;
        
        System.out.print("Input ID: ");
        ID = input.nextLine();
        System.out.print("Input name: ");
        name = input.nextLine();
        System.out.print("Input year: ");
        year = input.nextInt(); input.nextLine();
        System.out.print("Input authors: ");
        author = input.nextLine();
        System.out.print("Input size (kilobyte): ");
        size = input.nextInt(); input.nextLine();
        
        // Thêm những biến trên vào các thuộc tính tương tự của các phần tử trong ArrayList listEBook
        listEBook.add(new Book(ID, name, year, author, size));
        
        // Thông báo thêm thành công
        System.out.println("Ebook created and added to list of ebooks successful!");
    }
    
    //Phương thức in ra dữ liệu của các phần tử trong ArrayList listEBook
    public void printData() {
        System.out.println("----------------------------BOOK MANAGEMENT ----------------------");
        System.out.println("| No. | ID    | Name              | Year | Author        | Size  |");
        System.out.println("+-----+-------+-------------------+------+---------------+-------+");       
        for(int i = 0; i < listEBook.size(); i++) {
            System.out.printf("|  %-3d", i+1);
            listEBook.get(i).showInfo();
            System.out.println("\n+-----+-------+-------------------+------+---------------+-------+");
        }
    }
    
    // Phương thức sort sách tăng dần theo size
    public void sort() {
        Collections.sort(listEBook, Comparator.comparingInt(Book::getSize));
    }
    
    // Phương thức tìm sách size lớn nhất
    public ArrayList<Book> biggestSize() {
        ArrayList<Book> b = new ArrayList<>();
        
        int biggest = listEBook.get(0).getSize();
        for(int i = 0; i < listEBook.size(); i++) {
            if(listEBook.get(i).getSize() > biggest)
                biggest = listEBook.get(i).getSize();
        }
        int count = 0;
        for(int i = 0; i < listEBook.size(); i++) {
            if(listEBook.get(i).getSize() == biggest) {
                b.add(listEBook.get(i));
            }
        }
        return b;
    }
    
    // Phương thức trả về index của sách, nếu không có thì trả -1
    public int searchBookByID(String ID) {
        for(int i = 0; i < listEBook.size(); i++)
            if(listEBook.get(i).getID().equals(ID))
                return i;
        return -1;
    }
    
    // Phương thức trả về đối tượng thuộc class Book được tìm thấy. Trả về null nếu không tìm thấy
    public Book searchBookObjectByID(String ID) {
        if(searchBookByID(ID) != -1)
            return listEBook.get(searchBookByID(ID));
        else
            return null;
            
    }
    
    
    
}
