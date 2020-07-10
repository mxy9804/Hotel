package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Staff;
import com.hotel.service.StaffService;

@Controller
@RequestMapping("**.do")
public class StaffController {
	
	StaffService staffService;

	public StaffService getStaffService() {
		return staffService;
	}

	@Autowired
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@RequestMapping("showstaff")
	public String showStaff(Model model)
	{
		List<Staff> list = staffService.findAll();
		model.addAttribute("list", list);
		return "staff";
	}
	
}
