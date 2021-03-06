package com.gura.myproject.file.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.file.dto.FileDto;
// FileServiceImpl 클래스가 구현할 인터페이스 정의하기
public interface FileService {
	public void insert(HttpServletRequest request, FileDto dto);
	public ModelAndView list();
	public void delete(HttpServletRequest request, int num);
	public ModelAndView getData(int num);
}
