package com.portafolio.backend.Controllers;

import java.util.List;

import com.portafolio.backend.Models.EducacionModel;
import com.portafolio.backend.Models.ExperienciaModel;
import com.portafolio.backend.Models.HabilidadesModel;
import com.portafolio.backend.Models.UsuarioModel;
import com.portafolio.backend.Security.Controller.Mensaje;
import com.portafolio.backend.Services.IUsuarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppRestController {

    @Autowired
    private IUsuarioServices interfaceService;

    @GetMapping("/traer/usuario")
    public UsuarioModel findUser() {
        return interfaceService.findUser((long) 1);
    }

    // @GetMapping("/traer/usuario")
    // public List<UsuarioModel> getUsers() {
    // return interfaceService.getUsers();
    // }

    @PostMapping("/crear/usuario")
    public String crearUsuario(@RequestBody UsuarioModel user) {
        if (interfaceService.findUser((long) 1) == null) {
            interfaceService.savePersona(user);
            return "La persona fué creado correctamente";
        }
        return "La persona ya existe";
    }

    @DeleteMapping("/usuario/borrar/{id}")
    public String deletePersona(Long id) {
        interfaceService.deletePersona(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/usuario/editar/{id}")
    public UsuarioModel editPersona(@PathVariable int id,
            @RequestParam("name") String newName,
            @RequestParam("lastaName") String newLastName,
            @RequestParam("photoUrl") String newPhotoUrl,
            @RequestParam("dateOfBirth") String newDateOfBirth) {
        // Para buscar el usuario
        UsuarioModel user = interfaceService.findUser((long) id);
        user.setName(newName);
        user.setLastName(newLastName);
        user.setPhotoUrl(newPhotoUrl);
        user.setDateOfBirth(newDateOfBirth);
        return user;
    }

    // ------------------------------------------------------------------------------------------------
    // Sección del Controller para la experiencia

    @GetMapping("/traer/experiencias")
    public List<ExperienciaModel> getExperiencias() {
        return interfaceService.getExperiencias();
    }

    /**
     * Esto es tomado de otro ejemplo para usarlo de guía
     * @GetMapping("/detail/{id}")
     * public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
     * if(!sExperiencia.existsById(id))
     * return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
     * Experiencia experiencia = sExperiencia.getOne(id).get();
     * return new ResponseEntity(experiencia, HttpStatus.OK);
     * }
     */
    @GetMapping("/detail/{id}")
    public ResponseEntity<ExperienciaModel> getById(@PathVariable("id") int id) {
        if (!interfaceService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El id seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        ExperienciaModel experience = interfaceService.getId(id).get();
        return new ResponseEntity(experience, HttpStatus.OK);
    }

    @PostMapping("/crear/experiencia")
    public String createExperience(@RequestBody ExperienciaModel experience) {
        interfaceService.addExperience(experience);
        return "Se creó correctamente la experiencia";
    }

    @DeleteMapping("/borrar/experiencia/{id}")
    public String removeExperience(@PathVariable("id") int id) {
        interfaceService.removeExperience(id);
        return "La experiencia fué eliminada";
    }

    @PutMapping("/editar/experiencia/{id}")
    public ExperienciaModel editExperience(@PathVariable int id,
            @RequestParam("position") String newPosition,
            @RequestParam("startDate") String newStartDate,
            @RequestParam("endDate") String newEndDate,
            @RequestParam("photoUrl") String newPhotoUrl) {

        ExperienciaModel experience = interfaceService.findExperiencie(id);
        experience.setPosition(newPosition);
        experience.setStartDate(newStartDate);
        experience.setEndDate(newEndDate);
        experience.setPhotoUrl(newPhotoUrl);

        return experience;

    }
    // ------------------------------------------------------------------------------------------------------------
    // Controller para la educacion

    @GetMapping("/traer/educacion")
    public List<EducacionModel> getEducacion() {
        return interfaceService.getEducacion();
    }

    @GetMapping("/educacion/detail/{id}")
    public ResponseEntity<EducacionModel> getEducationById(@PathVariable("id") int id) {
        if (!interfaceService.existsEducationById(id)) {
            return new ResponseEntity(new Mensaje("El id seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        EducacionModel educacion = interfaceService.getEducationById(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/crear/educacion")
    public String createEducacion(@RequestBody EducacionModel educacion) {
        interfaceService.addEducacion(educacion);
        return "Se creó correctamente";
    }

    @DeleteMapping("/borrar/educacion/{id}")
    public String removeEducacion(@PathVariable("id") int id) {
        interfaceService.removeEducacion(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/editar/educacion/{id}")
    public EducacionModel editEducacion(@PathVariable int id,
            @RequestParam("nameCertification") String newNameCertification,
            @RequestParam("expeditionDate") String newExpeditionDate,
            @RequestParam("nameInstitution") String newNameInstitution,
            @RequestParam("enCurso") Boolean newEnCurso) {
        EducacionModel educacion = interfaceService.findEducacion(id);
        educacion.setNameCertification(newNameCertification);
        educacion.setExpeditionDate(newExpeditionDate);
        educacion.setNameInstitution(newNameCertification);
        educacion.setEnCurso(newEnCurso);
        return educacion;

    }

    // ------------------------------------------------------------------------------------------------------------
    // Controller para las habilidades
    @GetMapping("/traer/habilidades")
    public List<HabilidadesModel> getHabilidades() {
        return interfaceService.getHabilidades();
    }

    // Espacio para hacer el GET del ID
    @GetMapping("/habilidad/detail/{id}")
    public ResponseEntity<HabilidadesModel> getHabilidadById(@PathVariable("id") int id) {
        if (!interfaceService.existsHabilidadById(id)) {
            return new ResponseEntity(new Mensaje("El id seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        HabilidadesModel habilidad = interfaceService.getHabilidadById(id).get();
        return new ResponseEntity(habilidad, HttpStatus.OK);
    }

    @PostMapping("/crear/habilidad")
    public String createHabilidad(@RequestBody HabilidadesModel habilidad) {
        interfaceService.addHabilidades(habilidad);
        return "Se creó correctamente";
    }

    @DeleteMapping("/borrar/habilidad/{id}")
    public String removeHabilidad(@PathVariable int id) {
        interfaceService.removeHabilidad(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/editar/habilidad/{id}")
    public HabilidadesModel editHabilidad(@PathVariable int id,
            @RequestParam("nameHability") String newNameHability,
            @RequestParam("iconHability") String newIconHability,
            @RequestParam("percentageHability") int newPercentageHability) {
        HabilidadesModel habilidad = interfaceService.findHabilidad(id);
        habilidad.setNameHability(newNameHability);
        habilidad.setIconHability(newIconHability);
        habilidad.setPercentageHability(newPercentageHability);
        return habilidad;
    }
}
