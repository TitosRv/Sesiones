package mx.utng.cbrv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.cbrv.model.entity.Teacher;
import mx.utng.cbrv.model.service.ITeacherService;

@Controller
@SessionAttributes("teacher")
public class TeacherController {
    //Inyectamos una dependencia del servicio
    @Autowired
    private ITeacherService teacherService;

    //Manda llamar este metodo en una peticion GET que contenga como final de la query string "", "/", "/list"
    @GetMapping({"teacher/list", "/teacher", "/teacher/"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Maestros");
    model.addAttribute("teachers", teacherService.list());
    return "tlist";
    }

    //Peticion que contenga al final de la url /form
    @GetMapping("/teacher/form")
    public String create (Model model){
        model.addAttribute("title", "Formulario de Maestros");
        model.addAttribute("teacher", new Teacher());
        return "tform";
    }

    @GetMapping("/teacher/form/{id}")
    public String update(@PathVariable Long id,Model model){
        Teacher teacher = null;
        if (id>0) {
            teacher = teacherService.getById(id);
        }else{
            return "redirect:tlist";
        }

        model.addAttribute("title", "Editar Maestro");
        model.addAttribute("teacher", teacher);
        return "tform";
    }


    @PostMapping ("/teacher/form")
    public String save(@Valid Teacher teacher, BindingResult br, Model model){

        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de maestros");
            return "tform";
        }

        teacherService.save(teacher);
        return "redirect:/teacher/list";
    }

    @GetMapping("/teacher/delete/{id}")
    public String delete (@PathVariable Long id, Model model){
        if (id>0) {
            teacherService.delete(id);
        }
        return "redirect:/teacher/list";
    }

}

