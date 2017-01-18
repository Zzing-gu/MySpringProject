package com.gura.myproject.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.myproject.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao {
	
	// 의존객체
	@Autowired //의존객체 주입 받는 어노테이션
	private SqlSession session;
	
	@Override
	public void insert(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(UsersDto dto) {
		UsersDto loginDto = session.selectOne("users.isValid", dto);
		if(loginDto == null){
			return false;
		}else{
			return true;
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
