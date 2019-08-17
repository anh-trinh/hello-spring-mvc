package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyExample1Controller {

	// Chú thích một phương thức trong Controller với @ResponseBody,
	// Spring sẽ chuyển đổi giá trị trả về của phương thức thành String
	// và ghi vào Http response một cách tự động.
	// Trong trường hợp này bạn không cần một View cụ thể.
	// Một ví dụ đơn giản, method trả về kiểu String.
	@RequestMapping(value = "/saveResult")
	@ResponseBody
	public String authorInfo(Model model) {
		return "saved";
	}
	// http://localhost:8080/hello-spring-mvc/saveResult
}
