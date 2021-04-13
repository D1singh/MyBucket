package com.deepak.mybucket.book;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "book_table")
public class BookModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String bookName;
    private String aboutBook;

    public BookModel(String bookName, String aboutBook) {
        this.bookName = bookName;
        this.aboutBook = aboutBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAboutBook() {
        return aboutBook;
    }

    public void setAboutBook(String aboutBook) {
        this.aboutBook = aboutBook;
    }
}
