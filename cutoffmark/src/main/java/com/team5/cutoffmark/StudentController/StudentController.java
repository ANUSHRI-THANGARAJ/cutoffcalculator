package com.team5.cutoffmark.StudentController;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.team5.couoffmark.domain.student;



@Controller
public class StudentController {
	

    @GetMapping("/index")
    public String viewForm(Model model) {
        model.addAttribute("student", new student());
        return "index";
    }

    @PostMapping("/result")
    public String processForm(@ModelAttribute student student, BindingResult result, Model model) {
        model.addAttribute("student", student);
        return "result";
    }
}
