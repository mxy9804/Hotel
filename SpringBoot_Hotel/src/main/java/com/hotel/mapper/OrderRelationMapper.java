package com.hotel.mapper;

import java.util.List;
import java.util.Map;

public interface OrderRelationMapper {

	//查询订单，关联多表
	List<Map<String,Object>> selectOrder();
	
}
