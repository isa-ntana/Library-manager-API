package br.com.zup.library_manager.Controller.author.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotBlank
    private int yearOfBirth;

    @NotBlank
    private int yearOfDeath;

    public AuthorDTO() {}

}
