package warakorn.framework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import warakorn.springframework.sfgpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String listOwner(Model model) {
        System.out.println(ownerService.findAll());
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
