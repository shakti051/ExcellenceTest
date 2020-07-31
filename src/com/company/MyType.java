package com.company;

public class MyType {public String name;
    public String id;
    public String author;
    public String publisher;

    public MyType(String name, String id, String author, String publisher) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "MyType{" +
                "name=" + name + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}' + System.getProperty("line.separator");
    }
}
