package br.com.zup.library_manager.Controller.book.dtos;

import br.com.zup.library_manager.Controller.author.dtos.AuthorDTO;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
public class BookDTO {
    @Getter
    @NotNull
    @NotBlank
    private String title;

    @Getter
    @NotBlank
    private String description;

    @Size(max=5, message="Um livro deve ter no máximo 5 autores")
    private List<AuthorDTO> authors;

    public BookDTO() {}

    public @Size(max = 5, message = "Um livro deve ter no máximo 5 autores") List<AuthorDTO> getAuthors() {
        return authors;
    }

}
