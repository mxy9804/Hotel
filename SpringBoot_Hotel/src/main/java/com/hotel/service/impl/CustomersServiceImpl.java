package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.entity.Customer;
import com.hotel.entity.CustomerExample;
import com.hotel.mapper.CustomerMapper;
import com.hotel.service.CustomersService;

public class CustomersServiceImpl implements CustomersService {

	
	private CustomerMapper customerMapper;
	
	
	
	public CustomerMapper getCustomersMapper() {
		return customerMapper;
	}

	@Autowired
	public void setCustomersMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	
	@Override
	public void doAdd(Customer customer) {
		// TODO Auto-generated method stub
		customer.setCustomerStatus((byte) 1);
		customerMapper.insert(customer);
	}

	@Override
	public void doRemove(int customerId) {
		// TODO Auto-generated method stub
		Customer customer=customerMapper.selectByPrimaryKey(customerId);
		customer.setCustomerStatus((byte) 0);
		customerMapper.updateByPrimaryKey(customer);
	}

	@Override
	public void doModify(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.updateByPrimaryKey(customer);
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return customerMapper.selectByPrimaryKey(customerId);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		CustomerExample customerExample=new CustomerExample();
		customerExample.createCriteria().andCustomerStatusEqualTo((byte) 1);
		return customerMapper.selectByExample(customerExample);
	}

	@Override
	public List<Customer> findByCondition(CustomerExample customerExample) {
		// TODO Auto-generated method stub
		return customerMapper.selectByExample(customerExample);
	}


}
