package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamExampleController {

	@RequestMapping("/user")
	public String userInfo(Model model, @RequestParam(value = "name", defaultValue = "Guest") String name) {
		// Sử dụng @RequestParam
		// để trói buộc (bind) một tham số của request
		// vào tham số của phương thức trong Controller của bạn.

		model.addAttribute("name", name);

		if ("admin".equals(name)) {
			model.addAttribute("email", "admin@example.com");
		} else {
			model.addAttribute("email", "Not set");
		}
		return "userInfo";
	}
	//http://localhost:8080/hello-spring-mvc/user?name=admin
}
