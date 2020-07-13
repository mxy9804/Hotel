package com.hotel.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.entity.Room;
import com.hotel.entity.Type;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.hotel.service.TypeService;

@Controller
@RequestMapping("**.do")
public class OrderController {

	private OrderService orderService;
	private TypeService typeService;
	private RoomService roomService;
	public OrderService getOrderService() {
		return orderService;
	}
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	
	
	public RoomService getRoomService() {
		return roomService;
	}
	@Autowired
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@RequestMapping("showorders")
	public String showOrder(Model model){
		List<Map<String,Object>> list = orderService.findOrder();
		model.addAttribute("list", list);
		return "orders";
	}
/*	
	@RequestMapping("showtypes")
	@ResponseBody
	public List<Map<String,Object>> showDetail(int oid){
		return orderService.findDetail(oid);
	}
	*/
	@RequestMapping("removeorder")
	public String removeOrder(int oid){
		orderService.doRemove(oid);
		return "forward:showorders.do";
	}
	
	@RequestMapping("showtypes")
	@ResponseBody
	public List<Type> showTypes(){
		return typeService.findAvalTypes();
	}
	
	@RequestMapping("showrooms")
	@ResponseBody
	public List<Room> showRooms(String typeName){
		return roomService.findAllRooms(typeName);
	}
}
