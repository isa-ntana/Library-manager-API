package br.com.zup.library_manager.Controller.author.dtos;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

public class AuthorUpdateDTO {
    @Getter
    @Setter
    @NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @Setter
    @Getter
    @NotNull
    private int yearOfBirth;

    @Setter
    @Getter
    private int yearOfDeath;

    public AuthorUpdateDTO() {}

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank String lastName) {
        this.lastName = lastName;
    }

}
