package com.gura.myproject.cafe.dao;

import java.util.List;

import com.gura.myproject.cafe.dto.CafeDto;
import com.gura.myproject.file.dto.FileDto;

public interface CafeDao {
	public void insert(CafeDto dto);
	public void delete(int num);
	public List<CafeDto> getList();
	public CafeDto getData(int num);
}
