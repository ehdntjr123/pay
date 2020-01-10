package com.project.dws;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DwsController {

	@Resource
	private DwsService service ;
	
		/*1번 뷰단 확인*/
		@RequestMapping(value ="/reserve.bc")
		public String reserve() { 
			
			return "dws/reserve";
		}
	
}
