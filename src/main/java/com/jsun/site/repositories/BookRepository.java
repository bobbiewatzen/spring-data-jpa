package com.jsun.site.repositories;

import com.jsun.site.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Book> {
	Book getOneByIsbn(String isbn);
}
