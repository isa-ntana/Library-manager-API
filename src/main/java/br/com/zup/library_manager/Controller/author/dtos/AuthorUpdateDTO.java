package br.com.zup.library_manager.Controller.author.dtos;

import jakarta.validation.constraints.*;

public class AuthorUpdateDTO {
    @NotBlank
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotBlank
    private int yearOfBirth;

    @NotBlank
    private int yearOfDeath;

    public AuthorUpdateDTO() {}

    public @NotBlank Long getId() {
        return id;
    }

    public void setId(@NotBlank Long id) {
        this.id = id;
    }

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

    @NotBlank
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(@NotBlank int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @NotBlank
    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(@NotBlank int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }
}
