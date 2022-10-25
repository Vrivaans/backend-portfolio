package com.portafolio.backend.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.portafolio.backend.Models.DescripcionModel;
import com.portafolio.backend.Models.EducacionModel;
import com.portafolio.backend.Models.ExperienciaModel;
import com.portafolio.backend.Models.HabilidadesModel;
import com.portafolio.backend.Models.UsuarioModel;
import com.portafolio.backend.Repository.DescripcionRepository;
import com.portafolio.backend.Repository.EducacionRepository;
import com.portafolio.backend.Repository.ExperienciaRepository;
import com.portafolio.backend.Repository.HabilidadesRepository;
import com.portafolio.backend.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    private UsuarioRepository userRepository;

    @Autowired
    private HabilidadesRepository habilidadRepository;

    @Autowired
    private EducacionRepository educacionRepository;

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Autowired
    private DescripcionRepository descripcionRepository;;

    // @Override
    // public List<UsuarioModel> getUsers() {
    // List<UsuarioModel> listaUsers = userRepository.findAll();
    // return listaUsers;
    // }

    @Override
    public void savePersona(UsuarioModel user) {
        userRepository.save(user);

    }

    @Override
    public void deletePersona(Long id) {
        userRepository.deleteById((long) id);

    }

    @Override
    public UsuarioModel findUser(Long id) {
        UsuarioModel user = userRepository.findById((long) id).orElse(null);
        return user;
    }
    // ------------------------------------------------------------------------------------------------------------

    @Override
    public List<ExperienciaModel> getExperiencias() {
        List<ExperienciaModel> listaExperiencie = experienciaRepository.findAll();
        return listaExperiencie;
    }

    public boolean existsById(int id) {
        return experienciaRepository.existsById(id);
    }

    public Optional<ExperienciaModel> getId(int id) {
        return experienciaRepository.findById(id);
    }

    @Override
    public void addExperience(ExperienciaModel experience) {
        experienciaRepository.save(experience);
    }

    @Override
    public void removeExperience(int id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public ExperienciaModel findExperiencie(int id) {
        ExperienciaModel experience = experienciaRepository.findById(id).orElse(null);
        return experience;
    }

    // ------------------------------------------------------------------------------------------------------------
    @Override
    public List<EducacionModel> getEducacion() {
        List<EducacionModel> listaEducacion = educacionRepository.findAll();
        return listaEducacion;
    }

    @Override
    public boolean existsEducationById(int id) {
        return educacionRepository.existsById(id);
    }

    public Optional<EducacionModel> getEducationById(int id) {
        return educacionRepository.findById(id);
    }

    @Override
    public void addEducacion(EducacionModel educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void removeEducacion(int id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public EducacionModel findEducacion(int id) {
        EducacionModel educacion = educacionRepository.findById(id).orElse(null);
        return educacion;
    }

    // ------------------------------------------------------------------------------------------------------------
    @Override
    public List<HabilidadesModel> getHabilidades() {
        List<HabilidadesModel> listaHabilidades = habilidadRepository.findAll();
        return listaHabilidades;
    }

    @Override
    public boolean existsHabilidadById(int id) {
        return habilidadRepository.existsById(id);
    }

    @Override
    public Optional<HabilidadesModel> getHabilidadById(int id) {
        return habilidadRepository.findById(id);
    }

    @Override
    public void addHabilidades(HabilidadesModel habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void removeHabilidad(int id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public HabilidadesModel findHabilidad(int id) {
        HabilidadesModel habilidad = habilidadRepository.findById(id).orElse(null);
        return habilidad;
    }

    // ------------------------------------------------------------------------------------------------------------

    @Override
    public void saveDescripcion(DescripcionModel descripcion) {
        descripcionRepository.save(descripcion);
    }

    @Override
    public void deleteDescripcion(int id) {
        descripcionRepository.deleteById(id);
    }

    @Override
    public boolean existsDescriptById(int id) {

        return descripcionRepository.existsById(id);
    }

    @Override
    public Optional<DescripcionModel> getDescriptId(int id) {

        return descripcionRepository.findById(id);
    }

    @Override
    public DescripcionModel findDescripcion(int id) {
        DescripcionModel descripcion = descripcionRepository.findById(id).orElse(null);
        return descripcion;
    }

}
