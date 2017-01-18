package com.gura.myproject.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.myproject.cafe.dto.CafeDto;
import com.gura.myproject.file.dto.FileDto;

@Repository //Dao 를 bean 으로 만들때 사용하는 어노테이션
public class CafeDaoImpl implements CafeDao {

	// 의존객체
		@Autowired //의존객체 주입 받는 어노테이션
		private SqlSession session;
	
	@Override
	public void insert(CafeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CafeDto> getList() {
		List<CafeDto> list = session.selectList("file.getList");
		return list;
	}

	@Override
	public CafeDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
