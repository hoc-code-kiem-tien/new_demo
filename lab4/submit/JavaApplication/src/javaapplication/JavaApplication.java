/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Tin - CE180262
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManagement book = new BookManagement();
        int n;
        do {
            System.out.println("----- BOOK MANAGEMENT -----");
            System.out.println("1. Adds new book.");
            System.out.println("2. Shows all books");
            System.out.println("3. The biggest size book.");
            System.out.println("4. Search a book by ID");
            System.out.println("5. Sort the list of books ascending by size");
            System.out.println("6. Quit");
            System.out.print("Please select a function: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.showBook();
                    break;
                case 3:
                    book.biggestSize();
                    break;
                case 4:
                    book.searchBookByID();
                    break;
                case 5:
                    book.showBook();
                case 6:
                    System.out.println("THANK FOR USING OUR APPLICATION");
                    System.out.println("SEE YOU AGAIN!");
                    break;
                default:
                    System.out.println("The function of application must be from 1 to 6!");

            }
        } while (n != 6);
    }

}
