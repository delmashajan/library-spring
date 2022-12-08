package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookDao extends CrudRepository<Book,Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `language`, `price`, `publisher`, `releasedyear`, `title`, `image` FROM `book` WHERE `title` LIKE %:title%",nativeQuery = true)
    List<Book> Searchbook (@Param("title") String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `book` WHERE `id`=:id",nativeQuery = true)
    void deleteBook(@Param("id") Integer id);
}
