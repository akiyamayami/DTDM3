package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/")
    public String icsse2017(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	return "mainicsse17";
    }
    @RequestMapping("/editor")
    public String editor(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	model.addAttribute("message", "hello");
        return "editor";
    }
}
