package com.hotel.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.service.OrderService;

@Controller
@RequestMapping("**.do")
public class OrderController {

	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@RequestMapping("showorders")
	public String showOrder(Model model){
		List<Map<String,Object>> list = orderService.findOrder();
		model.addAttribute("list", list);
		return "order";
	}
/*	
	@RequestMapping("showdetail")
	@ResponseBody
	public List<Map<String,Object>> showDetail(int oid){
		return orderService.findDetail(oid);
	}
	*/
	@RequestMapping("removeorder")
	public String removeOrder(int oid){
		orderService.doRemove(oid);
		return "forward:showorder.do";
	}
	
	
}
