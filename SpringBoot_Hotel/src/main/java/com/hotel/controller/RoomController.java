package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Room;
import com.hotel.service.RoomService;

@Controller
@RequestMapping("**.do")
public class RoomController {
	
	RoomService roomService;

	public RoomService getRoomService() {
		return roomService;
	}

	@Autowired
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@RequestMapping("showroom")
	public String  showRoom(Model model)
	{
		List<Room> list = roomService.findAll();
		model.addAttribute("list", list);
		return "room";
	}
	
	@RequestMapping("addroom")
	public String addRoom(Room room)
	{
		roomService.add(room);
		return "forward:showroom.do";
	}

	@RequestMapping("modifyroom")
	public String modifyRoom(Room room)
	{
		roomService.update(room);
		return "forward:showroom.do";
	}
	
	@RequestMapping("removeroom")
	public String removeRoom(int roomId)
	{
		roomService.delete(roomId);
		return "forward:showroom.do";
	}
	
}
