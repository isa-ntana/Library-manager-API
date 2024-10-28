package br.com.zup.library_manager.Controller.author.dtos;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotNull
    private int yearOfBirth;

    @NotNull
    private int yearOfDeath;

    public AuthorDTO() {}

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

    @NotNull
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(@NotNull int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @NotNull
    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(@NotNull int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }
}
