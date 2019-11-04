package com.ogabek.springbatchetl.controller;

import com.ogabek.springbatchetl.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public String showAllStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "students-list";
    }
}
