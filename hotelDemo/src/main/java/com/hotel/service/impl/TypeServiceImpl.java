package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Type;
import com.hotel.entity.TypeExample;
import com.hotel.mapper.TypeMapper;
import com.hotel.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService{
	
	TypeMapper typeMapper;

	public TypeMapper getTypeMapper() {
		return typeMapper;
	}

	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

	@Override
	public List<Type> findAll() {
		return typeMapper.selectByExample(null);
	}

	@Override
	public List<Type> findByCondition(TypeExample te) {
		return typeMapper.selectByExample(te);
	}

	@Override
	public boolean add(Type type) {
		int i = typeMapper.insert(type);
		return i==1?true:false;
	}

	@Override
	public boolean delete(int typeId) {
		int i = typeMapper.deleteByPrimaryKey(typeId);
		return i==1?true:false;
	}

	@Override
	public boolean update(Type type) {
		int i = typeMapper.updateByPrimaryKeySelective(type);
		return i==1?true:false;
	}
	
	
}
