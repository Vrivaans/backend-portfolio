package com.portafolio.backend.Services;

import java.util.List;

import com.portafolio.backend.Models.EducacionModel;
import com.portafolio.backend.Models.ExperienciaModel;
import com.portafolio.backend.Models.HabilidadesModel;
import com.portafolio.backend.Models.UsuarioModel;

public interface IUsuarioServices {
    // Quiero obtener solo los datos de un usuario, el que use
    // public List<UsuarioModel> getUsers(Long id);

    // Para guardar los datos de un usuario
    public void savePersona(UsuarioModel user);

    // Borrar los datos de un usuario
    public void deletePersona(Long id);

    // Por si se necesita
    public UsuarioModel findUser(Long id);

    // --------------------------------------------------------------------------------------------------------------
    // Acá quiero obtener los datos del trabajo del usuario
    public List<ExperienciaModel> getExperiencias();

    // Añadir nueva experiencia
    public void addExperience(ExperienciaModel experience);

    // Para borrar una experiencia
    public void removeExperience(int id);

    // Para actualizar una experiencia
    public ExperienciaModel findExperiencie(int id);

    // ---------------------------------------------------------------------------------------------------------------
    // Acá quiero obtener los datos de la educación
    public List<EducacionModel> getEducacion();

    // Añadir nueva educacion
    public void addEducacion(EducacionModel educacion);

    // Para borrar una educacion
    public void removeEducacion(int id);

    // Para actualizar una educacion
    public EducacionModel findEducacion(int id);

    // ---------------------------------------------------------------------------------------------------------------
    // Acá quiero obtener los datos de las habilidades
    public List<HabilidadesModel> getHabilidades();

    // Añadir nueva habilidad
    public void addHabilidades(HabilidadesModel habilidad);

    // Para borrar una habilidad
    public void removeHabilidad(int id);

    // Para actualizar una habilidad
    public HabilidadesModel findHabilidad(int id);

    // ---------------------------------------------------------------------------------------------------------------
}
