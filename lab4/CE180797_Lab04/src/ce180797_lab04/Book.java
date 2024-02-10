/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180797_lab04;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Book {
    // Các thuộc tính
    private String ID;
    private String name;
    private int year;
    private String author;
    private int size;
    
    // Phương thức Book();
    public Book(String iID, String iName, int iYear, String iAuthor, int iSize) {
        ID = iID;
        name = iName;
        year = iYear;
        author = iAuthor;
        size = iSize;
    }
    
    // Getter
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }
    public int getSize() {
        return size;
    }
    
    // Setter

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    // Phương thức show các thuộc tính (theo format)
    public void showInfo() {
        System.out.printf("| %-5s | %-17s | %-4d | %-13s | %3dKB |", 
                getID(), getName(), getYear(), getAuthor(), getSize());
    }
    
}
