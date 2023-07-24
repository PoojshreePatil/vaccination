package com.assesment.vaccination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assesment.vaccination.Model.user;
import com.assesment.vaccination.Services.demoservice;

@Controller
public class UController {

    @Autowired
    demoservice serv;

    @GetMapping("/vaccine")
    public String show() {
        return "index";
    }

    @GetMapping("/tablepg")
    public String show1() {
        return "table";
    }

    // , Model m
    @PostMapping("/tablepg")
    public String welcomeString(@ModelAttribute user u, Model m) {
        System.out.println(u.toString());

        m.addAttribute("name", u.getName());
        m.addAttribute("contact", u.getContact());
        m.addAttribute("vaccinename", u.getVaccinename());

        serv.add(u);
        m.addAttribute("info", serv.show());
        return "table";

    }

}
