package com.gura.myproject.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.cafe.service.CafeService;

@Controller  //요청 처리를 하는 컨트롤러를 만들기 위한 어노테이션
public class CafeController {
	
	@Autowired //의존 객체 주입
	private CafeService cafeServiceImpl;
	
	// cafe/list.do 요청처리
	@RequestMapping("/cafe/list")
	public ModelAndView list(){
		//CafeService 객체를 이용해서 파일 정보가 담긴 ModelAndView
		//객체를 받아온다.
		ModelAndView mView = cafeServiceImpl.list();
		//view 페이지의 정보를 설정하고 리턴해준다.
		mView.setViewName("cafe/list");
		return mView;
	}
	
	// cafe/private/insertform.do 요청처리
		@RequestMapping("/cafe/private/insertform")
		public String insertform(){
			
			return "cafe/private/insertform";
		}

}
