package com.ensim.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ensim.tp5.model.ArticleRepository;


@Controller
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/Articles")
    public String showArticles(Model model) {
        model.addAttribute("allArticles", articleRepository.findAll());
        return "Articles";
    }
    
    
}

