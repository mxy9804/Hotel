package com.hotel.service;

import java.util.List;

import com.hotel.entity.Type;
import com.hotel.entity.TypeExample;

public interface TypeService {

	List<Type> findAll();
	List<Type> findByCondition(TypeExample te);
	boolean add(Type type);
	boolean delete(int typeId);
	boolean update(Type type);
	
}
