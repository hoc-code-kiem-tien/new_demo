/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180797_lab04;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Hoang Dat
 */

public class CE180797_Lab04 {

    // Method in ra menu
    public static void showMenu() {
        System.out.println("----- BOOK MANAGEMENT -----");
        System.out.println("1. Adds new book.");
        System.out.println("2. Shows all books.");
        System.out.println("3. The biggest size book.");
        System.out.println("4. Search a book by ID.");
        System.out.println("5. Sort the list of books ascending by size.");
        System.out.println("6. Quit.");
        System.out.print("Please select a function:");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        BookManagement book = new BookManagement();
        do {
            // Gọi method để in ra menu
            showMenu();
            int option = input.nextInt(); // Biến lưu lựa chọn
            input.nextLine(); // Xóa \n trong buffer
            // Xét các lựa chọn để xử lý tương ứng
            switch (option) {
                case 1:
                    System.out.println("----- Add new ebook -----");
                    book.entryData();
                    break;
                case 2:
                    book.printData();
                    break;
                case 3:
                    System.out.println("| No. | ID    | Name              | Year | Author        | Size  |");
                    System.out.println("+-----+-------+-------------------+------+---------------+-------+");
                    int count = 0;
                    for(int i = 0; i < book.biggestSize().size(); i++) {
                        System.out.printf("|  %-3d", ++count);
                        book.biggestSize().get(i).showInfo();
                        System.out.println("\n+-----+-------+-------------------+------+---------------+-------+");
                    }
                    break;
                case 4:
                    System.out.print(">>> Please enter book's ID to search: ");
                    String searchID = input.nextLine();
                    System.out.print("Search Results: ");
                    if(book.searchBookObjectByID(searchID) != null) {
                        System.out.println("\n| No. | ID    | Name              | Year | Author        | Size  |");
                        System.out.println("+-----+-------+-------------------+------+---------------+-------+");
                        System.out.print("|  1  ");
                        book.searchBookObjectByID(searchID).showInfo();
                        System.out.println("\n+-----+-------+-------------------+------+---------------+-------+");
                    }
                    else
                        System.out.println("Not Found");
                    break;
                case 5:
                    book.sort();
                    book.printData();
                    break;
                case 6:
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.print("SEE YOU AGAIN!");
                    return;
                default:
                    System.out.print("The function of application must be from 1 to 6!");
                    return;
            }
            
        }
        while(true);
        
    }
    
}
