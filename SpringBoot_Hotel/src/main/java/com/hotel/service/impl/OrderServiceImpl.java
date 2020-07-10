package com.hotel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.mapper.OrderMapper;
import com.hotel.mapper.OrderRelationMapper;
import com.hotel.service.OrderService;



@Service
public class OrderServiceImpl implements OrderService{
	
	private OrderMapper oMapper;
	private OrderRelationMapper orMapper;
	

	public OrderMapper getOMapper() {
		return oMapper;
	}
	@Autowired
	public void setOMapper(OrderMapper oMapper) {
		this.oMapper = oMapper;
	}

	public OrderRelationMapper getOrMapper() {
		return orMapper;
	}
	@Autowired
	public void setOrMapper(OrderRelationMapper orMapper) {
		this.orMapper = orMapper;
	}

	@Override
	public List<Map<String, Object>> findOrder() {
		return orMapper.selectOrder();
	}

	

	@Override
	public void doRemove(int oid) {
		//oMapper.deleteByPrimaryKey(oid);
		
	}

}
