package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Customer;
import com.hotel.service.CustomersService;

@Controller
@RequestMapping("**.do")
public class CustomersController {

	private CustomersService customersService;

	public CustomersService getCustomersService() {
		return customersService;
	}

	@Autowired
	public void setCustomersService(CustomersService customersService) {
		this.customersService = customersService;
	}
	
	@RequestMapping("showcustomers")
	public String showCustomers(Model model){
		List<Customer> list=customersService.findAll();
		model.addAttribute("list", list);
		return "customers";
	}
	
	@RequestMapping("addcustomer")
	public String addCustomer(Customer customer)
	{
		customersService.doAdd(customer);
		return "forward:showcustomers.do";
	}
	
	@RequestMapping("modifycustomer")
	public String modifyCustomer(Customer customer){
		customersService.doModify(customer);
		return "forward:showcustomers.do";
	}
	
	@RequestMapping("removecustomer")
	public String removeCustomer(int customerId){
		customersService.doRemove(customerId);
		return "forward:showcustomers.do";
	}
}
