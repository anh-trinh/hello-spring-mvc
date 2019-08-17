package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableExampleController {

	/**
	 * @PathVariable Example:
	 *
	 *               <pre>
	 *
	 *   //o7planning.org/web/fe/default/en/document/8108/spring-mvc-for-beginners
	 *  
	 *   or
	 *  
	 *   http://localhost:8080/hello-spring-mvc/web/fe/default/en/document/8108/spring-mvc-for-beginners
	 *
	 *               </pre>
	 */
	//Trong Spring MVC bạn có thể sử dụng @PathVariable 
	//để trói buộc một tham số của phương thức 
	//với một biến Template URI ( URI Template variable).
	//đoạn mapping bên dưới có thể xem như là một đoạn URI
	//nó nằm sau contextPath = /hello-spring-mvc/
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	public String documentView(Model model, @PathVariable(value = "sitePrefix") String sitePrefix,
			@PathVariable(value = "language") String language, @PathVariable(value = "id") Long id,
			@PathVariable(value = "naturalText") String naturalText) {

		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("language", language);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);

		String documentName = "Java tutorial for Beginners";
		if (id == 8108) {
			documentName = "Spring MVC for Beginners";
		}

		model.addAttribute("documentName", documentName);

		return "documentView";
	}
}
