package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@RequestMapping("/second")
	public String handleRequest(){
		return "/WEB-INF/views/second.jsp";
	}
	
	@RequestMapping("/third")
	public ModelAndView thirdRequest(HttpServletRequest req){
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		ModelAndView mv = 
			new ModelAndView("/WEB-INF/views/third.jsp");
		//mv.setViewName("/WEB-INF/views/third.jsp");
		mv.addObject("param1", p1);
		mv.addObject("param2", p2);
		
		return mv;
	}
	
	@RequestMapping("/fourth")
	public ModelAndView fourthRequest(
			@RequestParam("name") String n, 
			int age,
			double point){
		System.out.println(n + ", " + age + ", " + point);
		return null;
	}
}





