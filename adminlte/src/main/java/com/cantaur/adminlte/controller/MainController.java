package com.cantaur.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        return "home";
    }

    /**
     * data table 연습 - client side
     * @param model
     * @throws Exception
     */
    @GetMapping(value = "/table/client")
    public String selectTableByClient(Model model) {
        model.addAttribute("type", "CLIENT SIDE RENDERING");
        return "/tables/client";
    }
}
