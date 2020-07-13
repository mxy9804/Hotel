package com.hotel.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Admin;
import com.hotel.service.AdminService;

@Controller
@RequestMapping("**.do")
public class AdminController {
	AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@RequestMapping("showadmin")
	public String  showAdmin(Model model)
	{
		List<Admin> list = adminService.findAll();
		model.addAttribute("list", list);
		return "admin";
	}
	

	@RequestMapping("changeadminpassword")
	public String changeadminpassword(Admin admin, String newPassword,HttpServletRequest request)
	{
		boolean result = adminService.updatePassword(admin,newPassword);
		
		
		if(result)
		{
			request.setAttribute("msg", "密码修改成功！请重新登陆！");
			return "../../login";
		} else {
			request.setAttribute("msg", "密码修改失败！");
			return "forward:showadmin.do";
		}
		
	}
	
	

	

}
