package com.selzlein.djeison.springsessionredisdemo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@GetMapping("/")
	public @ResponseBody String index(HttpServletRequest request) {
		Integer pageViews = 1;
		if (request.getSession().getAttribute("pageViews") != null) {
			pageViews += Integer.valueOf(request.getSession().getAttribute("pageViews").toString());
		}
		request.getSession().setAttribute("pageViews", pageViews);
		return "Page views: " + pageViews;
	}

}
