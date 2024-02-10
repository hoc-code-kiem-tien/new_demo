/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tran Huu Tin - CE180262
 */
public class BookManagement {

    private final ArrayList<Book> list;
    Scanner sc = new Scanner(System.in);

    public BookManagement() {
        list = new ArrayList<>();
        list.add(new Book("B0005", "Javacript", 2000, "Peter", 19));
        list.add(new Book("B0003", "Java", 1999, "Jerry", 65));
        list.add(new Book("B0004", "Python", 1998, "John", 70));
        list.add(new Book("B0002", "C/C++", 2000, "Bobita", 90));
        list.add(new Book("B0001", "HTML", 2022, "Peter,John", 100));

    }

    public void addBook() {
        String Id, name, author;// khai bao biến 
        int size, year;// khai báo biến 

        int pos;
        do {// tạo vòng lập 
            Id = getString("Input ID: "); // nhập id qua hàm gétString
            pos = searchBookByID(Id);// gán pos bằng giá trị trả về của hàm search 
            if (pos != -1) {// nếu pos khác -1 thì cái id nhập đã tồn tại 
                System.out.println("This id exsit!");
            }
            if (Id.length() < 5 || Id.length() > 5) {//  độ dài id nhập vào lớn hơn 5 hoặc nhỏ hone 5 thi in ra 
                System.out.println("ID must be exactly 5 characters");
            }
        } while (pos != -1 || Id.length() > 5 || Id.length() < 5);// tạo cái vòng lập khi gặp các điều kiện bên  trong 
        do {
            name = getString("Input name: ");// nhập tên sách 
            if (name.isEmpty()) {// nếu name nhập trống thì in ra 
                System.out.println("Not Empty ");

            }
        } while (name.isEmpty()); //tạo vong lập khi gặp điều kiện bên trong 
        do {
            author = getString("Input authors: ");// nhập tên tác giả 
            if (author.isEmpty()) {// nếu trống  thì in ra 
                System.out.println("Not Empty");
            }

        } while (author.isEmpty());//tạo vòng lập khi gặp điều kiện bên trong  
        while (true) {// tạo ra vòng lập vô hạn 
            try {
                System.out.print("Input size (kilobyte):  ");
                String input = sc.nextLine();// nhập size 

                if (input.isEmpty()) {// nếu nhập trống thì in ra 
                    System.out.println("Size cannot be empty");
                    continue;// tiếp tục vòng lập khi gặp điều kiện trên
                }

                size = Integer.parseInt(input);// chuyển qua từ  chuối thành số 

                if (size > 0) {// nếu lớn hơn không thì dừng lại 
                    break;
                } else {
                    System.out.println("Size must be greater than 0");// nếu không thoả điều kiện trên thì in ra 
                }
            } catch (NumberFormatException e) {
            }
        }
        while (true) {// tạo vong lập voo hạn 
            try {
                System.out.print("Input year: ");
                String input = sc.nextLine();// nhập năm 

                if (input.isEmpty()) {// nếu nhập trống thì in ra 
                    System.out.println("Year cannot be empty");
                    continue;// tiếp tục vòng lâp khi gặp điều kiện bên trên 
                }

                year = Integer.parseInt(input);// chuyển chuỗi thành số 

                if (year >= 1900 && year <= 2024) {// nếu nhập năm trong khoảng 1900-2024 thì dừng vòng lập 
                    break;
                } else {
                    System.out.println("Year must be in range 1900 to 2024 and not empty");// nếu không thoả điều kiện thì in ra 
                }
            } catch (NumberFormatException e) {
            }
        }

        list.add(new Book(Id, name, year, author, size));// thêm vào danh sách 
        System.out.println("Ebook created and added to list of ebooks successful!");
    }

    public void showBook() {
        System.out.println("----------------------BOOK MANAGEMENT----------------------");
        System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
        System.out.println("| No. |ID     |Name             |Year |Author     |Size    |");
        int n = 1;
        for (Book sv : list) {// tạo vòng lập để in ra book trong list
            System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
            System.out.printf("|%5d", n);
            sv.getInfo();
            n++;
        }
        System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
    }

    public void sort() {
        List<Book> books = new ArrayList<>();
        Collections.sort(books, Comparator.comparingInt(Book::getSize));// sắp xếp tăng dần dần theo kích thước size 
    }

    public int searchBookByID(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {// nếu id nhập vào bằng với id trong danh sách thì in trả về vị trí đó 
                return i;
            }
        }
        return -1;// trả về -1 
    }

    public void searchBookByID() {
        String ID = getString("Ente search Book object ByID  to search: ");
        int pos = searchBookByID(ID);
        if (pos == -1) {// nếu -1 thì không tìm ra 
            System.out.println("Not found!");
        } else {
            System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
            System.out.println("| No. |ID     |Name             |Year |Author     |Size    |");
            int i = 1;
            for (Book sv : list) {
                System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
                System.out.printf("|%5d", i);
                list.get(pos).getInfo();
                i++;
                break;
            }
            System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
        }
    }

    public String getString(String id) {
        String str;
        while (true) {
            System.out.print(id);
            str = sc.nextLine();
            if (!str.isEmpty()) {
                return str;
            } else {
                System.out.println("Not Empty!");
            }
        }
    }

    public void biggestSize() {
        List<Book> best = new ArrayList<>();
        int max = list.get(0).getSize();// gán max = giá trị size đầu tiên 
        for (int i = 1; i < list.size(); i++) {// tạo vòng lập để đi so sánh 
            if (list.get(i).getSize() > max) {// nếu vị  trí nào lớn hơn mã thì gán nó bằng max
                max = list.get(i).getSize();
                best.clear();// xoá các book không thoã điều kiện 
            }
            if (max == list.get(i).getSize()) {// nếu nó bằng max thì thêm vào list best
            }
            best.add(list.get(i));

        }
        {

        }
        int i = 1;
        System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
        System.out.println("| No. |ID     |Name             |Year |Author     |Size    |");
        System.out.println("+-----+-------+-----------------+-----+-----------+--------+");
        for (Book mBook : best) {// tạo biến mBook để lấy ra các book trong list
            if (mBook.getSize() == max) {// nếu nó bằng mãx thì in ra 
                
                System.out.printf("|%5d", i);
                mBook.getInfo();
                i++;
            }
            System.out.println("+-----+-------+-----------------+-----+-----------+--------+");

        }
    }

}
