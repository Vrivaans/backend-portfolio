package com.portafolio.backend.Controllers;

import java.util.List;

import com.portafolio.backend.Models.EducacionModel;
import com.portafolio.backend.Models.ExperienciaModel;
import com.portafolio.backend.Models.HabilidadesModel;
import com.portafolio.backend.Models.UsuarioModel;
import com.portafolio.backend.Services.IUsuarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @Autowired
    private IUsuarioServices interfaceService;

    @GetMapping("/traer/usuario")
    public List<UsuarioModel> getUsers() {
        return interfaceService.getUsers();
    }

    @PostMapping("/crear/usuario")
    public String crearUsuario(@RequestBody UsuarioModel user) {
        if (interfaceService.findUser(1) == null) {
            interfaceService.savePersona(user);
            return "La persona fué creado correctamente";
        }
        return "La persona ya existe";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(int id) {
        interfaceService.deletePersona(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/personas/editar/{id}")
    public UsuarioModel editPersona(@PathVariable int id,
            @RequestParam("emailAddress") String newEmailAddress,
            @RequestParam("password") String newPassword,
            @RequestParam("name") String newName,
            @RequestParam("lastaName") String newLastName,
            @RequestParam("photoUrl") String newPhotoUrl,
            @RequestParam("dateOfBirth") String newDateOfBirth,

            @RequestParam("phoneNumber") int newPhoneNumber,
            @RequestParam("loginStatus") String newLoginStatus) {
        // Para buscar el usuario
        UsuarioModel user = interfaceService.findUser(id);
        user.setEmailAddress(newEmailAddress);
        user.setPassword(newPassword);
        user.setName(newName);
        user.setLastName(newLastName);
        user.setPhotoUrl(newPhotoUrl);
        user.setDateOfBirth(newDateOfBirth);

        user.setPhoneNumber(newPhoneNumber);

        return user;
    }

    // ------------------------------------------------------------------------------------------------
    // Sección del Controller para la experiencia

    @GetMapping("/traer/experiencias")
    public List<ExperienciaModel> getExperiencias() {
        return interfaceService.getExperiencias();
    }

    @PostMapping("/crear/experiencia")
    public String createExperience(@RequestBody ExperienciaModel experience) {
        interfaceService.addExperience(experience);
        return "Se creó correctamente la experiencia";
    }

    @DeleteMapping("/borrar/experiencia/{id}")
    public String removeExperience(@RequestBody int id) {
        interfaceService.removeExperience(id);
        return "La experiencia fué eliminada";
    }

    @PutMapping("/editar/experiencia/{id}")
    public ExperienciaModel editExperience(@PathVariable int id,
            @RequestParam("postition") String newPosition,
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

    @PostMapping("/crear/educacion")
    public String createEducacion(@RequestBody EducacionModel educacion) {
        interfaceService.addEducacion(educacion);
        return "Se creó correctamente";
    }

    @DeleteMapping("/borrar/educacion/{id}")
    public String removeEducacion(@RequestBody int id) {
        interfaceService.removeEducacion(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/editar/educacion{id}")
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

    @PostMapping("/crear/habilidad")
    public String createHabilidad(@RequestBody HabilidadesModel habilidad) {
        interfaceService.addHabilidades(habilidad);
        return "Se creó correctamente";
    }

    @DeleteMapping("/borrar/habilidad/{id}")
    public String removeHabilidad(@RequestBody int id) {
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
