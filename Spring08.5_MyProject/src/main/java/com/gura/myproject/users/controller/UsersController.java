package com.gura.myproject.users.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.users.dto.UsersDto;
import com.gura.myproject.users.service.UsersService;



@Controller
public class UsersController {
	
	@Autowired
	private UsersService UsersServiceImpl;
	
	@RequestMapping("users/signin.do")
	public ModelAndView signin(HttpServletRequest request, @ModelAttribute UsersDto dto){
		
		ModelAndView mView = UsersServiceImpl.isValid(request, dto);
		
		
		if(mView==null){
			
			return mView;
		}else{
			return mView;
		}
		
		
				
		
	}
	
	
}
