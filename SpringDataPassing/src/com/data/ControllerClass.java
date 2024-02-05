package com.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	@RequestMapping("/")
	public String indexPage() {
		return "index-page";
	}
	
	@RequestMapping("submitForm")
	public String dataReceived(HttpServletRequest req, Model m) {
		String formName = req.getParameter("name");
		formName = formName.toUpperCase();
		m.addAttribute("formName", formName);
		return "disp-data";
	}
}
