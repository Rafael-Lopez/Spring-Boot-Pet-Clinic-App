package com.lopez.rafael.sfgpetclinic.controllers;

import com.lopez.rafael.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Prefixing at the class level since everything in this controller will go to owners first
@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //If there was no prefix, it would be @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}
