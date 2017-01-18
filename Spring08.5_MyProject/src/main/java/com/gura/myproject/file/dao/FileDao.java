package com.gura.myproject.file.dao;

import java.util.List;

import com.gura.myproject.file.dto.FileDto;
// FileDaoImpl 클래스가 구현할 인터페이스 정의하기
public interface FileDao {
	public void insert(FileDto dto);	
	public List<FileDto> getList();
	public void delete(int num);
	public FileDto getData(int num);
}
