package com.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdresseController {


    @GetMapping("/Adresse")
    public String showFormular(Model model) {
		return "Adresse";
    }
    
    
}

