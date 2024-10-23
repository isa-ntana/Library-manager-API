package br.com.zup.library_manager.Controller.author;

import br.com.zup.library_manager.Controller.author.dtos.AuthorDTO;
import br.com.zup.library_manager.Controller.author.dtos.AuthorUpdateDTO;
import br.com.zup.library_manager.Models.Author;
import br.com.zup.library_manager.Service.AuthorService;
import br.com.zup.library_manager.Service.Mappers.AuthorMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() { return authorService.showAuthors(); }

    @GetMapping("/{authorId}")
    public Author findAuthorById(@PathVariable Long authorId) { return authorService.findAuthorById(authorId); }

    @PostMapping
    public Author addAuthor(@RequestBody @Valid AuthorDTO authorDTO) {
        return authorService.saveAuthor(AuthorMapper.fromAuthorDTO(authorDTO));
    }

    @DeleteMapping("/{authorId}")
    public void deleteAuthorById(@PathVariable Long authorId) { authorService.deleteAuthor(authorId); }

    @PutMapping
    public Author updateAuthor(@RequestBody @Valid AuthorUpdateDTO authorUpdateDTO){
        return authorService.updateAuthor(AuthorMapper.fromAuthorUpdateDTO(authorUpdateDTO));
    }
}
