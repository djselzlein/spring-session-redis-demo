package com.selzlein.djeison.springsessionredisdemo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Autowired
	private SessionComponent sessionComponent;

	@GetMapping("/")
	public String index(HttpServletRequest request, Model model) {
		System.out.println("Scoped SessionComponent page views: " + sessionComponent.getPageViews());
		
		Integer pageViews = 1;
		if (request.getSession().getAttribute("pageViews") != null) {
			pageViews += (Integer) request.getSession().getAttribute("pageViews");
		}

		sessionComponent.setPageViews(pageViews);
		request.getSession().setAttribute("pageViews", pageViews);

		model.addAttribute("pageViews", pageViews);
		return "index";
	}

}
