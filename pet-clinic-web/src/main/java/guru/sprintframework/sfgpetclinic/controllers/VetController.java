package guru.sprintframework.sfgpetclinic.controllers;

import guru.sprintframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets/index","/vets/index.html","/vets.html"})
    public String ListVets(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
