package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.UserDto;

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
	
	@RequestMapping(value="/fourth", method=RequestMethod.GET)
	public ModelAndView fourthRequest(
			@RequestParam("name") String n, 
			int age,
			double point){
		System.out.println(n + ", " + age + ", " + point);
		return null;
	}
	
	@RequestMapping(value="/fifth", method=RequestMethod.POST)
	public ModelAndView fifthRequest(
			UserDto user,
			String chk){
		System.out.println(user.getName() + ", " +
			user.getAge() + ", " + user.getPoint() + ", " +chk);
		return null;
	}
	
	@RequestMapping("/sixth")
	public ModelAndView sixthRequest(){
		ModelAndView view = 
				new ModelAndView("/WEB-INF/views/six.jsp");
		
		List<String> list = new ArrayList<String>();
		list.add("�����");
		list.add("¥���");
		list.add("«��");
		list.add("����");
		view.addObject("foodList", list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("f1", "���");
		map.put("f2", "��");
		map.put("f3", "����");
		view.addAllObjects(map);
		
		List listDay = new ArrayList();
		listDay.add("������");
		listDay.add("ȭ����");
		listDay.add("������");
		
		Map mapDay = new HashMap();
		mapDay.put("day", listDay);
		view.addAllObjects(mapDay);
		
		return view;
	}
}





