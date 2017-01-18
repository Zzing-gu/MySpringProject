package com.gura.myproject.users.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.users.dao.UsersDao;
import com.gura.myproject.users.dto.UsersDto;

@Component
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao UsersDao;
	
	@Override
	public void insert(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelAndView isValid(HttpServletRequest request, UsersDto dto) {
		
		boolean isNull =  UsersDao.isValid(dto);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("redirect:/home.do");
		
		if(isNull){
			mView.addObject("isValid", isNull);
			request.getSession().setAttribute("id", dto.getId());
			return mView;
		}else{
			return mView;
		}
		
		
		
	}

	@Override
	public UsersDto getData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canUseId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
