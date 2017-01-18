package com.gura.myproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/home")
	public ModelAndView home() {
		// request 에 담을 Model
		List<String> news = new ArrayList<String>();
		news.add("하나");
		news.add("두울");
		news.add("어쩌구.. 저쩌구...");
		
		
		ModelAndView mView = new ModelAndView();
		// 자동으로 리퀘스트에 담기는 것이다. addObject 하는 것은!
		//어떤 키값으로 어떤 데이터 타입이 들어있는지 꼭 확인하자
		mView.addObject("news", news);
		//view 페이지 정보 설정 (forward 이동)
		mView.setViewName("home");
		
		return mView;
	}
	
}
