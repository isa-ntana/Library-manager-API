package br.com.zup.library_manager.Service.Mappers;

import br.com.zup.library_manager.Controller.book.dtos.BookDTO;
import br.com.zup.library_manager.Controller.book.dtos.BookUpdateDTO;
import br.com.zup.library_manager.Models.Book;

public class BookMapper {
    public static Book fromBookDTO(BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setDescription(bookDTO.getDescription());
        book.setAuthors(bookDTO.getAuthors());
        return book;
    }

    public static Book forBookUpdatedDTO(BookUpdateDTO bookUpdateDTO) {
        Book book = new Book();
        book.setTitle(bookUpdateDTO.getTitle());
        book.setDescription(bookUpdateDTO.getDescription());
        book.setAuthors(bookUpdateDTO.getAuthors());
        return book;
    }
}
