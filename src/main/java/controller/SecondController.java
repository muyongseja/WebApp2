package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@RequestMapping("/second")
	public ModelAndView handleRequest(){
		return new ModelAndView("/WEB-INF/views/second.jsp");
	}
}
