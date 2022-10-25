package com.portafolio.backend.Services;

import java.util.List;
import java.util.Optional;

import com.portafolio.backend.Models.DescripcionModel;
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

    // Consultar si existe la experiencia
    public boolean existsById(int id);

    public Optional<ExperienciaModel> getId(int id);

    // Añadir nueva experiencia
    public void addExperience(ExperienciaModel experience);

    // Para borrar una experiencia
    public void removeExperience(int id);

    // Para actualizar una experiencia
    public ExperienciaModel findExperiencie(int id);

    // ---------------------------------------------------------------------------------------------------------------
    // Acá quiero obtener los datos de la educación
    public List<EducacionModel> getEducacion();

    // Consultar si existe el Id en la tabla de educacion
    public boolean existsEducationById(int id);

    // Obtener Id de la educacion
    public Optional<EducacionModel> getEducationById(int id);

    // Añadir nueva educacion
    public void addEducacion(EducacionModel educacion);

    // Para borrar una educacion
    public void removeEducacion(int id);

    // Para actualizar una educacion
    public EducacionModel findEducacion(int id);

    // ---------------------------------------------------------------------------------------------------------------
    // Acá quiero obtener los datos de las habilidades
    public List<HabilidadesModel> getHabilidades();

    // Consultar si existe la habilidad
    public boolean existsHabilidadById(int id);

    // public Optional<EducacionModel> getEducationById(int id);
    public Optional<HabilidadesModel> getHabilidadById(int id);

    // Añadir nueva habilidad
    public void addHabilidades(HabilidadesModel habilidad);

    // Para borrar una habilidad
    public void removeHabilidad(int id);

    // Para actualizar una habilidad
    public HabilidadesModel findHabilidad(int id);

    // ---------------------------------------------------------------------------------------------------------------

    public void saveDescripcion(DescripcionModel descripcion);

    // public void addDescripcion(DescripcionModel descripcion);

    // Borrar los datos de un usuario
    public void deleteDescripcion(int id);

    public boolean existsDescriptById(int id);

    public Optional<DescripcionModel> getDescriptId(int id);

    // Por si se necesita
    public DescripcionModel findDescripcion(int id);

}
