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
public class EducacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nameCertification;
    private String expeditionDate;
    private String nameInstitution;
    private boolean enCurso;

    public EducacionModel() {
    }

    public EducacionModel(String nameCertification, String expeditionDate, String nameInstitution, boolean enCurso) {
        this.nameCertification = nameCertification;
        this.expeditionDate = expeditionDate;
        this.nameInstitution = nameInstitution;
        this.enCurso = enCurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCertification() {
        return nameCertification;
    }

    public void setNameCertification(String nameCertification) {
        this.nameCertification = nameCertification;
    }

    public String getExpeditionDate() {
        return expeditionDate;
    }

    public void setExpeditionDate(String expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public String getNameInstitution() {
        return nameInstitution;
    }

    public void setNameInstitution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    public Boolean getEnCurso() {
        return enCurso;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }
}
