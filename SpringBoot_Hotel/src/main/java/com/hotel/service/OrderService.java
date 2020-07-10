package com.hotel.service;

import java.util.List;
import java.util.Map;

public interface OrderService {

	List<Map<String,Object>> findOrder();
	
	
	void doRemove(int oid);
}
