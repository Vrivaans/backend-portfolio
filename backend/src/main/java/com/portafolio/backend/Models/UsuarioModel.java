package com.portafolio.backend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private String emailAddress;
    // private String password;
    @NotNull
    @Size(min = 1, max = 50, message = "Tenga en cuenta que la cantidad de caracteres debe ser entre 1 a 50")
    private String name;
    @NotNull
    @Size(min = 1, max = 50, message = "Tenga en cuenta que la cantidad de caracteres debe ser entre 1 a 50")
    private String lastName;
    @NotNull
    @Size(min = 1, max = 256, message = "Tenga en cuenta que la cantidad de caracteres debe ser entre 1 a 256")
    private String photoUrl;
    @NotNull
    @Size(min = 1, max = 15, message = "Tenga en cuenta que la cantidad de caracteres debe ser entre 1 a 15")
    private String dateOfBirth;
    // private int phoneNumber;
    // private Boolean loginStatus;

    public UsuarioModel() {
    }

    public UsuarioModel(String name, String lastName, String photoUrl,
            String dateOfBirth) {

        this.name = name;
        this.lastName = lastName;
        this.photoUrl = photoUrl;
        this.dateOfBirth = dateOfBirth;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
