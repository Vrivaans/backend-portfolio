package com.portafolio.backend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class DescripcionModel {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 1;
    @NotNull
    @NotBlank
    private String descripcion;

    public DescripcionModel() {

    }

    public DescripcionModel(@NotNull String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
