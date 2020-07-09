package com.hotel.service;

import java.util.List;

import com.hotel.entity.Customer;
import com.hotel.entity.CustomerExample;

public interface CustomersService {

	void doAdd(Customer customer);
	
	void doRemove(int customerId);
	
	void doModify(Customer customer);
	
	Customer findByCustomerId(int customerId);
	
	List<Customer> findAll();
	
	List<Customer> findByCondition(CustomerExample customerExample);
}
