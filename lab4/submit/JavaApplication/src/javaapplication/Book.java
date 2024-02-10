/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Tran Huu Tin - CE180262
 */
public class Book {

    private String id;
    private String name;
    private int year;
    private String author;
    private int size;

    public Book(String iId, String iName, int iYear, String iAuthor, int iSize) {

        id = iId;
        name = iName;
        year = iYear;
        author = iAuthor;
        size = iSize;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void getInfo() {
        System.out.printf("|%-7s|%-17s|%5d|%-11s|%6sKB|\n",
                getId(), getName(), getYear(), getAuthor(), getSize());

    }
}
