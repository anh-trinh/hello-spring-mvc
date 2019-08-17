package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Các lớp Controller sử dụng để điều khiển đường đi của ứng dụng.
@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
    public String hello(Model model) {
        
        model.addAttribute("greeting", "Hello Spring MVC");
        
        return "helloworld";
        
    }
}
