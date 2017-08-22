package com.example.litepal;

import org.litepal.crud.DataSupport;

/**
 * Created by ab131 on 2017/8/21.
 */

public class Book extends DataSupport{
    private int id,pages;
    private String author,name,press;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
