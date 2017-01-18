package com.gura.myproject.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.file.dto.FileDto;

public interface CafeService {
	public void insert(FileDto dto);
	public ModelAndView list();
	public void delete(int num);
	public ModelAndView getData(int num);
}
