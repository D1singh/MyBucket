package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.book.BookModel;

import java.util.List;

@Dao
public interface BookDao {

    @Insert
    void insertBook(BookModel bookModel);

    @Delete
    void
    deleteBook(BookModel bookModel);

    @Query("SELECT * FROM book_table")
    LiveData<List<BookModel>> getAllBook();
}
