package com.portafolio.backend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HabilidadesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nameHability;
    private String iconHability;
    private int percentageHability;

    public HabilidadesModel() {
    }

    public HabilidadesModel(String nameHability, String iconHability, int percentageHability) {
        this.nameHability = nameHability;
        this.iconHability = iconHability;
        this.percentageHability = percentageHability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHability() {
        return nameHability;
    }

    public void setNameHability(String nameHability) {
        this.nameHability = nameHability;
    }

    public String getIconHability() {
        return iconHability;
    }

    public void setIconHability(String iconHability) {
        this.iconHability = iconHability;
    }

    public int getPercentageHability() {
        return percentageHability;
    }

    public void setPercentageHability(int percentageHability) {
        this.percentageHability = percentageHability;
    }
}
