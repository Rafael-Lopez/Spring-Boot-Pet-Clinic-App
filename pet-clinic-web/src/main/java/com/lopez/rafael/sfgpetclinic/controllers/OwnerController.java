package com.lopez.rafael.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Prefixing at the class level since everything in this controller will go to owners first
@RequestMapping("/owners")
@Controller
public class OwnerController {

    //If there was no prefix, it would be @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
