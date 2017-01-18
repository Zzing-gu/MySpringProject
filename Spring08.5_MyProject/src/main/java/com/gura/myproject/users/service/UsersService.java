package com.gura.myproject.users.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.users.dto.UsersDto;

public interface UsersService {
	public void insert(UsersDto dto);
	public ModelAndView isValid(HttpServletRequest request, UsersDto dto);
	public UsersDto getData(String id);
	public void update(UsersDto dto);
	public void delete(String id);
	public boolean canUseId(String id);
}
