package com.gura.myproject.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.file.dto.FileDto;
import com.gura.myproject.file.service.FileService;

@Controller // 요청 처리를 하는 컨트롤러를 만들기 위한 어노테이션 (bean)
public class FileController {
	@Autowired // 의존 객체를 주입 받기위한 어노테이션
	private FileService fileService;
	
	// "/file/delete.do" 요청 처리
	@RequestMapping("/file/delete")
	public String delete(HttpServletRequest request, @RequestParam int num){
		//FileService 를 이용해서 파일을 삭제하는 작업을 한다.
		fileService.delete(request, num);
		//리다일렉트 이동
		return "redirect:/file/list.do";
	}
	
	// /file/insert.do 요청 처리
	/*
	 *  @RequestParam int num 에서 num 은 "file/download.do?num=x"
	 *  의 파라미터 명과 동일하게 변수명을 지정하면 된다.
	 */
	@RequestMapping("/file/download")
	public ModelAndView download(@RequestParam int num){
		ModelAndView mView = fileService.getData(num);
		/*
		 *  view 페키지에 DownloadView class 에 지정한
		 *  @Component("downloadView") 를 가리킨다.
		 */
		mView.setViewName("downloadView");
		return mView;
	}
	
	@RequestMapping(value="/file/insert")
	public String insert(HttpServletRequest request, @ModelAttribute FileDto dto){
		fileService.insert(request, dto);
		// 리다일렉트 이동
		return "redirect:/file/list.do";
	}
	
	
	// /file/insertform.do 요청 처리
	@RequestMapping(value="/file/insertform")
	public String insertform(){
		// /WEB-INF/views/file/insertform.jsp 로 forward 이동
		return "file/insertform";
	}
	
	// /file/list.do 요청 처리
	@RequestMapping("/file/list")
	public ModelAndView list(){
		//FileService 객체를 이용해서 파일 정보가 담긴 ModelAndView
		//객체를 받아온다.
		ModelAndView mView = fileService.list();
		//view 페이지의 정보를 설정하고 리턴해준다.
		mView.setViewName("file/list");
		return mView;
	}
}
