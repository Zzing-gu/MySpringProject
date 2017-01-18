package com.gura.myproject.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myproject.cafe.dao.CafeDao;
import com.gura.myproject.cafe.dto.CafeDto;
import com.gura.myproject.file.dao.FileDao;
import com.gura.myproject.file.dto.FileDto;

@Component // bean 으로 만들기위한 어노테이션
public class CafeServiceImpl implements CafeService {
	
	// 의존객체
		@Autowired // 의존 객체를 주입 받기 위한 어노테이션
		private CafeDao cafeDao;

	@Override
	public void insert(FileDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelAndView list() {
		// FileDao 객체를 이용해서 파일 목록을 얻어온다.
				List<CafeDto> list = cafeDao.getList();
				// ModelAndView 객체에 담아서 리턴해준다.
				ModelAndView mView = new ModelAndView();
				mView.addObject("cafeList", list);
				return mView;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelAndView getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
