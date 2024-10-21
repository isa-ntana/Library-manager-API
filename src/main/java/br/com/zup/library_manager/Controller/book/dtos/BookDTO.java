package br.com.zup.library_manager.Controller.book.dtos;

import br.com.zup.library_manager.Controller.author.dtos.AuthorDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public class BookDTO {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    @Size(max=5, message="Um livro deve ter no máximo 5 autores")
    private List<AuthorDTO> authors;

    public BookDTO() {}

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

    public @NotBlank @Size(max = 5, message = "Um livro deve ter no máximo 5 autores") List<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        this.authors = authors;
    }
}
