package br.com.zup.library_manager.Controller.book.dtos;

import br.com.zup.library_manager.Controller.author.dtos.AuthorDTO;

import java.util.List;

public class BookDTO {
    private Long id;
    private String title;
    private String description;
    private List<AuthorDTO> authors;

    public BookDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        this.authors = authors;
    }
}
