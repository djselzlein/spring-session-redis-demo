package com.selzlein.djeison.springsessionredisdemo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(HttpServletRequest request, Model model) {
		Integer pageViews = 1;
		if (request.getSession().getAttribute("pageViews") != null) {
			pageViews += Integer.valueOf(request.getSession().getAttribute("pageViews").toString());
		}
		request.getSession().setAttribute("pageViews", pageViews);
		
		model.addAttribute("pageViews", pageViews);
		return "index";
	}

}
